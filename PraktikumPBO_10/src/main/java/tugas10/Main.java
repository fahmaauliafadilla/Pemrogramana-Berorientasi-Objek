/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas10;

/**
 *
 * @author m s i
 */
public class Main {
    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        double hargaElektronik = 5000000;
        double hargaMakanan = 20000;

        System.out.println("Harga Elektronik : " + hargaElektronik);
        System.out.println("Pajak Elektronik : " + elektronik.hitungPajak(hargaElektronik));
        System.out.println();
        System.out.println("Harga Makanan    : " + hargaMakanan);
        System.out.println("Pajak Makanan    : " + makanan.hitungPajak(hargaMakanan));
    }
}
