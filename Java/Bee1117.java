/*Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral.
Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota
deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas
notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor
deve ser apresentado com duas casas após o ponto decimal.

v.hofmeister@edu.pucrs.br
28/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class NotasValidas{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		double nota1, nota2, media;

		teclado = new Scanner(System.in);
		nota1 = teclado.nextDouble();

		while (nota1 > 10.0 || nota1 < 0.0){
			System.out.println("nota invalida");
			nota1 = teclado.nextDouble();
		}

		nota2 = teclado.nextDouble();

		while (nota2 > 10.0 || nota2 < 0.0){
			System.out.println("nota invalida");
			nota2 = teclado.nextDouble();
		}

		media = (nota1 + nota2) / 2.0;

		System.out.printf("media = %.2f\n", media);
	}
}