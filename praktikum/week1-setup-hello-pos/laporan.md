# Laporan Praktikum Minggu 1
Topik: Hello POS (OOP, Procedural, dan Functional)

## Identitas
- Nama  : Toufik Nur Hidayat
- NIM   : 240320567
- Kelas : 3DSRA

---

## Tujuan
Mahasiswa mampu memahami konsep dasar dari ketiga paragdigma pemrograman tersebut.
Mahasiswa mampu menganalisis dalam memilih paragdigma pemrograman yang tepat untuk suatu masalah.

---

## Dasar Teori 
1. OOP (Object Oriented Programming) Objek dapat berinteraksi dengan objek lain melalui pesan.
2. Procedural menekankan pada urutan intruksi yang harus dijalankan oleh komputer.
3. Funcional lebih pada definisi hasil yang diinginkan, bukan urutan intruksi.

---

## Langkah Praktikum
1. setup
   menginstal JDK supanya bisa menjalankan program Java di vscode.
   coding 
   Membuat tiga file .java sesuai paragdigma
   HelloOOP.java
   HelloProcedural.java
   HelloFunctional.java
   run : menjalankan coding dengan output
   commit dan push
---

## Kode Program
(Tuliskan kode utama yang dibuat, contoh:  

```java
// OOP
 Produk[] daftar = {
         new Produk("Kedelai", 45000),
         new Produk("Kacang", 50000),
         new Produk("Cabai", 120000)
      };

// Prosedural
String nim = "240320567";
      String nama = "Toufik Nur Hidayat";
      System.out.println("Hello World, I am "+ nama + ", "+ nim);

// Fungsional
List<String> produk = Arrays.asList("Kacang", "Kedelai", "Cabai");
      List<Integer> harga = Arrays.asList(50000, 45000, 120000);
```
)
---

## Hasil Eksekusi
[Screeshots hasil Procedural]
( !(Screenshots/Procedural.png))

[Screeshots hasil HelloOOP]
( !(Screenshots/HelloOOP.png))

[Screeshots hasil Functional]
( !(Screenshots/Functional.png))
---

## Analisis
(
- Jelaskan bagaimana kode berjalan.
Pada program prosedural, kode jalan langsung dari main lalu print nama dan NIM.
Pada OOP, saya buat objek mahasiswa, isi data, lalu panggil method untuk menampilkan hasil.
Pada fungsional, saya pakai lambda (BiConsumer) untuk mendefinisikan fungsi, lalu jalankan dengan accept().

- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya?
Karena ini minggu pertama, belum ada perbedaan dengan minggu sebelumnya. Minggu ini langsung belajar dasar tentang paradigma pemrograman (prosedural, OOP, dan fungsional).

- Kendala yang dihadapi dan cara mengatasinya. 
Sempat bingung di bagian OOP (constructor, method) dan fungsional (lambda). Saya atasi dengan melihat contoh dan mencoba ulang sampai berhasil.
)
---

## Kesimpulan
Dengan demikian, praktikum ini menunjukan setiap paragdigma pemrograman memiliki kelebihan dan kekurangan, dan pemilihan paragdigma yang tepat  dapat membantu meningkatkan efisiensi dan efektifitas pengembangan perangkat lunak.

---

## Quiz
(1.  Apakah OOP selalu lebih baik dari prosedural?  
   *Jawaban:*Tidak SELALU, antara OOP dan Procedural tergantung pada kebutuhan proyek,
     kompleksitas, dan preferensi dari TIM.

2. Kapan functional programming lebih cocok digunakan dibanding OOP atau prosedural? 
   *Jawaban:*Functional lebih cocok digunakan saat pengolahan data yang melibatkan tranformasi dan
   agregasi data. Seperti pengolahan data besar (Big Data).

3. Bagaimana paradigma (prosedural, OOP, fungsional) memengaruhi maintainability dan scalability aplikasi? 
   **Jawaban:* 
   -OOP sangat cocok untuk aplikasi yang kompleks dan memerlukan moduralitas, reusability, dan abstraksi.
   -Procedural sangat cocok  untuk aplikasi sederhana dan memerlukan kinerja yang tinggi.
   -Functional lebih ke aplikasi yang memerlukan komputasi paralel dan kode yang deklaratif.

4. Mengapa OOP lebih cocok untuk mengembangkan aplikasi POS dibanding prosedural?
   **Jawaban:*OOP memiliki kemampuan Modularitas, Reusability, Kemudahan perawatan, dan Pengeloalaan kompleksitas, dalam konteks aplikasi POS, OPP dapat digunakan untuk membuat objek seperti produk, pelanggan, transaksi, pembayaran dll. Dengan menggunakan OOP, kita dapat membuat aplikasi POS yang lebih fleksibel, scalable, dan mudah dirawat.

5. Bagaimana paradigma fungsional dapat membantu mengurangi kode berulang (*boilerplate code*)?
  **Jawaban:*Ada beberapa cara yang pertama sebagai;
   -first-class citizen yaitu sebagai objek yang dapat diteruskan sebagai argumen ke fungsi lain, disimpan dalam variabel, atau dikembalikan sebagai hasil fungsi lain.
   -Higher order function Fungsi yang dapat menerima fungsi lain sebagai argumen atau mengembalikan fungsi lain sebagai hasil ini dapat membantu mengurangi kode berulang.
   -Immutable data atau data yang dianggap tidak dapat diubah, ini membuat fungsi yang lebih predictable dan dapat digunakan kembali tanpa khwatir tentang efek samping.  )