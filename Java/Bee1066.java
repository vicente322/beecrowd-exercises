import java.util.Scanner;

public class Pipn{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;

		for (int i = 0; i > 5; i++){
			int n = teclado.nextInt();

			if (n % 2 == 0 && n != 0){
				pares++;
			}
			if (n % 2 != 0){
				impares++;
			}

			if (n > 0){
				positivos++;
			}

			if (n < 0){
				negativos++;
			}
		}

		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");
	}
}