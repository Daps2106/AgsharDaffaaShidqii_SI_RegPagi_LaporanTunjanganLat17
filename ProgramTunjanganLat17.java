/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.percobaan1;

import java.util.Scanner;

/*
 * Nama : Agshar Daffaa Shidqii
 * NIM  : 23176030
 *Prodi : Sistem Informasi
*/
public class ProgramTunjanganLat17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Program Tunjangan =====");

        // Input gaji pokok
        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = input.nextInt();

        // Input status pernikahan
        System.out.print("Masukkan status pernikahan (menikah/belum): ");
        String statusPernikahan = input.next().toUpperCase();

        // Hitung tunjangan
        double tunjangan = 0;
        if (statusPernikahan.equals("MENIKAH")) {
            tunjangan = gajiPokok * 0.35;
        }

        // Tampilkan tunjangan
        System.out.println("\n==== Hasil Perhitungan ====");
        System.out.println("Gaji pokok anda = " + gajiPokok);
        System.out.println("Tunjangan karyawan adalah Rp" + tunjangan);
        System.out.println("Total Gaji = " + (gajiPokok + tunjangan));
        System.out.println("(Developed by Agshar Daffaa Shidqii)");
    }
}