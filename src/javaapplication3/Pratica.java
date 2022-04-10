
package javaapplication3;
import java.util.Scanner;
public class Pratica {
 
    public static void main(String[] args) {
int numero = 0, total =0;
int loop;
    Scanner input = new Scanner(System.in);
        
        System.out.println("Digite 3 numeros:");
        loop = 0;
            while(loop < 3){
                numero = input.nextInt();
                total += numero;
                loop+=1;
            }
            int res = total/3;
            
                System.err.println(res);/*fazer while aqui !!*/
                
           input.close();
    }
    
}
