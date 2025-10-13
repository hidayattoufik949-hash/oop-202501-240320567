// HelloOOP.java
class Produk {
   String nama;
   int harga;
   Produk(String nama, int harga) {
      this.nama = nama;
      this.harga = harga;
   }
}

public class HelloOOP {
   public static void main(String[] args) {
      String nim = "240320567";
      String namaMhs = "Toufik Nur Hidayat";
      Produk[] daftar = {
         new Produk("Kedelai", 45000),
         new Produk("Kacang", 50000),
         new Produk("Cabai", 120000)
      };
      int total = 0;
      System.out.println("Hello World, I am " + namaMhs + ", "+ nim);
      System.out.println("NIM: " + nim + ", Nama: " + namaMhs);
      System.out.println("Daftar Produk:");
      for (Produk p : daftar) {
         System.out.println("- " + p.nama + ": " + p.harga);
         total += p.harga;
      }
      System.out.println("Total harga semua produk: " + total);
   }
}