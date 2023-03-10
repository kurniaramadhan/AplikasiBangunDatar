/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.aplikasibangundatar;

/**
 *
 * @author Kurnia R. Putra
 */
public class MainApp {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setNamaBangunDatar("Persegi");
        persegi.setSisi(5);
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setNamaBangunDatar("PersegiPanjang");
        persegiPanjang.setPanjang(4);
        persegiPanjang.setLebar(2);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
        
        Segitiga segitiga = new Segitiga();
        segitiga.setNamaBangunDatar("Segitiga");
        segitiga.setAlas(8);
        segitiga.setTinggi(6);
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setNamaBangunDatar("Lingkaran");
        lingkaran.setRadius(7);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
    }
}
