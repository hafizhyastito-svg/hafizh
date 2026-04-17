import java.util.Scanner;
public class latihanLooping2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 
            1. entri data
            2. print data
            
            harus hitung total belanja, dimana menu bisa > 5
        */
       //variabel
        int menu, total = 0, harga = 0, jumlah = 0, iterasi = 0;
        String namaBarang = "";

        //menu bisa diulang >> while/dowhile
        do{
            System.out.println("1. Entri Data");
            System.out.println("2. Print Data");
            System.out.println("3. Pilih Menu");
            menu = sc.nextInt();
        
            //percabangan menu>>switch case
            switch (menu) {
                case 1: 
                    System.out.println("== Entri Data ==");
                    //data diulang > 5x
                    System.out.println("berapa data yang dibutuhkan? ");
                    iterasi = sc.nextInt();
                    sc.nextLine(); //clear buffer
                    for (int i = 1; i <= iterasi; i++) {
                        //input data
                        /*
                            i=1. 1<5, print data, i+1
                            i=2, .........dst
                         */
                        System.out.println("Data ke-" + i);
                        System.out.print("Nama Barang: ");
                        namaBarang = sc.nextLine();
                        System.out.print("Jumlah Beli: ");
                        jumlah = sc.nextInt();
                        System.out.print("Harga: ");
                        harga = sc.nextInt();
                        sc.nextLine(); //clear buffer
                        System.out.println ("Total Harga: " + (harga * jumlah));
            }
                    break;

                case 2:
                    break;

                default:
                    //memberhentikan program jika input menu tidak valid
                    System.exit(0);
                    break;
            }
        
        }while (true); 

            

             
    }
}