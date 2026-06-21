public class pert13 {
    public static void main(String[] args) {
        // soal nomor 2
        StringBuffer isi1 = new StringBuffer();
        StringBuffer isi2 = new StringBuffer(100);
        StringBuffer isi3 = new StringBuffer("Halo");

        System.out.println("Isi 1: " + isi1.length() + "\nKapasitas 1: " + isi1.capacity());
        System.out.println("\nIsi 2: " + isi2.length() + "\nKapasitas 2: " + isi2.capacity());
        System.out.println("\nIsi 3: " + isi3 + ", Length: " + isi3.length() + "\nKapasitas 3: " + isi3.capacity());
        

        // soal nomor 3
        StringBuffer teks = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            teks.append("abc ");
        }
        System.out.println("\nStringBuffer: " + teks);


        // soal nomor 5 
        String kategoriAwal = "makanan cepat saji";

        StringBuffer kategori = new StringBuffer(kategoriAwal);
        System.out.println("\nisi StringBuffer: " + kategori);

        String kategoriAkhir = kategori.toString();
        System.out.println("isi String Akhir: " + kategoriAkhir);

        System.out.println("hasil akhirnya identik");
    }


}



