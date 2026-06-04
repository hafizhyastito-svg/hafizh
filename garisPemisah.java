import java.util.Scanner;
class garisPemisah {
    static void cetakGaris(int panjang) {
        
        for (int i = 0; i < panjang; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang garis: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        for (int i = 0; i < baris; i++) {
            cetakGaris(panjang);
        }
 
    }
}
