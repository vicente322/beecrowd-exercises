import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        int funcionario = teclado.nextInt();
        int horas = teclado.nextInt();
        double salarioHora = teclado.nextDouble();
        double salario = (salarioHora * horas);
        
        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}