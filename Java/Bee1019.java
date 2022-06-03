import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner leitor;
        int tempo;
        int horas;
        int minutos;
        int segundos;
        
        leitor = new Scanner(System.in);
        tempo = leitor.nextInt();
        horas = tempo / 3600;
        minutos = (tempo - (horas * 3600)) / 60;
        segundos = tempo - (horas * 3600) - (minutos * 60);
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}