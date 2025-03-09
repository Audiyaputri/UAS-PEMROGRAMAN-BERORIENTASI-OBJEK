/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kategoriumur;

/**
 *
 * @author Kelompok2
 */


import java.util.Scanner;

public class KategoriUmur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Nama : ");
        String name = scanner.nextLine();
        
        System.out.print("Masukan Umur : ");
        int umur = scanner.nextInt();
        
        String kategori;
        
        if (umur < 5) {
            kategori = "Balita";
        } else if (umur < 12) {
            kategori = "Anak";
        } else if (umur < 18) {
            kategori = "Remaja";
        } else if (umur < 40) {
            kategori = "Dewasa";
        } else if (umur < 60) {
            kategori = "Paruh Baya";
        } else if (umur > 60) {
        kategori = "Lanjut Usia";
        } else {
            kategori = "Tidak Valid";
        }
        

        System.out.println("Nama : " + name + " Umur : " + umur + " Kategori Usia : " + kategori);
        
        scanner.close();
        
       
    }
    
}
