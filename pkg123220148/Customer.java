/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220148;

/**
 *
 * @author USER
 */
public abstract class Customer {
   protected String nama;
   protected int umur;

    public Customer(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

abstract void info();
}