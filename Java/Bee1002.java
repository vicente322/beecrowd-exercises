import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        double raio = teclado.nextDouble();
        double area = pi * (raio * raio);
        
        System.out.println ("A=" + area); 
    }
}