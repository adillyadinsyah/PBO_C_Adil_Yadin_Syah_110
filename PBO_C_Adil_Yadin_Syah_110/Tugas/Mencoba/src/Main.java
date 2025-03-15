import java.util.Scanner;

// Kelas Admin
class Admin {
    private final String username = "admin";
    private final String password = "admin123";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

// Kelas Mahasiswa
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

// Kelas utama LoginSystem
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Pilih jenis login: 1. Admin | 2. Mahasiswa");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Membuang newline

        if (choice == 1) {
            // Login sebagai Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (choice == 2) {
            // Login sebagai Mahasiswa
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! NIM tidak ditemukan.");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
