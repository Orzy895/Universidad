import java.util.Scanner;
public class Ocho {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double numero=0.0, binario, temp, x, y=0;
        //Se le pide el numero binario
        System.out.println("Introduzca el numero binario");
        binario=scan.nextDouble();
        for(int i = 0; i < 5 ;i++){
            //Se busca el ultimo digito del binario
            temp = binario % 10;
            //Se hace el calculo de 2^0 (el 0 va subiendo de 1 en 1)
            x=Math.pow(2, y);
            //Si el ultimo digito es 1, el valor del calculo anterior es sumado al numero decimal
            if(temp>0.9){
                numero = numero + x;
            }
            //Se elimina el ultimo digito del binario
            binario = binario/10;
            //Contador para el calculo de 2^0
            y++;
        }
        scan.close();
        System.out.println(numero);
    }
}