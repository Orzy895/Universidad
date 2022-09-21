import java.util.Scanner;
public class Seis{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el limite superior");
        int sup = scan.nextInt();
        System.out.println("1");
        for(int x = 1; x < sup ; x++){
            int a = 0;
            for(int y = 1; y<=x ; y++){
                if(x%y ==0){
                    a++;
                }
            }
            if(a == 2){
                System.out.println(x);
            }
        }
        scan.close();

    }

    
}