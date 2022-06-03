import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner leitor;
        int tempo;
        int anos;
        int meses;
        int dias;
        
        leitor = new Scanner(System.in);
        tempo = leitor.nextInt();
        anos = tempo / 365;
        meses = (tempo - (anos * 365)) / 30;
        dias = tempo - (anos * 365) - (meses * 30);
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}