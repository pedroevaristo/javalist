package javaapplication3;
import java.util.Scanner;
public class Pratica8 {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] numb = new int[4];
        int[] resul = new int[4];
        int y=0;
        while(y<4){
            numb[y] = scan.nextInt();
            y+=1;
        }
        for(int loo = 0; loo<4;loo++){
            if(numb[loo]%2==0){
                System.err.println("numero par: " +numb[loo]);
            }
            if(numb[loo]%2==1){
                System.err.println("numero impar: " + numb[loo]);
            }
        }
    }
}
