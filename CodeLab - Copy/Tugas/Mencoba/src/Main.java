import java.util.Scanner;

class Admin {
    private final String username = "admin";
    private final String password = "admin123";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

class Mahasiswa {
    private final String nama = "Budi Santoso";
    private final String nim = "2201001";

    public boolean login(String inputNIM) {
        return inputNIM.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil! Selamat datang, " + nama + " (NIM: " + nim + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Pilih jenis login: 1. Admin | 2. Mahasiswa | 3. Keluar");
            System.out.print("Pilihan Anda: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Harap masukkan angka yang valid!");
                scanner.next(); // Membersihkan input yang salah
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    loginAdmin(scanner, admin);
                    break;
                case 2:
                    loginMahasiswa(scanner, mahasiswa);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    private static void loginAdmin(Scanner scanner, Admin admin) {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (admin.login(username, password)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    private static void loginMahasiswa(Scanner scanner, Mahasiswa mahasiswa) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        if (mahasiswa.login(nim)) {
            mahasiswa.displayInfo();
        } else {
            System.out.println("Login gagal! NIM tidak ditemukan.");
        }
    }
}
