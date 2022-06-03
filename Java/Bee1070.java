import java.util.Scanner;

public class SeisImpares{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		teclado.close();
		int cont = 0;

		while (cont < 6){
			if (x % 2 != 0){
				System.out.println(x);
				cont++;
			}
			x++;
		}
	}
}