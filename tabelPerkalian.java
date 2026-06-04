import java.util.Scanner;
public class tabelPerkalian {
    
    static void cetakTabel(int angka) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));          
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        cetakTabel(input.nextInt());
        input.close();
    }
}
