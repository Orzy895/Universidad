import java.util.Scanner;
public class Cuatro {
    public static void main (String[]args)
    {
    Scanner scan = new Scanner (System.in);
    Double valor = 0.0;
    System.out.println("Introduzca el valor");
    valor= scan.nextDouble();
    while(valor%2==0){
        System.out.println(valor+"/2 = ");
        valor= valor / 2;
        System.out.println(valor);
    }
    while(valor%3==0){
        System.out.println(valor+"/3 = ");
        valor = valor /3;
        System.out.println(valor);
    }
    while(valor%5==0){
        System.out.println(valor+"/5 = ");
        valor= valor/5;
        System.out.println(valor);
    }
    scan.close();
    }    
}