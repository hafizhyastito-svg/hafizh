import java.util.Scanner;
public class latihanUTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahhari;

        // 1. Meminta input hari dengan validasi minimal 7 hari (Looping)
        do {
            System.out.print("Masukkan jumlah hari penjualan (minimal 7): ");
            jumlahhari = input.nextInt();
            if (jumlahhari < 7) {
                System.out.println("Maaf, jumlah hari harus minimal 7 hari. Silakan coba lagi!\n");
            }
        } while (jumlahhari < 7);

        // 2. Deklarasi Array 1 Dimensi untuk menyimpan data penjualan
        int[] penjualan = new int[jumlahhari];

        System.out.println("\n--- Input Data Penjualan ---");
        // Looping untuk mengisi data penjualan ke dalam array
        for (int i = 0; i < jumlahhari; i++) {
            System.out.print("Masukkan jumlah penjualan hari ke-" + (i + 1) + ": ");
            penjualan[i] = input.nextInt();
        }

        // Deklarasi variabel untuk mencari nilai tertinggi dan terendah
        int tertinggi = penjualan[0];
        int terendah = penjualan[0];
        int hariTertinggi = 1;
        int hariTerendah = 1;

        System.out.println("\n--- Kondisi Toko Per Hari ---");
        // 3. Looping dan Percabangan untuk mengecek kondisi per hari & mencari nilai min/max
        for (int i = 0; i < jumlahhari; i++) {
            // Mengecek nilai tertinggi
            if (penjualan[i] > tertinggi) {
                tertinggi = penjualan[i];
                hariTertinggi = i + 1;
            }
            
            // Mengecek nilai terendah
            if (penjualan[i] < terendah) {
                terendah = penjualan[i];
                hariTerendah = i + 1;
            }

            // Menentukan status toko harian dengan Percabangan
            String statusToko;
            if (penjualan[i] > 100) {
                statusToko = "Ramai";
            } else if (penjualan[i] >= 50) { // menggunakan >= 50 untuk meng-cover angka pas 50
                statusToko = "Cukup";
            } else {
                statusToko = "Sepi";
            }

            // Menampilkan hasil per hari
            System.out.println("Hari ke-" + (i + 1) + " terjual " + penjualan[i] + " barang -> Kondisi: " + statusToko);
        }

        // 4. Menampilkan penjualan tertinggi dan terendah
        System.out.println("\n--- Kesimpulan ---");
        System.out.println("Penjualan TERTINGGI terjadi pada Hari ke-" + hariTertinggi + " dengan " + tertinggi + " barang.");
        System.out.println("Penjualan TERENDAH terjadi pada Hari ke-" + hariTerendah + " dengan " + terendah + " barang.");

        input.close();
    }
}