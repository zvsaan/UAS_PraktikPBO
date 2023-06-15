# UAS_PraktikPBO

1. File Buku.java:
    Merupakan kelas yang merepresentasikan buku.
    Memiliki atribut judul, pengarang, dan isbn.
    Memiliki konstruktor untuk menginisialisasi atribut buku.
    Memiliki getter untuk setiap atribut buku.

2. File Anggota.java:
    Merupakan kelas yang merepresentasikan anggota perpustakaan.
    Memiliki atribut nama dan id.
    Memiliki konstruktor untuk menginisialisasi atribut anggota.
    Memiliki getter untuk setiap atribut anggota.

3. File Peminjaman.java:
    Merupakan kelas yang merepresentasikan peminjaman buku oleh anggota.
    Memiliki atribut buku, anggota, tanggalPinjam, dan tanggalKembali.
    Memiliki konstruktor untuk menginisialisasi atribut peminjaman.
    Memiliki setter untuk atribut tanggalKembali.
    Memiliki metode getDetailPeminjaman() yang mengembalikan detail peminjaman dalam bentuk string.

4. File Main.java:
    Merupakan kelas utama yang digunakan untuk menjalankan program.
    Pada metode main(), beberapa objek buku, anggota, dan peminjaman dibuat.
    Contoh penggunaan objek-objek tersebut ditampilkan dengan memanggil metode getDetailPeminjaman() dari objek peminjaman.
