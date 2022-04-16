//Está certo testado no GDBcompiler.com
import java.util.Scanner;
public class Pratica7{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite sua idade:");
    int idade = scan.nextInt();
    scan.close();
    if(idade >= 5 && idade <= 11){
      System.out.println("Idade => infatil");
    }
    if(idade >= 12 && idade <= 17){
       System.out.println("Idade => adolescente");
    }
    if(idade >= 18){
       System.out.println("Idade => adulto");
    }
  }
}