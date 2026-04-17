import java.util.Scanner;
public class kuisLooping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int totalBuku = 0;
int jumlahBuku;

do {
    System.out.print("Masukkann jumlah buku yang dipinjam: ");
    jumlahBuku = sc.nextInt();
    System.out.println( );

    if (jumlahBuku <= 0){
        System.out.println("Maaf input tidak valid. Jumlah buku harus lebih dari 0.");
    
    } else {
        totalBuku += jumlahBuku;
        System.out.println("Jumlah buku yang dipinjam: " + jumlahBuku + " buku");
        System.out.println("Total sementara: " + totalBuku + " buku");
    }
    System.out.println( );
System.out.println("Apakah Anda ingin memasukkan jumlah buku lagi? (ya/tidak)");
String jawab = sc.next();
System.out.println( );
if (jawab.equalsIgnoreCase("tidak")) {
    break;
}
    } while (true);
    System.out.println("Total buku yang dipinjam: " + totalBuku + " buku");
    sc.close();
}



}
