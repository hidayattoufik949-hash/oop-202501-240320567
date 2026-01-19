# Laporan Praktikum Minggu 10
Topik: Pattern Testing

## Identitas
- Nama  : Toufik Nur Hidayat
- NIM   : 240320567
- Kelas : 3DSRA

---

## Tujuan
Mahasiswa mampu menjelaskan konsep dasar design pattern.
Mahasiswa mampu menerapkan Model–View–Controller (MVC) pada aplikasi sederhana.
Mahasiswa mampu membuat dan menjalankan unit testing menggunakan JUnit.
Mahasiswa mampu menganalisis manfaat design pattern dan unit testing terhadap kualitas perangkat lunak.

---

## Dasar Teori
Design Pattern adalah solusi desain yang telah terbukti efektif untuk menyelesaikan masalah umum dalam pengembangan perangkat lunak.
Singleton Pattern memastikan suatu class hanya memiliki satu instance selama aplikasi berjalan.
MVC (Model–View–Controller) memisahkan logika data, tampilan, dan pengendali aplikasi.
Unit Testing digunakan untuk memastikan setiap unit kode berjalan sesuai harapan.

---

## Langkah Praktikum
> Membuat struktur project week10-pattern-testing.

> Mengimplementasikan Singleton Pattern pada class DatabaseConnection.

> Membuat struktur MVC sederhana untuk fitur Product.

> Membuat Model, View, dan Controller.

> Mengintegrasikan MVC pada class AppMVC.

> Membuat unit test menggunakan JUnit.

> Menjalankan aplikasi dan unit test.

> Commit dan push dengan format:

---

## Kode Program
  
1. Database
```java
 private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database Connected");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
--
2. Product Controller
package com.upb.agripos.controller;

import com.upb.agripos.model.Product;
import com.upb.agripos.view.ConsoleView;

public class ProductController {
    private final Product model;
    private final ConsoleView view;

    public ProductController(Product model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void showProduct() {
        view.showMessage("Produk: " + model.getCode() + " - " + model.getName());
    }
}
--
3. Product
  public Product(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
}
---
4. Console View
public class ConsoleView {
    public void showMessage(String message) {
        System.out.println(message);
    }
}
---
5. Product Test
package com.upb.agripos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.upb.agripos.model.Product;

public class ProductTest {

    @Test
    public void testProductName() {
        Product p = new Product("P001", "Pupuk Jagung");
        assertEquals("Pupuk Jagung", p.getName());
    }
}
---
6. AppMVc
public class AppMVC {

    public static void main(String[] args) {

        System.out.println("Hello, I am [Toufik Nur Hidayat]-[2400320567] (Week10)");

        // Uji Singleton
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println("Apakah instance sama? " + (db1 == db2));

        // MVC
        Product product = new Product("P001", "Pupuk Kimia");
        ConsoleView view = new ConsoleView();
        ProductController controller =
                new ProductController(product, view);

        controller.showProduct();
    }
}
---
##Hasil Eksekusi


## Analisis
Penerapan Singleton Pattern memastikan hanya ada satu instance objek DatabaseConnection.
Pola MVC membuat kode lebih rapi dan memisahkan tanggung jawab antar class.
Unit testing membantu memastikan method berjalan sesuai harapan.
Dibandingkan minggu sebelumnya, praktikum ini lebih fokus pada struktur desain aplikasi dan kualitas kode.
---

## Kesimpulan
Design pattern meningkatkan kualitas dan maintainability kode.
Singleton Pattern cocok digunakan untuk resource global seperti koneksi database.
MVC mempermudah pengembangan dan pengujian aplikasi.
Unit testing penting untuk mencegah bug sejak tahap awal pengembangan.

---

## Quiz
1. Mengapa constructor pada Singleton harus bersifat private?
Jawaban:
Agar objek tidak dapat dibuat langsung dari luar class dan hanya bisa diakses melalui method getInstance().

2. Jelaskan manfaat pemisahan Model, View, dan Controller.
Jawaban:
Agar kode lebih terstruktur, mudah dipelihara, dan setiap bagian memiliki tanggung jawab yang jelas.

3. Apa peran unit testing dalam menjaga kualitas perangkat lunak?
Jawaban:
Untuk memastikan setiap unit kode berjalan sesuai harapan dan mendeteksi bug lebih awal.

4. Apa risiko jika Singleton tidak diimplementasikan dengan benar?
Jawaban:
Dapat menyebabkan lebih dari satu instance terbentuk sehingga menimbulkan inkonsistensi data
