/*Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.

v.hofmeister@edu.pucrs.br
04/05/2022
*/
import java.util.Scanner;

public class Divisores1{
	public static void main(String args[]){
		Scanner sc;
		int n, divisor;

		sc = new Scanner(System.in);
		n = sc.nextInt();
		divisor = 1;

		while (divisor <= n){
			if (n % divisor == 0){
				System.out.println(divisor);
			}

			divisor++;
		}
	}
}