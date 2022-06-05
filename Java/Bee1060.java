import java.util.Scanner;

public class Positivos{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int cont = 0;

		System.out.println("Insira 6 valores positivos ou negativos");

		for(int i = 0; i < 6; i++){
			double n = teclado.nextDouble();
			if (n > 0) cont++;
		}

		System.out.println(cont + " valores positivos");
	}
}