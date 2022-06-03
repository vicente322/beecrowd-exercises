import java.util.Scanner;

public class Imposto{
	public static void main(String args[]){
		Scanner teclado;
		double renda;
		double isento;

		System.out.println("Imposto");
		System.out.println("Insira a renda:");

		teclado = new Scanner(System.in);
		renda = teclado.nextDouble();
		teclado.close();

		if (renda <= 2000.00){
			System.out.println("Isento");
		}
		else{

			double imposto;

			if (renda <= 3000.00){
				imposto = (renda - 2000.00) * 0.08;	
			}
			else{
				if (renda <= 4500.00){
					imposto = ((renda - 3000.00) * 0.18) + (1000 * 0.08);
				}
				else{
					imposto = ((renda - 4500.00) * 0.28) + (1000 * 0.08) + (1500.00 * 0.18);
				}
			}

			System.out.printf("R$ %.2f\n", imposto);
		}


	}
}