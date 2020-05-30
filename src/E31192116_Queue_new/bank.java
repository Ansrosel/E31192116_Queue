/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E31192116_Queue_new;

import java.util.Scanner;

/**
 *
 * @author Anisha
 */
public class bank {

    int id;
    String nama, perlu;
    bank next;
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input() {
        System.out.print("Masukkan id : ");
        id = in.nextInt();
        System.out.print("Masukkan nama : ");
        nama = str.nextLine();
        System.out.print("Masukkan keperluan : ");
        perlu = str.nextLine();
        next = null;
    }

    public void read() {
        System.out.println("|| " + id + "\t|| " + nama + " \t|| " + perlu + " \t||");
    }

    public static void main(String[] args) {
        int menu = 0;
        linked que = new linked();
        while (menu != 4) {

            System.out.print("1.Enqueue\n2.Dequeue\n3.View\n4.Exit\n :");
            menu = in.nextInt();
            if (menu == 1) {
                que.enque();
            } else if (menu == 2) {
                que.deque();
            } else if (menu == 3) {
                que.view();
            } else if (menu == 4) {
                System.out.println("-keluar-");
            } else {
                System.out.println("-salah");
            }
            System.out.println("");
        }
    }
}

class linked {

    bank head;
    bank tail;

    public linked() {
        head = null;
        tail = null;
    }

    public void enque() {
        bank baru = new bank();
        baru.input();
        if (head == null) {
            head = baru;
        } else {
            tail.next = baru;
        }
        tail = baru;
    }

    public void deque() {
        if (head == null) {
            System.out.println("-kosong-");
        } else {
            System.out.println("Keluar Data Dengan Id : " + head.id);
            head = head.next;
        }
    }

    public void view() {
        if (head == null) {
            System.out.println("-kosong-");
        } else {
            System.out.println("|| Id\t|| Nama \t|| Keperluan \t||");
            for (bank a = head; a != null;
                    a = a.next) {
                a.read();
            }
        }
    }
}
