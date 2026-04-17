import java.util.Scanner;
public class tugasPraktikum {
    public static void main(String[] args) {
       //for loop dengan input user
         Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
       for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
        
            System.out.print("*");
     
        }
    
    System.out.println();
    }
    System.out.println();
     

    //for segitiga siku-siku kiri bawah

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
    
        System.out.print("*");  
    }
System.out.println();}
System.out.println();

//for segitiga siku-siku kiri atas
    
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i + 1; j++) {
    
        System.out.print("*");  
    }
System.out.println();}
System.out.println();

//for segitiga siku-siku kanan bawah
    for (int i = 1; i <= n; i++) {
        for (int spasi = 1; spasi <= n - i; spasi++) {
            System.out.print(" ");  
        }
        for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

}
    
