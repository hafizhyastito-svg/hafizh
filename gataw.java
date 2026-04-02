import java.util.Scanner;
public class gataw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//daftar member (nama, alamat, no hp)
String namaMember="", alamatMember="", noHpMember="";
String jawab="";

//transaksi pembelian (nama barang, jumlah, harga)
String namaBarang="";
double harga=0.0, jumlah=0.0, total=0.0, diskon=0.0, grandTotal=0.0;


//tanyakan dahulu apakah pembeli member atau tidak
System.out.print("Apakah pembeli member? (ya/tidak): ");
jawab = scanner.nextLine();

//equals = case sensitive (perhatikan kapital/tdknnya)
//equalsIgnoreCase = tidak case sensitive (tidak memperhatikan kapital/tdknya)

//cek jawaban pembeli
if (jawab.equalsIgnoreCase("ya")){
    //true //jawab ya
    System.out.print("Masukkan nama member: ");
    namaMember = scanner.nextLine();
    System.out.print("Masukkan alamat member: ");
    alamatMember = scanner.nextLine();
    System.out.print("Masukkan no hp member: ");
    noHpMember = scanner.nextLine();

    System.out.println("Selamat datang, " + namaMember + "! Ingin berbelanja?");
    jawab=scanner.nextLine();
    if (jawab.equalsIgnoreCase("ya")){
        System.out.println("Masukkan nama barang: ");
        namaBarang = scanner.nextLine();
        System.out.println("Masukkan harga barang: ");
        harga = scanner.nextDouble();
        System.out.println("Masukkan jumlah barang: ");
        jumlah = scanner.nextDouble();

        System.out.println( );

        total = harga * jumlah;
        System.out.println("Total harga: " + total);
        //hitung diskon
        if (total>=100000.0) {
            diskon = total * 0.07 ; // 5% discount + diskon member 2%
        } else if (total >= 300000.0) {
            diskon = total * 0.12; // 10% discount + diskon member 2%
        } else {
            diskon = 0.0; // no discount
        }
        grandTotal = total - diskon;
        System.out.println("Diskon: " + diskon);
        System.out.println("Grand Total: " + grandTotal);

    }
    
        



}

}
