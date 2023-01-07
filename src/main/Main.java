/*

    //  Kelompok 7
    //  - K3521013	Astrid Nadia Alimah
    //  - K3521033	Hanizar Florian Sukma
    //  - K3521053	Muhammad Dzakwan 'Azmiy
    //  - K3521071	Zidna Fatha Nazhifa

 */
package main;

import java.util.Scanner;
import jenisRoti.Pizza;
import jenisRoti.RotiManis;
import jenisRoti.RotiTawar;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        RotiManis rm = new RotiManis();
        RotiTawar rt = new RotiTawar();
        Pizza p = new Pizza();

        while (true) {
            System.out.println("++================================++");
            System.out.println("||          ROTI PAK ROY          ||");
            System.out.println("++================================++");
            System.out.println("1. Roti Manis");
            System.out.println("2. Roti Tawar");
            System.out.println("3. Pizza");
            System.out.println("4. Keluar");
            System.out.println("------------------------------------");
            System.out.print("Pilih menu : ");
            try {
                int pilihMenu = input.nextInt();
                System.out.println("++================================++\n\n");
                if (pilihMenu == 1) {
                    System.out.println("++================================++");
                    System.out.println("||       ROTI MANIS PAK ROY       ||");
                    System.out.println("++================================++");
                    System.out.println("* Varian 1");
                    System.out.println("* Varian 2");
                    System.out.println("* Varian 3");
                    System.out.println("------------------------------------");
                    System.out.print("Pilih varian : ");
                    int varian = input.nextInt();
                    if (varian >= 1) {
                        if (varian <= 3) {
                            System.out.print("Jumlah pesanan : ");
                            int jumlah = input.nextInt();
                            rm.varian = varian;
                            rm.jumlah = jumlah;
                            rm.tampilHasil();
                        } else {
                            System.out.println("Tidak ada varian " + varian);
                            System.out.println("++================================++\n\n");
                        }
                    } else {
                        System.out.println("Tidak ada varian " + varian);
                        System.out.println("++================================++\n\n");
                    }
                } else if (pilihMenu == 2) {
                    System.out.println("++================================++");
                    System.out.println("||       ROTI TAWAR PAK ROY       ||");
                    System.out.println("++================================++");
                    System.out.println("* Varian 1");
                    System.out.println("* Varian 2");
                    System.out.println("------------------------------------");
                    System.out.print("Pilih varian : ");
                    int varian = input.nextInt();
                    if (varian >= 1) {
                        if (varian <= 2) {
                            System.out.print("Jumlah pesanan : ");
                            int jumlah = input.nextInt();
                            rt.varian = varian;
                            rt.jumlah = jumlah;
                            rt.tampilHasil();
                        } else {
                            System.out.println("Tidak ada varian " + varian);
                            System.out.println("++================================++\n\n");
                        }
                    } else {
                        System.out.println("Tidak ada varian " + varian);
                        System.out.println("++================================++\n\n");
                    }
                } else if (pilihMenu == 3) {
                    System.out.println("++================================++");
                    System.out.println("||          PIZZA PAK ROY         ||");
                    System.out.println("++================================++");
                    System.out.println("* Varian 1");
                    System.out.println("------------------------------------");
                    System.out.print("Pilih varian : ");
                    int varian = input.nextInt();
                    if (varian == 1) {
                        System.out.print("Jumlah pesanan : ");
                        int jumlah = input.nextInt();
                        p.varian = varian;
                        p.jumlah = jumlah;
                        p.tampilHasil();
                    } else {
                        System.out.println("Tidak ada varian " + varian);
                        System.out.println("++================================++\n\n");
                    }
                } else if (pilihMenu == 4) {
                    System.out.println("||            TERIMA KASIH        ||");
                    System.out.println("++================================++");

                    System.exit(0);
                } else {
                    System.out.println("Pilihanmu tidak dikethaui!");
                    System.out.println("Silakan pilih menu dengan benar!\n\n");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Mohon maaf, inputan anda keliru!");
                System.out.println("Program exit ...");
                System.out.println("++================================++");
                System.exit(0);
            }
        }
    }
}
