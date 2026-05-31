import java.util.Scanner;

public class dataMahasiswa {

    public static void tampilkanMahasiswa(String nama, String nim, double ipk) {

        System.out.println("\n===== DATA MAHASISWA =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("IPK  : " + ipk);
        System.out.println("==========================");
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== INPUT DATA MAHASISWA ===");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan IPK mahasiswa: ");
        double ipk = scanner.nextDouble();
        scanner.close();
        
        tampilkanMahasiswa(nama, nim, ipk);
    }
}
    
