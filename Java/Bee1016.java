import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Scanner leitor;
        int distancia;
        int tempo;
        
        leitor = new Scanner(System.in);
        distancia = leitor.nextInt();
        tempo = distancia * 2;
        
        System.out.println(tempo + " minutos");
    }
}