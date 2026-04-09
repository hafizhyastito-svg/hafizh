import java.util.Scanner;
public class kasusMinimarket {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int harga = 0;
int total = 0;

System.out.println("Masukkan harga: ketik 0 untuk selesai");
do {
            int inputHarga = scanner.nextInt();
            harga = inputHarga;
            total += harga;
        
        } while (harga != 0);
        System.out.println("Total harga: " + total);
        scanner.close();
    }
}