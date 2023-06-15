// Membuat class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Buku("Cantik itu luka", "Eka Kurniawan", "1234567890123");
        Buku buku2 = new Buku("Daun Yang Jatuh Tak Pernah Membenci Angin", "Tere Liyee", "3210987654321");

        // Membuat objek anggota
        Anggota anggota1 = new Anggota("Lintang", "AD001");
        Anggota anggota2 = new Anggota("Anshori", "AD002");

        // Membuat objek peminjaman
        Peminjaman peminjaman1 = new Peminjaman(buku1, anggota1, "12 Oktober 2022");
        Peminjaman peminjaman2 = new Peminjaman(buku2, anggota2, "21 Januari 2023");

        // Mengatur tanggal pengembalian untuk peminjaman1
        peminjaman1.setTanggalKembali("04 Desember 2022");

        // Menampilkan DETAIL PEMINJAMAN
        System.out.println("\nDETAIL PEMINJAMAN 1:\n" + peminjaman1.getDetailPeminjaman());
        System.out.println("\nDETAIL PEMINJAMAN 2:\n" + peminjaman2.getDetailPeminjaman());
    }
}