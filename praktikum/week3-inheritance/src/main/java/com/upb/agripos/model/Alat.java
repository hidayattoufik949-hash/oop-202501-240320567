package main.java.com.upb.agripos.model;

public class Alat extends Produk {
     private String material;

    public Alat(String kode, String nama, double harga, int stok, String material) {
        super(kode, nama, harga, stok);
        this.material = material;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
}
