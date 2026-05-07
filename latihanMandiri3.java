import java.util.Scanner;

public class latihanMandiri3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] angka = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("angka ke " + (i+1) + ": ");
            angka[i] = sc.nextInt();
        }
        
        System.out.print("angka terbalik: ");
        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println();
    }
}