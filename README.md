# UAS_PraktikPBO

**File Buku.java :**
- Class Buku merepresentasikan buku dengan atribut judul, pengarang, dan isbn.
+ Memiliki konstruktor Buku untuk menginisialisasi objek Buku dengan nilai atribut yang diberikan.
* Terdapat getter (metode akses) untuk mengembalikan nilai dari masing-masing atribut.


**File Anggota.java :**
- Class Anggota merepresentasikan seorang anggota dengan atribut nama dan id.
+ Memiliki konstruktor Anggota untuk menginisialisasi objek Anggota dengan nilai atribut yang diberikan.
* Terdapat getter (metode akses) untuk mengembalikan nilai dari masing-masing atribut.


**File Peminjaman.java :**
- Class Peminjaman merepresentasikan peminjaman buku oleh seorang anggota.
+ Memiliki atribut buku (objek Buku), anggota (objek Anggota), tanggalPinjam, dan tanggalKembali.
* Terdapat konstruktor Peminjaman untuk menginisialisasi objek Peminjaman dengan buku, anggota, dan tanggalPinjam yang diberikan.
- TanggalKembali diatur awalnya menjadi null.
+ Terdapat metode setTanggalKembali untuk mengatur tanggal pengembalian.
* Terdapat metode getDetailPeminjaman untuk mengembalikan informasi lengkap tentang peminjaman, termasuk detail buku, anggota, tanggal - pinjam, dan tanggal kembali (jika sudah diatur).


**File Main.java :**
- Kelas Main digunakan untuk menjalankan program.
+ Di dalam metode main, objek-objek buku, anggota, dan peminjaman dibuat menggunakan konstruktor yang telah didefinisikan.
* Atribut-atribut objek diakses menggunakan getter yang telah didefinisikan.
- Metode setTanggalKembali dipanggil untuk mengatur tanggal pengembalian peminjaman.
+ Metode getDetailPeminjaman dipanggil untuk mendapatkan detail peminjaman dan menampilkannya di layar menggunakan System.out.println().
