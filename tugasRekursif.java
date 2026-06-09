public class tugasRekursif {
    public static void cetakBintang(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.println("*");
        cetakBintang(n - 1);
    }

    public static void  cetakNaik(int n){
        if (n == 0) {
            return;
        }
        cetakNaik(n - 1);
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        cetakBintang(5);
        cetakNaik(5);
        System.out.println("Selesai!");
    }
}
