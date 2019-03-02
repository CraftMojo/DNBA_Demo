/*
Program Tebak Angka
By: Yanto
Date: 02 03 2019
 */

package com.craftmojo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //validasi
        //bilangan positif, dan hanya angka


        //input: angka random, tebakan, jumlah
        int random, jumlah, tebak;
        random = ((int) Math.random() * 100);
        //beri user inputan dari 0 -100
        System.out.println("Tebaklah angka dari 0 - 100");

        Scanner masukan = new Scanner(System.in);
        jumlah = 0;

        //proses
        do {
            jumlah++;
            System.out.println("Masukkan tebkan Anda: ");
            tebak = masukan.nextInt();

            if (tebak > random) {
                System.out.println("tebakan anda terlalu besar");

            } else if (tebak < random) {
                System.out.println("tebakan anda terlalu kecil");
            } else {
                //output
                System.out.println("tebakan anda benar! Setelah " + jumlah + "Kali menebak");

            }
        } while (tebak != random);
    }
}
