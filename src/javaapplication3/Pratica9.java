package javaapplication3;
import java.util.Scanner;
public class Pratica9 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite sua idade");
        int idade = scan.nextInt();
        int veri = 0;//verificação
        while(veri <2){
            if(veri >=16 || veri <=17){
                System.err.println("Você é jovem demais para votar e dirigir.");
                break;
            }
             if(veri >= 18){
                 System.out.println("Você tem idade suficiente pra votar e dirigir e beber");
                 break;
            }
              
          veri+=1;
            
        }
    }
}
