import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan Tahun Lahir Anda: ");
        int tahunLahir = scanner.nextInt();

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        String jenisKelaminString = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

        System.out.println("\n=== Data Diri Anda ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminString);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}
