/*Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um
laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual
de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente
o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém
um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando
o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de
cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.

v.hofmeister@edu.pucrs.br
25/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class Experiencias{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int testes, quantiaC, quantiaR, quantiaS, nCobaias, totalCobaias;
		double percentilC, percentilR, percentilS, totalDb;
		String cobaias;

		teclado = new Scanner(System.in);
		testes = teclado.nextInt();
		quantiaC = 0;
		quantiaR = 0;
		quantiaS = 0;
		totalCobaias = 0;


		for (int i = 1; i <= testes; i++){
			nCobaias = teclado.nextInt();
			cobaias = teclado.nextLine();

			totalCobaias += nCobaias;

			if(cobaias.equals(" C")){
				quantiaC += nCobaias;
			} else if (cobaias.equals(" R")){
				quantiaR += nCobaias;
			} else if (cobaias.equals(" S")){
				quantiaS += nCobaias;
			}
		}

		totalDb = totalCobaias;

		percentilC = (quantiaC / totalDb) * 100.0;
		percentilR = (quantiaR / totalDb) * 100.0;
		percentilS = (quantiaS / totalDb) * 100.0;

		System.out.printf("Total: %d cobaias\nTotal de coelhos: %d\nTotal de ratos: %d\nTotal de sapos: %d\n", totalCobaias, quantiaC, quantiaR, quantiaS);
		System.out.printf("Percentual de coelhos: %.2f %%\nPercentual de ratos: %.2f %%\nPercentual de sapos: %.2f %%\n", percentilC, percentilR, percentilS);
	}
}