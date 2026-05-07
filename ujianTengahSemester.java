import java.util.Scanner;
public class ujianTengahSemester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPembeli;
        
        do {
            System.out.println("masukkan jumlah pembeli (minimal 3)");
            jumlahPembeli = input.nextInt();
            if (jumlahPembeli < 3) {
                System.out.println("Maaf, jumlah pembeli harus minimal 3. Silakan coba lagi!\n");
            }
        } while (jumlahPembeli < 3);
        String[] daftarPembeli = new String[jumlahPembeli];
        for (int i = 0; i < jumlahPembeli; i++) {
            System.out.println("\n--- Input data Pembeli ---");
            
            System.out.println("1. 15.000");
            System.out.println("2. 25.000");
            System.out.println("3. 50.000");
            System.out.println("4. 100.000");
            System.out.print("masukkan nominal pulsa (1-4): ");
            int nominalPulsa = input.nextInt();
            System.out.println( );
            if (nominalPulsa == 1 ) { 
                nominalPulsa = 15000;
            } else if (nominalPulsa == 2 ) {
                nominalPulsa = 25000;
            } else if (nominalPulsa == 3 ) {
                nominalPulsa = 50000;
                nominalPulsa = (int) (nominalPulsa * 0.90); // Menghitung 90% dari nominal pulsa
            } else if (nominalPulsa == 4 ) {
                nominalPulsa = 100000;
                nominalPulsa = (int) (nominalPulsa * 0.85); // Menghitung 85% dari nominal pulsa
            } else {    
                System.out.println("Nominal pulsa tidak valid. Silakan coba lagi!");
               continue; // Melanjutkan ke iterasi berikutnya jika input tidak valid
                
            }
            System.out.print("Masukkan nama provider: ");            
            daftarPembeli[i] = input.next();
            System.out.println("1. Paket A");
            System.out.println("2. Paket B");
            System.out.println("3. Paket C");
            System.out.println("masukkan jenis paket (1-3):");
            int jenisPaket = input.nextInt();

            String namaPaket;

            switch (jenisPaket) {
                case 1:
                    namaPaket = "Paket A";
                    break;
                case 2:
                    namaPaket = "Paket B";
                    break;
                case 3:
                    namaPaket = "Paket C";
                    break;
                default:
                    namaPaket = "Jenis paket tidak valid";
            }
            System.out.println("\n--- Data Pembeli " + (i + 1) + " ---");
            System.out.println("Nama Provider: " + daftarPembeli[i]);
            System.out.println("Jenis Paket: " + namaPaket);
            if (nominalPulsa >=50000) {
                System.out.println("Nominal Pulsa + Biaya Admin 2000: dan diskon 10% : " + (nominalPulsa + 2000));
            } else if (nominalPulsa >= 100000) {
                System.out.println("Nominal Pulsa + Biaya Admin 2000 dan Diskon 15% : " + (nominalPulsa + 2000));
            }
                else {
                    System.out.println("Nominal Pulsa: " + nominalPulsa);
                }
        }



    }
}
