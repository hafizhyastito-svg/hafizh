import java.util.Scanner;
public class menghitungIP {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Masukkan Ips
    int sks = 0;
    double ips = 0.0;
    
    System.out.print("Masukkan IPS: ");
    ips = scanner.nextDouble();
    
    //hitung sks
    if (ips>=3.50) {
        sks = 24;
    } else if (ips >= 3.00 && ips <= 3.49) {
        sks = 22;
    } else if (ips >= 2.00 && ips <= 2.99) {
        sks = 20;
    } else if (ips < 2.00 && ips >= 1.00) {
        sks = 18;
    } else if (ips < 1.00 && ips >= 0.00) {
        System.out.println("Selamat anda di DO.");
    } else {
        System.out.println("IPS tidak valid.");
    }
    System.out.println("Jumlah SKS yang dapat diambil: " + sks);
    scanner.close();
}
}
