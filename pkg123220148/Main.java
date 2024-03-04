/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123220148;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        CustomerNormal customernormal = new CustomerNormal("Kris", 20);
        customernormal.info();
        customernormal.masuk();
        customernormal.pesan();
        customernormal.bayar();
        
        CustomerSkena customerskena = new CustomerSkena("Gita", 21);
        customerskena.info();
        customerskena.masuk();
        customerskena.pesan();
        customerskena.bayar();
        
        CostumerSenja customersenja = new CostumerSenja("Berlian", 18);
        customersenja.info();
        customersenja.masuk();
        customersenja.pesan();
        customersenja.bayar();
    }
}
