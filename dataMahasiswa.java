import java.util.Scanner;

public class dataMahasiswa {
    
    
    static void tampilkanMahasiswa(String nama, String nim, double ipk) {
        System.out.println("\n===== DATA MAHASISWA =====");
        System.out.println("Nama : "+ nama );
        System.out.println("NIM  : "+ nim );
        System.out.println("IPK  : "+ ipk );
        System.out.println("==========================\n");
    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = input.nextDouble();
        tampilkanMahasiswa(nama, nim, ipk);
        input.close();

    }
}
    
    










// fungsi parameter adalah untuk memudahkan kita dalam menampilkan data yang sama dengan 
// format yang sama, sehingga kita tidak perlu menulis ulang kode yang sama berulang-ulang, 
// cukup dengan memanggil fungsi tersebut dengan parameter yang berbeda.