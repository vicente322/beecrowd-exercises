import java.util.Scanner;

public class Main
{
    public static void  main(String args[])
    {
        Scanner leitor;
        double x1;
        double y1;
        double x2;
        double y2;
        double distancia;
        
        leitor = new Scanner (System.in);
        x1 = leitor.nextDouble();
        y1 = leitor.nextDouble();
        x2 = leitor.nextDouble();
        y2 = leitor.nextDouble();
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.printf("%.4f\n", distancia);
    }
}