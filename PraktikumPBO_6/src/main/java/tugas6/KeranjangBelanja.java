/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author m s i
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {

    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotal() {
        double total = 0;

        for (Produk produk : daftarProduk) {
            total += produk.hargaSetelahDiskon();
        }

        return total;
    }

    public void tampilkanProduk() {
        System.out.println("=== DAFTAR PRODUK ===");

        for (Produk produk : daftarProduk) {
            System.out.println("Nama : " + produk.getNama());
            System.out.println("Harga : Rp" + produk.getHarga());
            System.out.println("Diskon : Rp" + produk.hitungDiskon());
            System.out.println("Harga setelah diskon : Rp"
                    + produk.hargaSetelahDiskon());
            System.out.println("-------------------------");
        }
    }
}