//1. import class
import java.util.Scanner;
public class latihanScanner {
    public static void main(String[] args) {
       //2. deklarasi scanner
        Scanner scanner = new Scanner(System.in);

        //3. input data (deklarasi variabel)
        //value dlm variabel harus diberikan nilai default
        String namaBarang="";
        int harga=0, jumlahBeli=0, total=0;

        //teks input
        System.out.print("Masukkan nama barang: ");
        namaBarang = scanner.nextLine(); //nextline untuk string
        System.out.print("Masukkan harga barang: ");
        harga = scanner.nextInt();
        System.out.print("Masukkan jumlah beli: ");
        jumlahBeli = scanner.nextInt();


        //4. if else untuk menentukan total harga
        if (jumlahBeli > 10) {
            total = (int) (harga * jumlahBeli * 0.9); //diskon 10%
        } else {
            total = harga * jumlahBeli;
        }
        //5. output data
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total: " + total);

        //5. close scanner
        scanner.close();
    }
}
