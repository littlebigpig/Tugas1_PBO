/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220148;

/**
 *
 * @author USER
 */
public class CostumerSenja extends Customer implements KegiatanCustomer{
    public CostumerSenja(String nama, int umur){
        super(nama, umur);
    }
    
    @Override
    public void info(){
        System.out.println("Info Customer:");
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
    }
    
    @Override
    public void masuk(){
        System.out.println(nama + " masuk ke cafe sore-sore.");
    }
    
    @Override
    public void pesan(){
        System.out.println(nama + " memesan kopi.");
    }
    
    @Override
    public void bayar(){
        System.out.println(nama + " membayar pesanannya pake receh.");
    }
    
}
