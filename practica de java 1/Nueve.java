import java.util.Scanner;
public class Nueve {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdzca codigo ascii");
        int ascii = scan.nextInt();
        while(ascii<0 || ascii > 256){
            System.out.println("ERROR");
            System.out.println("Introduzca codigo ascii nuevamente");
            ascii = scan.nextInt();
        }
        System.out.println((char)ascii);
        scan.close();
    }
}
