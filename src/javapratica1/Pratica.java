package javapratica1;
import java.util.Scanner;

public class Pratica {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total =0;
        int numero = scan.nextInt();
        
        if(numero<100){
            total = numero +100;
            System.out.println(total);
        }
        if(numero < 100){
            total = numero - 100;
            System.out.println(total);
        }
    }
}
