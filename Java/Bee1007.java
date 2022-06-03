import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        int diferenca = (a*b - c*d);
        
        System.out.println("DIFERENCA = " + diferenca);
    }
}