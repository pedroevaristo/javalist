package javaapplication3;
import java.util.Scanner;

public class Pratica4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double valor, valor1;
        System.out.println("Digite o raio e altura do cilindro:");
         valor = scan.nextDouble();
         valor1 = scan.nextDouble();
        
       double total = ((2*Math.PI)*valor*valor1);
       
        System.err.printf("%.2f\n", total);
    }
}
