/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produk;


/**
 *
 * @author Amaymon
 */
import java.util.HashMap;

public class MainInventaris {

    static void cetak(HashMap<String, Produk> mapInventaris) {
        int total = 0;
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            System.out.println(p.getNama() + " - stok: " + p.getStok());
            total += p.getStok();
        }
        System.out.println("Total stok: " + total);
        System.out.println();
    }

    public static void main(String[] args) {
        HashMap<String, Produk> mapInventaris = new HashMap<>();

        mapInventaris.put("V01", new Produk("V01", "Jaket Denim 90an", 12));
        mapInventaris.put("V02", new Produk("V02", "Kemeja Flanel", 25));
        mapInventaris.put("V03", new Produk("V03", "Kaos Band Vintage", 30));
        mapInventaris.put("V04", new Produk("V04", "Celana Corduroy", 14));
        mapInventaris.put("V05", new Produk("V05", "Sweater Rajut", 8));
        mapInventaris.put("V06", new Produk("V06", "Celana Jeans", 16));
        mapInventaris.put("V07", new Produk("V07", "Jersy MU Vintage", 9));
        mapInventaris.put("V08", new Produk("V08", "Kaos Bootleg", 30));

        System.out.println("=== DAFTAR AWAL ===");
        cetak(mapInventaris);

        System.out.println("=== PROSES UPDATE ===");
        mapInventaris.get("V06").setStok(20);
        System.out.println("Celana Jeans ditambah menjadi 20");
        mapInventaris.get("V05").setStok(18);
        System.out.println("Stok Sweater Rajut ditambah menjadi 18");
        mapInventaris.get("V07").setStok(18);
        System.out.println("Stok Jersy MU Vintage ditambah menjadi 12");
        mapInventaris.get("V04").setStok(9);
        System.out.println("Stok Celana Corduroy dijual 5");
        
        
        mapInventaris.remove("V08");
        System.out.println("Stok Kaos Bootleg dihapus");
        System.out.println();
        

        System.out.println("=== DAFTAR AKHIR ===");
        cetak(mapInventaris);
    }
}
