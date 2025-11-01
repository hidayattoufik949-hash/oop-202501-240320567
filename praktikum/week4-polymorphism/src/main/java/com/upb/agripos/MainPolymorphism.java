package main.java.com.upb.agripos;

import main.java.com.upb.agripos.model.*;
import main.java.com.upb.agripos.util.CreditBy;

public class MainPolymorphism {
    public static void main(String[] args) {
        Produk[] daftarProduk = {
            new BenihKacang("BNH-001", "Benih Kacang IR64", 25000, 100, "IR64"),
            new PupukUrea("PPU-101", "Pupuk Urea", 350000, 40, "Urea"),
            new Alat("ALT-011", "Sabit Padi", 90000, 15, "Baja")
        };

        for (Produk p : daftarProduk) {
            System.out.println(p.getInfo()); // Dynamic Binding
        }

        CreditBy.print("<240320567>", "<Toufik Nur Hidayat>");
    }
}