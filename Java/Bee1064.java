import java.util.Scanner;

public class MediaPositivos{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		double soma = 0;
		double media;

		for (int i = 0; i < 6; i++){
			double n = teclado.nextDouble();
			if (n > 0){
				cont++;
				soma = soma + n;
			}
		}

		media = soma / cont;

		System.out.println(cont + " valores positivos");
		System.out.printf("%.1f\n",media);
	}
}