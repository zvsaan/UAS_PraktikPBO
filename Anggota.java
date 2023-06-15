//Membuat class Anggota
public class Anggota {
    // Atribut class Anggota
    private String nama;
    private String id;

    // Konstruktor class Anggota
    public Anggota(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    // Getter untuk atribut nama
    public String getNama() {
        return nama;
    }

    // Getter untuk atribut id
    public String getId() {
        return id;
    }
}
