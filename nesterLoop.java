import java.util.Scanner;
public class nesterLoop {
    public static void main(String[] args) {

int g = 0 ;
for (int h = 1 ;  h <= 3; h++) {
    System.out.println("Hari "+ h);  
        for (int t = 1; t <= 3; t++) {
            System.out.println("Transaksi "+ t + " : 50000");
            g += 50000;

            }
    System.out.println("Total Transaksi "+ g);


        }
   



    }


}
