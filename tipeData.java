public class tipeData { 
    public static void main(String[] args) {
        //coding

        /*universitas dinamika membutuhkan aplikasi sedehana 
        untuk mencatat boidata mahasiswa, apa saja variabel dan 
        tipe data yang diperlukan?
        
        NIM --> String
        Nama --> String
        Alamat --> String
        No Telepon --> String
        Jenis Kelamin --> String
        Program Studi --> String
        Dosen Wali --> int

        int : Untuk Perhitungan/Kalkulasi
        */

        //1. Deklarasi Variabel
        String nim = "25410100073";
        String nama = "Epstein";
        String alamat = "Griya Candramas BA 38  Surabaya";
        String noTelepon = "085708793397";
        String jenisKelamin = "Laki-laki";
        String programStudi = "Sistem Informasi";
        String dosenWali = "Bu Tan Amelia";
        int sisaBOP = 0;
        System.out.println(nim);

        //2. Print nilai variabel --> sout + tab
        System.out.println(nim);
        System.out.println("NIM Mahasiswa adalah " +nim+ 
        " Dengan Nama " +nama);

        //dengan operator escape : \n (utk enter ke baris baru 
        // saat di print)
        System.out.println("NIM : " +nim + "\nNama : " + nama + 
        "\nAlamat : " + alamat + "\nNo Telepon : " + noTelepon 
        + "\nJenis Kelamin : " + jenisKelamin + 
        "\nProgram Studi : " + programStudi + "\nDosen Wali : " 
        + dosenWali+ "\nSisa BOP : " + sisaBOP);

        if (sisaBOP > 0) {
                System.out.println("Sisa BOP " + nama + " Adalah " + sisaBOP);
            } else {
                System.out.println("BOP " + nama + " Sudah Lunas");
            };

    }
}