import java.util.Scanner;
public class kuisLooping {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalBuku = 0;
    int jumlahBuku;

    do {
        System.out.println("Masukkan 0 untuk berhenti");
        System.out.print("Jumlah buku yang dipinjam: ");
        jumlahBuku = sc.nextInt();
        if (jumlahBuku < 0){
            System.out.println( );
            System.out.println("Jumlah buku tidak boleh negatif");
            System.out.println( );
            System.out.println("Total sementara buku yang dipinjam: " + totalBuku + " Buku");
    } else if (jumlahBuku == 0){
            System.out.println( );
            System.out.println("Input selesai");
    } else if (jumlahBuku > 0) {
            totalBuku += jumlahBuku;
            System.out.println( );
            System.out.println("Total sementara buku yang dipinjam: " + totalBuku + " Buku");
    }

    } while (jumlahBuku != 0);
    System.out.println("Total buku yang dipinjam: " + totalBuku + " Buku");
}    
}
