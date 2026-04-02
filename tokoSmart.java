import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter barang, jumlah and harga:");
    // String input
    String namaBarang = myObj.nextLine();
    double totalHarga = 0;
    // Numerical input
    int jumlahBarang = myObj.nextInt();
    double hargaBarang = myObj.nextDouble();
    totalHarga = jumlahBarang * hargaBarang;
    // Output input by user
    System.out.println("Nama Barang: " + namaBarang); 
    System.out.println("Jumlah Barang: " + jumlahBarang); 
    System.out.println("Harga Barang: " + hargaBarang);
    System.out.println("Total Harga: " + totalHarga);
}

  }