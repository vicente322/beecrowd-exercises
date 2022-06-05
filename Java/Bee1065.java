import java.util.Scanner;

public class Pares{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int cont = 0;

		for (int i = 0; i < 5; i++){
			int n = teclado.nextInt();
			if (n % 2 == 0){
				cont++;
			}
		}

		System.out.println(cont + " valores pares");
	}
}