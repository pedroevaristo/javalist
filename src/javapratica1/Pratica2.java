
package javapratica1;
import java.util.Scanner;

public class Pratica2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        
        System.out.println("Digite 3 numeros");
        
        int loop = 0;
        while(loop <3){
        array[loop] = scan.nextInt();
        loop+=1;
        }
        System.out.println("Digite de 1 a 3 formas que serão apresentados: ");
        int num = scan.nextInt();
        
        int aux = 0;
        switch(num){
            case 1:
                for(int a = 0; a<3;a++){
                    for(int b= 0; b<3; b++ ){
                        if(array[a] < array[b]){
                            aux = array[a];
                            array[a] = array[b];
                            array[b] = aux;      
                        }                        
                    }
                }
                System.out.println("\n");
                for(int g= 0; g< 3; g++){
                    System.out.println(array[g]);   
                }
                break;
                
            case 2:
                for(int a = 0; a<3;a++){
                    for(int b= 0; b<3; b++ ){
                        if(array[a] > array[b]){
                            aux = array[a];
                            array[a] = array[b];
                            array[b] = aux;      
                        }                        
                    }
                }
                System.out.println("\n");
                for(int g= 0; g< 3; g++){
                    System.out.println(array[g]);   
                }
                break;
                
            case 3: 
                for(int a = 0; a<3;a++){
                    for(int b= 0; b<3; b++ ){
                        if(array[a] > array[b]){
                            aux = array[a];
                            array[a] = array[b];
                            array[b] = aux;      
                        }                        
                    }
                }
                /* colocar uma mensagem aqui para dizer, que o maior numer esta no meio*/
                break;
            default:
                System.out.println("Não existe essa opcao!");
        }
    }
}
