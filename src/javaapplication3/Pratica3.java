
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Pratica3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int numb[] = new int[4]; 
        int ref[] = new int[4];
        int l= 0;//loop
        while(l<4){
            numb[l] = scan.nextInt();
            
            l+=1;
        }
        for(int s = 0; s < 4; s++){
            if(numb[s] % 2 == 0){
                System.out.println(numb[s] + " resto da divisao = 0");
            }
            if(numb[s] % 2 == 1){
                System.out.println(numb[s] + " resto da divisao = 1");
            }
        }
        
    }
}
