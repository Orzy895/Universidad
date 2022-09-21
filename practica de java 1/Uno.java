import java.util.Scanner;
public class Uno
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    System.out.println("Introduzca los grados centigrados");
    Double centigrados = scan.nextDouble();
    Double fah = (centigrados*9/5);
    fah= fah+32;
    System.out.println(fah);
    scan.close();
  }
}