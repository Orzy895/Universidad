import java.util.Scanner;
public class Siete {
    public static void main(String[]args){
        Double promedio, a, b, c, mayor, menor;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el primer valor");
        a=scan.nextDouble();
        System.out.println("Introduzca el segundo valor");
        b=scan.nextDouble();
        System.out.println("Introduzca el tercer valor");
        c=scan.nextDouble();
        promedio = (a+b+c)/3;
        if (a>b && a>c){
            mayor = a;
        }
        else if(b>a && b>c){
            mayor = b;
        }
        else{
            mayor = c;
        }
        if (a<b && a<c){
            menor = a;
        }
        else if(b<a && b<c){
            menor = b;
        }
        else{
            menor = c;
        }
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
        System.out.println("El promedio de los 3 numeros es: "+promedio);
        scan.close();
    }
    
}