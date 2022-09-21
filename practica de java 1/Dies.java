import java.util.Scanner;
public class Dies {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String x;
        do{
            System.out.println("Introduzca un valor, introduzca la palabra salir, para salir del bucle");
            x = scan.nextLine();
        }while(!x.equals("salir"));
        scan.close();
    }
}