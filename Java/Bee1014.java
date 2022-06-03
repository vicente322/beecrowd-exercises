import java.util.Scanner;

public class Consumo{
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        int distancia = leitor.nextInt();
        double gasolina = leitor.nextDouble();
        double consumo = distancia / gasolina;
        System.out.printf("%.3f km/l\n", consumo);
    }
}