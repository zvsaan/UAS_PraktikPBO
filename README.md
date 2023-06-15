# UAS_PraktikPBO

1. File Buku.java:
    Kelas Buku merupakan kelas yang merepresentasikan buku dengan atribut judul, pengarang, dan isbn.
    Terdapat konstruktor Buku yang digunakan untuk menginisialisasi objek Buku dengan nilai atribut yang diberikan.
    Terdapat getter (metode akses) untuk mengembalikan nilai dari masing-masing atribut.

2. File Anggota.java:
    Kelas Anggota merupakan kelas yang merepresentasikan seorang anggota dengan atribut nama dan id.
    Terdapat konstruktor Anggota yang digunakan untuk menginisialisasi objek Anggota dengan nilai atribut yang diberikan.
    Terdapat getter (metode akses) untuk mengembalikan nilai dari masing-masing atribut.

3. File Peminjaman.java:
    Kelas Peminjaman merupakan kelas yang merepresentasikan peminjaman buku oleh seorang anggota.
    Memiliki atribut buku (objek Buku), anggota (objek Anggota), tanggalPinjam, dan tanggalKembali.
    Terdapat konstruktor Peminjaman yang digunakan untuk menginisialisasi objek Peminjaman dengan buku, anggota, dan tanggalPinjam yang diberikan. TanggalKembali diatur awalnya menjadi null.
    Terdapat metode setTanggalKembali untuk mengatur tanggal pengembalian.
    Terdapat metode getDetailPeminjaman untuk mengembalikan informasi lengkap tentang peminjaman, termasuk detail buku, anggota, tanggal pinjam, dan tanggal kembali (jika sudah diatur).

4. File Main.java:
    Kelas Main merupakan kelas yang digunakan untuk menjalankan program.
    Di dalam metode main, objek-objek buku, anggota, dan peminjaman dibuat menggunakan konstruktor yang telah didefinisikan sebelumnya.
    Atribut-atribut objek diakses menggunakan getter yang telah didefinisikan.
    Metode setTanggalKembali dipanggil untuk mengatur tanggal pengembalian peminjaman.
    Metode getDetailPeminjaman dipanggil untuk mendapatkan detail peminjaman dan menampilkannya di layar menggunakan System.out.println().
