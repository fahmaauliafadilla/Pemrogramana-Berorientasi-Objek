/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author m s i
 */
class Hewan {

    public void bersuara() {
        System.out.println("Hewan bersuara");
    }

    // Overloading 1
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }

    // Overloading 2
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}    