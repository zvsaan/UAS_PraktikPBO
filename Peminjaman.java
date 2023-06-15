// Membuat class Peminjaman
public class Peminjaman {
    // Atribut class Peminjaman
    private Buku buku;
    private Anggota anggota;
    private String tanggalPinjam;
    private String tanggalKembali;

    // Konstruktor class Peminjaman
    public Peminjaman(Buku buku, Anggota anggota, String tanggalPinjam) {
        this.buku = buku;
        this.anggota = anggota;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = null;
    }

    // Setter untuk atribut tanggalKembali
    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    // Metode untuk menampilkan detail peminjaman
    //ketika tanggalkembali nya null/kosong maka nanti yang akan diprint "Belum dikembalikan"
    public String getDetailPeminjaman() {
        return "Anggota\t\t: " + anggota.getNama() + " (" + anggota.getId() + ")\n" +
               "Buku\t\t: " + buku.getJudul() + " (" + buku.getIsbn() + ")\n" +
               "Tanggal Pinjam\t: " + tanggalPinjam + "\n" +
               "Tanggal Kembali\t: " + (tanggalKembali == null ? "Belum dikembalikan" : tanggalKembali);
    }
}
