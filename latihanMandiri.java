import java.util.Scanner;

public class latihanMandiri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] angka = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("angka ke " + (i+1) + ": ");
            angka[i] = sc.nextInt();
        }
        
        int tertinggi = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > tertinggi) {
                tertinggi = angka[i];
            }
        }
        
        System.out.println("Nilai tertinggi: " + tertinggi);
    }
}