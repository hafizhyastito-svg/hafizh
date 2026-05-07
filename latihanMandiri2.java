import java.util.Scanner;

public class latihanMandiri2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] angka = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("angka ke " + (i+1) + ": ");
            angka[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan angka yang dicari: ");
        int cari = sc.nextInt();
        
        boolean dicari = false;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                dicari = true;
                break;
            }
        }
        
        if (dicari) {
            System.out.println(cari + " ditemukan di dalam array.");
        } else {
            System.out.println(cari + " tidak ada di dalam array.");
        }
    }
}