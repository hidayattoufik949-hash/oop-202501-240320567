package main.java.com.upb.agripos.model;

public class Alat extends Produk {
    private String tipe;

    public Alat(String kode, String nama, double harga, int stok, String tipe) {
        super(kode, nama, harga, stok);
        this.tipe = tipe;
    }

    @Override
    public String getInfo() {
        return "Alat : " + super.getInfo() + ", Tipe: " + tipe;
    }
    
}
