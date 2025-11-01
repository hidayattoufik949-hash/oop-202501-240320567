package main.java.com.upb.agripos;

import main.java.com.upb.agripos.model.Alat;
import main.java.com.upb.agripos.model.BenihKacang;
import main.java.com.upb.agripos.model.PupukUrea;

public class MainInheritance {
    public static void main(String[] args) {
        BenihKacang b = new BenihKacang("BNH-001", "Benih Kacang IR64", 25000, 100, "IR64");
        PupukUrea p = new PupukUrea("PPU-101", "Pupuk Urea", 350000, 40, "Urea");
        Alat a = new Alat("ALT-011", "Sabit Padi", 90000, 15, "Baja");

        System.out.println("Benih Kacang: " + b.getNama() + " Varietas: " + b.getVarietas());
        System.out.println("Pupuk Urea: " + p.getNama() + " Jenis: " + p.getJenis());
        System.out.println("Sabit Padi: " + a.getNama() + " Material: " + a.getMaterial());

    // Tampilkan identitas mahasiswa nama dan nim
    main.java.com.upb.agripos.util.CreditBy.print("Toufik Nur Hidayat", "240320567");
    }
}
