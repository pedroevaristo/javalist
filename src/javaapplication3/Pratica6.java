package javaapplication3;
import java.util.Scanner;
public class Pratica6{
  public static void main(String[] args){
    float acumulador = 0;
    Scanner scan = new Scanner(System.in);
    float[] array = new float[3];
  int l = 0;//loop
    while(l < 3){
     array[l]= scan.nextFloat();
      acumulador+= array[l];
      l+=1;
    }
    
    if(acumulador / 3 == 6){
      System.out.println("Ta de recuperação : 6");
    }
    float total = acumulador / 3;
    if(total > 6){
System.out.println("Ta aprovado "+total);
      
    }
    if(total < 6){
      System.out.println("Ta reprovado "+total);
    }
    
  
  
  }
}