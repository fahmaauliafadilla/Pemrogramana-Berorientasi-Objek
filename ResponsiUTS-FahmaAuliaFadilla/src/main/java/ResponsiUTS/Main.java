/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author m s i
 */
public class Main {
    public static void main(String[] args) {
        // ===== DATA PRODUK =====
        Produk produk1 = new Produk("Laptop", 7500000);
        Produk produk2 = new Produk("Susu", 20000);
        Produk produk3 = new Elektronik("Smartphone", 4500000, 2);
        Produk produk4 = new Makanan("Roti", 15000, "30-12-2026");
        System.out.println("===== DATA PRODUK =====");
        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();
        System.out.println();
        produk3.tampilkanInfo();
        System.out.println();
        produk4.tampilkanInfo();
        System.out.println();
        
        // ===== DATA PEGAWAI =====
       Pegawai pegawai1 = new PegawaiTetap(
                "Fahma", 6000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak(
                "Aulia", 4500000, 12);
        System.out.println("===== DATA PEGAWAI =====");
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
