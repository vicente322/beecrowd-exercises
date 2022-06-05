import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int prod = a * b;
        System.out.println("PROD = " + prod);
    }
}