package com.upb.agripos;

import com.upb.agripos.model.Product;

public class ProductTest {

    @Test
    public void testProductAttributes() {
        // Menampilkan pesan identitas saat pengujian dijalankan
        System.out.println("Hello, I am [Toufik Nur Hidayat] - [240320567] (Week10)");

        Product p = new Product("P001", "Pupuk Jagung");
        assertEquals("P001", p.getCode());
        assertEquals("Pupuk Jagung", p.getName());

        System.out.println("Pengujian Atribut Produk Berhasil!");
    }

    private void assertEquals(String string, String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}