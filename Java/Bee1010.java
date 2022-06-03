import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) throws IOException{
        Scanner teclado = new Scanner(System.in);
        int cod1 = teclado.nextInt();
        int quant1 = teclado.nextInt();
        double preco1 = teclado.nextDouble();
        int cod2 = teclado.nextInt();
        int quant2 = teclado.nextInt();
        double preco2 = teclado.nextDouble();
        double total = ((quant1 * preco1) + (quant2 * preco2));
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}