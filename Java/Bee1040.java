/*Media
O programa recebe 4 valores com uma casa decimal que correspondem a nota de um aluno
e calcular a média dos 4 contando que terão peso 2, 3, 4 e 1, nesta ordem.
Caso a média seja 7.0 ou mais, o programa apresenta a mensagem "Aluno aprovado."
Caso a média seja menor que 5.0, deve apresentar a mensagem "Aluno reprovado."
Caso a média seja entre 5.0 e 6.9, deve haver uma nova entrada, referente a nota do exame
que sera utilizado, junto da média anterior, para realizar a média final.
Caso a média final seja igual ou maior que 5.0, deve apresentar a mensagem "Aluno aprovado."
Caso a média final seja menor que 5.0, deve apresentar a mensagem "Aluno reprovado."
v.hofmeister@edu.pucrs.br
29/03/2022
*/

import java.util.Scanner;

public class Media{ //Mudar classe para Main para o Bee
	public static void main(String args[]){
		Scanner leitor;
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		double notaExame;
		double mediaFinal;

		System.out.println("MEDIA"); //Retirar para o Bee
		System.out.println("Insira as notas"); //Retirar para o Bee

		leitor = new Scanner(System.in);
		nota1 = leitor.nextDouble();
		nota2 = leitor.nextDouble();
		nota3 = leitor.nextDouble();
		nota4 = leitor.nextDouble();
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;
		media = Math.round(media * 10.0) / 10.0;

		System.out.printf("Media: %.1f\n", media);

		if (media >= 7.0){ //Se a média for igual ou maior que 7.0
			System.out.println("Aluno aprovado.");
		}
		else{
			if (media >= 5.0){ //Se a média for entre 5.0 e 6.9
				System.out.println("Aluno em exame.");
				
				System.out.println("Insira a nota do exame"); //Retirar para o Bee
				notaExame = leitor.nextDouble();

				System.out.printf("Nota do exame: %.1f\n", notaExame);
				mediaFinal = (notaExame + media) / 2;

				if (mediaFinal >= 5.0){ //Se a media final for igual ou maior que 5.0
					System.out.println("Aluno aprovado.");
					System.out.printf("Media final: %.1f\n", mediaFinal);
				}
				else{ //Se a media final for menor que 5.0
					System.out.println("Aluno reprovado.");
					System.out.printf("Media final: %.1f\n", mediaFinal);
				}
			}
			else{ //Se a média for menor que 5.0
				System.out.println("Aluno reprovado.");
			}
		}
	}
}