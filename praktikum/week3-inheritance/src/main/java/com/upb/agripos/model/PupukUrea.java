package main.java.com.upb.agripos.model;

public class PupukUrea extends Produk {
    private String jenis;
    private String nama;

    public PupukUrea(String kode, String nama, double harga, int stok, String jenis) {
        super(kode, nama, harga, stok);
        this.jenis = jenis;
        this.nama = nama;
    }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    // Provide direct access to name on subclass
    public String getNama() { return this.nama; }
}
