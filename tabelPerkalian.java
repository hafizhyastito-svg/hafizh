import java.util.Scanner;
public class tabelPerkalian {
    
    public static void main(String[] args) {
       
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan angka : ");
            int angka = scanner.nextInt();
            scanner.close();
            cetakTabel(angka);
    }

public static void cetakTabel(int angka) {
    
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));          
        }
    }
}
