
package javaapplication3;
import java.util.Scanner;

public class Praitca1 {

    public static void main(String args[]) {
int valor = 0, total = 0;
Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor:");
        valor = input.nextInt();
        
        total = valor * valor;
        
        System.err.println(total);
    }
}
