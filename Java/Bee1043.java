/*Triangulo
O programa deve receber três valores reais e determinar se formam um triangulo ou não.
Se forma um triângulo, calcula o perímetro.
Se não, calcula a área do trapézio que tem A e B como base e C como altura.
v.hofmeister@edu.pucrs.br
11/04/2021
*/
import java.util.Scanner;

public class Triangulo{//Trocar nome da class para Main para o Bee
	public static void main(String args[]){
		Scanner leitor;
		double valorA;
		double valorB;
		double valorC;

		System.out.println("Trinagulo");//Remover para o Bee
		System.out.println("Insira os valores");//Remover para o Bee
		System.out.println();//Remover para o Bee

		leitor = new Scanner(System.in);
		valorA = leitor.nextDouble();
		valorB = leitor.nextDouble();
		valorC = leitor.nextDouble();

		if (valorA < valorB + valorC && valorB < valorA + valorC && valorC < valorA + valorB){
			double perimetro = valorA + valorB + valorC;
			System.out.println("É Triangulo!");//Remover para o Bee
			System.out.printf("Perimetro = %.1f\n", perimetro);
		}
		else{
			double area = ((valorA + valorB) * valorC) / 2;
			System.out.println("Não é Triangulo");//Remover para o Bee
			System.out.printf("Area = %.1f\n", area);
		}
	}
}