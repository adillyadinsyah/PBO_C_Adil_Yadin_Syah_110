public class Hewan {
    private String nama;
    private String jenis;
    private String suara;

    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Suara : " + suara);
        System.out.println("----------------------");
    }
}
