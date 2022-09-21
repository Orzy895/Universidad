import java.util.Scanner;
public class Tres
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    Double a=0.0, b=0.0, c=0.0, area= 0.0, perimetro=0.0, sp=0.0;
    System.out.println("Que tipo de triangulo es?\n"+"Para Equilatero, introduzca 1\n"+"Para Isosceles, introduzca 2\n"+"Para Escaleno,introduzca 3\n");
    int tipo = scan.nextInt();
    if(tipo==1){
        System.out.println("Introduzca el lado(Todos los lados son iguales)");
        a=scan.nextDouble();
        area= (Math.sqrt(3)/4) * Math.pow(a, 2);
        perimetro= 3 * a;
    }
    else if(tipo==2){
        System.out.println("Introduzca los dos lados iguales");
        a=scan.nextDouble();
        System.out.println("Introduzca la base");
        b=scan.nextDouble();
        area= b * (Math.sqrt((Math.pow(a, 2))-((Math.pow(b, 2))/4)));
        area = area / 2;
        perimetro = 2 * a + b;
    }
    else if(tipo==3){
        System.out.println("Introduzca el lado A");
        a=scan.nextDouble();
        System.out.println("Introduzca el lado B");
        b=scan.nextDouble();
        System.out.println("Introduzca el lado C");
        c=scan.nextDouble();
        sp= (a+b+c)/2;
        area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        perimetro = a+b+c;
    }
    else{
        System.out.println("Opcion Invalida");
    }
    System.out.println("El area del triangulo es: " + area);
    System.out.println("El perimetro del triangulo es:"+ perimetro);
    scan.close();
  }
}