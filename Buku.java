//Membuat class Buku
public class Buku {
    // Atribut class Buku
    private String judul;
    private String pengarang;
    private String isbn;

    // Konstruktor class Buku
    public Buku(String judul, String pengarang, String isbn) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
    }

    // Getter untuk atribut judul
    public String getJudul() {
        return judul;
    }

    // Getter untuk atribut pengarang
    public String getPengarang() {
        return pengarang;
    }

    // Getter untuk atribut isbn
    public String getIsbn() {
        return isbn;
    }
}