import java.util.Scanner;
public class Dos
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    Double cateto1 = 0.0;
    Double cateto2 = 0.0;
    Double respuesta = 0.0;
    Double hipotenusa = 0.0;
    System.out.println ("Que valores quiere introducir?\n"
			              + "Si es Cateto con Cateto, introduzca 1 \n"
			              + "Si es Cateto con Hipotenusa, introduzca 2 \n");
    Double des = scan.nextDouble ();
    if (des == 1){
	System.out.println ("Introduzca el valor del cateto 1");
	cateto1 = scan.nextDouble ();
	System.out.println ("Introduzca el valor del cateto 2");
	cateto2 = scan.nextDouble ();
	cateto1 = Math.pow (cateto1, 2);
	cateto2 = Math.pow (cateto2, 2);
	respuesta = Math.sqrt (cateto1 + cateto2);
    }
    else if (des == 2){
	System.out.println ("Introduzca el valor del cateto");
	cateto1 = scan.nextDouble ();
	System.out.println ("Introduzca el valor del hipotenusa");
	hipotenusa = scan.nextDouble ();
	cateto1 = Math.pow (cateto1, 2);
	hipotenusa = Math.pow (hipotenusa, 2);
	respuesta = Math.sqrt (hipotenusa - cateto1);
    }
    else{
	System.out.println ("Respuesta Invalida");
    }
    System.out.println (respuesta);
    scan.close();
  }
}