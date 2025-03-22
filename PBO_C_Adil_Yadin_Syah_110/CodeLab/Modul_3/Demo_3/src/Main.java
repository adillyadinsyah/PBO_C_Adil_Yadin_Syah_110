import java.util.Scanner;

class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public boolean login(String input1, String input2) {
        return false;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        super.displayInfo();
    }
}

class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return this.getNama().equalsIgnoreCase(inputNama) && this.getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        super.displayInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("Admin", "0000", "admin123", "password123");
        Mahasiswa mahasiswa = new Mahasiswa("Budi", "220101");

        for (int i = 0; i < 2; i++) {
            System.out.println("Selamat datang di Sistem Login!");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.print("Pilih opsi (1/2): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Username: ");
                String inputUsername = scanner.nextLine();
                System.out.print("Masukkan Password: ");
                String inputPassword = scanner.nextLine();

                if (admin.login(inputUsername, inputPassword)) {
                    admin.displayInfo();
                } else {
                    System.out.println("Login Admin gagal! Username atau password salah.");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan Nama: ");
                String inputNama = scanner.nextLine().trim();
                System.out.print("Masukkan NIM: ");
                String inputNim = scanner.nextLine().trim();

                if (mahasiswa.login(inputNama, inputNim)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Login Mahasiswa gagal! Nama atau NIM salah.");
                }
            } else {
                System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        }
        scanner.close();
    }
}
