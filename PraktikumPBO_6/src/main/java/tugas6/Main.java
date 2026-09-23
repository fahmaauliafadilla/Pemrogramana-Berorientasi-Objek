/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author m s i
 */
public class Main {

    public static void main(String[] args) {
        Buku buku = new Buku("Buku Pemrograman Java", 100000);
        Elektronik elektronik = new Elektronik("Keyboard", 300000);
        Pakaian pakaian = new Pakaian("Jaket", 200000);
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);
        keranjang.tampilkanProduk();
        System.out.println("Total harga setelah diskon : Rp"
                + keranjang.hitungTotal());
    }
}
