import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner leitor;
        double tempo;
        double velocidade;
        double distancia;
        double consumo;
        
        leitor = new Scanner(System.in);
        tempo = leitor.nextDouble(); //horas
        velocidade = leitor.nextDouble(); //quilometros po hora
        distancia = velocidade * tempo; //quilometros 
        consumo = distancia / 12; //litros
        
        System.out.printf("%.3f\n", consumo);
    }
}