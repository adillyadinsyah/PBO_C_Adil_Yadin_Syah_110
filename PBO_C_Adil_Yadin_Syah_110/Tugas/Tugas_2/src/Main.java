public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa(20, "Andi", 123456);

        // Menampilkan informasi mahasiswa
        System.out.println(mahasiswa1);
    }
}

// Kelas Manusia sebagai superclass
class Manusia {
    int umur;
    String nama;

    // Konstruktor untuk inisialisasi atribut
    public Manusia(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    // Metode untuk menampilkan informasi manusia
    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur;
    }
}

// Kelas Mahasiswa sebagai subclass dari Manusia
class Mahasiswa extends Manusia {
    int nim;

    // Konstruktor untuk inisialisasi atribut Mahasiswa
    public Mahasiswa(int umur, String nama, int nim) {
        super(umur, nama); // Memanggil konstruktor dari superclass (Manusia)
        this.nim = nim;
    }

    // Override metode toString untuk menampilkan informasi Mahasiswa
    @Override
    public String toString() {
        return super.toString() + ", NIM: " + nim;
    }
}
