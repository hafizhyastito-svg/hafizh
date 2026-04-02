import java.util.Scanner;
public class iniMarket{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//daftar member (nama, alamat, no hp)
String namaMember="", alamatMember="", noHpMember="";
String jawab="";

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

}else {
// jawab tidak 
System.out.println("Selamat datang di toko kami! Silakan berbelanja.");

}




}

}
