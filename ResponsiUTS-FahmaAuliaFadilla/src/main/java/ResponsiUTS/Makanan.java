/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author m s i
 */
public class Makanan extends Produk {
    private String tanggalKadaluarsa;
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Produk       : " + getNamaProduk());
        System.out.println("Harga             : Rp" + getHarga());
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}
