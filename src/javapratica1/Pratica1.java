
package javapratica1;
import java.util.Scanner;

public class Pratica1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a,b ,c ;
        
        System.out.println("Digite tres valores:");
        a = scan.nextInt(); b = scan.nextInt(); c = scan.nextInt();
        
        if(a == b && b==c){
            System.out.println("Triangulo equilatero");
            
        }
        if(a == b){
            System.out.println("Triangulo isoceles");
            
        }
        if(a<b && a<c){
            System.out.println("Triangulo scaleno");
            
        }
        
        
    }
}
