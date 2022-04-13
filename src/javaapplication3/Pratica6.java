import package javaapplication3;
import java.util.Scanner;
public class Pratica6{
  public static void main(String[] args){
    int acumulador =0;
    Scanner scan = new Scanner(System.in);
    int[] array = new int[3];
  int l = 0;//loop
    while(l < 3){
     array[l]= scan.nextInt();
      acumulador+= array[l];
      l+=1;
    }
    int total = acumulador / 3;
    if(acumulador / 3 == 6){
      System.out.println("Ta de recuperação");
    }
    int total = acumulador / 3;
    if(total > 6){
System.out.println("Ta aprovado");
      
    }
    if(total < 6){
      System.out.println("Ta reprovado");
    }
    
  
  
}