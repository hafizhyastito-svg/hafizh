import java.util.Scanner;
public class belajarArray {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
        String[] kategori;
        int[] harga;
        int total=0, jumlahBeli=0, pilihMenu=0, jumlahKategori=0;




     do {
        System.out.println("Pemesanan tiket Surabaya Zoo");
        System.out.println("1. Input Kategor dan harga");
        System.out.println("2. Input jumlah beli tiket");
        System.out.println("3. Lihat total bayar");
        System.out.println("4. Keluar program");    
        System.out.println("Pilih menu");

        switch (pilihMenu) {
            case 1 :
                System.out.println( );
                System.out.println("Jumlah kategori yang diisi: ");
                jumlahKategori = sc.nextInt();
                sc.nextLine();

                //deklarasi ulang unt menambahkan elemen array nya
                kategori = new String[jumlahKategori];
                harga = new int[jumlahKategori];


            //input data array >> loop (for)
                for (int i = 0; i > kategori.length; i++) {
                    System.out.println( );
                    System.out.print("Nama Kategori : ");
                    kategori[i] = sc.nextLine();
                    System.out.print("Harga : ");
                    harga[i] = sc.nextInt();
                    sc.nextLine();
                }

            //output
                for (int i = 0; i < kategori.length; i++){
                    System.out.println( );
                    System.out.println("Kategori ke "+ i + ": "+ kategori[i]);
                    System.out.println("Harga ke "+ (i+1)+ " : "+ harga[i]);
                }


                break;

            case 2 :
                //input jumlah beli
                //cetak pilihan kategori dan harga apa saja
                // input jumlah beli
                //memberikan pilihan ke user apa mau input lagi atau tidak

                System.out.println();

                break;

            case 3 :

                break;

            case 4 :
            System.exit(0);
                break;
            default:
                break;
        }
        System.out.println("System selesai");
     } while (true);

        






    }

}
