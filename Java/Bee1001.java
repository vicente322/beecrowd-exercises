import java.io.IOException; 
import java.util.Scanner; //Avisando o programa que vou utilizar scanner

public class Main{
    public static void main (String args[]) throws IOException{
        int a; //Criando a variável inteira "a"
        int b; //Criando a variável inteira "b"
        int x; //Criando a variável inteira "x"
        
        Scanner teclado; //Variável nova para guardar "teclado"
        teclado = new Scanner(System.in); // Atribui a "teclado" a função de escanear o teclado para entradas
        a = teclado.nextInt(); //Atribui a "a" o primeiro numero inteiro lido pelo teclado
        b = teclado.nextInt();
        teclado.close(); //Encerra a utilização de "teclado"
        x = a + b;
        
        System.out.println ("x = " + x); //Imprime a resposta
    }
}