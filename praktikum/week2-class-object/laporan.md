# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: "Class dan Object"

## Identitas
- Nama  : Toufik Nur Hidayat
- NIM   : 240320567
- Kelas : 3DSRA

---

## Tujuan
Mahasiswa mampu cara membuat dan mengelola kelas serta objek dalam Java, menerapkan enkapsulasi melalui getter dan setter, mengatur struktur package, dan menambahkan method untuk mengelola data produk secara efisien.

---

## Dasar Teori
1. produk java Kelas Produk dibuat untuk merepresentasikan suatu produk pertanian dengan atribut seperti kode, nama, harga, dan stok, serta menggunakan getter dan setter untuk menerapkan enkapsulasi, yaitu melindungi data agar hanya dapat diakses melalui method tertentu.  
2. CreditBy.java  digunakan untuk menampilkan identitas mahasiswa, sekaligus melatih penggunaan package agar kode program lebih terorganisasi.  
3.  MainProduk.java  berfungsi sebagai kelas utama yang menjalankan program dengan membuat beberapa objek menampilkan data produk ke console, dan untuk menampilkan identitas pembuat program.


---

## Langkah Praktikum
(Tuliskan Langkah-langkah dalam prakrikum, contoh:
1. Langkah-langkah yang dilakukan (setup, coding, run).  
2. File/kode yang dibuat.  
3. Commit message yang digunakan.)

---

## Kode Program
(Tuliskan kode utama yang dibuat, contoh:  

```java
// Produk.java
 Produk p1 = new Produk("PPK", "Pupuk konsentrat", 250000, 100);
 System.out.println("Kode: " + p1.kode);

// CreditBy.java
public static void print(String nama, String nim) {
        System.out.println("\ncredit by: " + nama + " - " + nim);

// MainProduk.java
public static void main(String[] args) {
        Produk p1 = new Produk("BNH-001", "Benih Kacang IR64", 25000, 100);
        Produk p2 = new Produk("PPU-101", "Pupuk Urea 50kg", 350000, 40);
        Produk p3 = new Produk("PPK-501", "Pupuk Konsentrat 50", 250000, 15);
```
)
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
(
- Jelaskan bagaimana kode berjalan.  
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.  
- Kendala yang dihadapi dan cara mengatasinya.  
)
---

## Kesimpulan
(Tuliskan kesimpulan dari praktikum minggu ini.  
Contoh: *Dengan menggunakan class dan object, program menjadi lebih terstruktur dan mudah dikembangkan.*)

---

## Quiz
1)Mengapa atribut sebaiknya dideklarasikan sebagai private dalam class?
    Jawaban: Karena atribut yang bersifat private melindungi data agar tidak dapat diakses atau diubah langsung dari luar class, sehingga menjaga keamanan dan konsistensi data sesuai prinsip enkapsulasi.

2)Apa fungsi getter dan setter dalam enkapsulasi?
    Jawaban: Fungsi getter adalah untuk mengambil nilai dari atribut privat, sedangkan setter digunakan untuk mengubah nilainya secara terkontrol agar tetap sesuai aturan yang ditentukan dalam class.

3)Bagaimana cara class Produk mendukung pengembangan aplikasi POS yang lebih kompleks?
    Jawaban: Class Produk dapat menjadi dasar pengelolaan data barang pada aplikasi POS dengan menyimpan informasi produk, mengatur stok, dan memudahkan pengembangan fitur tambahan seperti transaksi penjualan, laporan inventori, dan manajemen harga.
