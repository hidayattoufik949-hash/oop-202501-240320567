// HelloFunctional.java
import java.util.*;
import java.util.stream.*;
public class HelloFunctional {
   public static void main(String[] args) {
      String nim = "240320567";
      String nama = "Toufik Nur Hidayat";
      List<String> produk = Arrays.asList("Kacang", "Kedelai", "Cabai");
      List<Integer> harga = Arrays.asList(50000, 45000, 120000);
      System.out.println("Hello World, I am " + nama + ", "+ nim);
      System.out.println("NIM: " + nim + ", Nama: " + nama);
      System.out.println("Daftar Produk:");
      IntStream.range(0, produk.size())
         .forEach(i -> System.out.println("- " + produk.get(i) + ": " + harga.get(i)));
      int total = harga.stream().mapToInt(Integer::intValue).sum();
      System.out.println("Total harga semua produk: " + total);
   }
}