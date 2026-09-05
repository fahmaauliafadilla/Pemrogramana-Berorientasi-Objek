/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author m s i
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Xavier", 3);
        kucing.suara();
        kucing.info();
        Hewan anjing = new Hewan("Puppy", 2);
        anjing.berlari();
        anjing.info();
    }   
}
