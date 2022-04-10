package javaapplication3;
import java.util.Scanner;


public class Pratica2 {

    public static void main(String args[]) {
    int dia,mes,ano;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Seu nome e sobrenome");
        
        String nome = scan.next();
        String Sobren = scan.next();
        
        System.out.println("Digite seu ano de nascimento");
        dia = scan.nextInt();
        mes = scan.nextInt();
        ano = scan.nextInt();
                
        System.err.println(nome +" "+ Sobren);
         System.err.println(dia +" / "+ mes+" / "+ano);
    
    }
}
