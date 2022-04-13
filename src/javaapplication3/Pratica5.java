
package javaapplication3;
//import java.util.Scanner;
public class Pratica5 {

    public static void main(String args[]) {
        int[] vetor = new int[4];
        int[] resul = new int[4];
java.util.Scanner scan = new java.util.Scanner(System.in);
        int loop=0;
        while(loop<4){
            vetor[loop] = scan.nextInt();
            resul[loop]= (int) Math.pow(vetor[loop],2);
            loop+=1;
        }
        
        
        for(int t =0; t<4;t++){
            if(resul[t] > 100){
                System.out.println("Maior que 100 = "+resul[t]);
            }
            System.out.println(resul[t]);
        }
        
        
    }
}
