package main.java.com.upb.agripos.model;

public class Alat extends Produk {
     private String material;
    private String nama;

    public Alat(String kode, String nama, double harga, int stok, String material) {
        super(kode, nama, harga, stok);
        this.material = material;
        this.nama = nama;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    // Provide direct access to name on subclass
    public String getNama() { return this.nama; }
}
