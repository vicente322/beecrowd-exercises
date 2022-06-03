import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        double salarioFixo = teclado.nextDouble();
        double vendas = teclado.nextDouble();
        double salarioTotal = (salarioFixo + (vendas * 0.15));
        
        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
    }
}