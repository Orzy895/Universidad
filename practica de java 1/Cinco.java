import java.util.Scanner;
public class Cinco {
    public static void main (String[]args){
      Scanner scan = new Scanner (System.in);
      int valor = 0;
      System.out.println("Introduzca un valor de 5 cifras");
      valor = scan.nextInt();
      System.out.println(valor/10000);
      System.out.println(valor/1000);
      System.out.println(valor/100);
      System.out.println(valor/10);
      System.out.println(valor);
      scan.close();
    }    
}