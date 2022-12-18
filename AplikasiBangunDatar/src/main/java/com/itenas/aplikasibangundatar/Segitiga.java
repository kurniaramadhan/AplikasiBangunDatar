/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.aplikasibangundatar;

/**
 *
 * @author Kurnia R. Putra
 */
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }
    
    double sisiMiring() {
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }

    @Override
    double keliling() {
        return alas + tinggi + sisiMiring();
    }
}
