/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author m s i
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Putih");

        mobil1.startEngine();
        mobil2.startEngine();

        System.out.println("\n=== Kondisi Awal ===");
        mobil1.displayInfo();
        mobil2.displayInfo();

        System.out.println("\n=== Mengubah Warna Mobil ===");
        mobil1.setWarna("Merah");
        mobil2.setWarna("Abu-abu");

        System.out.println("\n=== Kondisi Setelah Perubahan Warna ===");
        mobil1.displayInfo();
        mobil2.displayInfo();
    }  
}
