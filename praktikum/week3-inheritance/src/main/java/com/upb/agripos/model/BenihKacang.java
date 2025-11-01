package main.java.com.upb.agripos.model;

public class BenihKacang extends Produk {
    private String varietas;
    private String nama;

    public BenihKacang(String kode, String nama, double harga, int stok, String varietas) {
        super(kode, nama, harga, stok);
        this.varietas = varietas;
        this.nama = nama;
    }

    public String getVarietas() { return varietas; }
    public void setVarietas(String varietas) { this.varietas = varietas; }
    
    // Provide direct access to name on subclass to avoid cross-folder resolution issues
    public String getNama() { return this.nama; }

}
