/*A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS.
Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. Logo após escrever a mensagem "Novo grenal
(1-sim 2-nao)" e solicitar uma resposta. Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols
marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente. Em seguida
háverá um inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". Quando o algoritmo for encerrado devem ser
mostradas as estatísticas conforme a descrição apresentada acima. Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.

v.hofmeister@edu.pucrs.br
29/04/2022
*/
import java.util.Scanner;
import java.io.IOException;

public class Grenais{
	public static void main(String args[]) throws IOException{
		Scanner teclado;
		int golsInter, golsGremio, grenais, empates, vitoriaGremio, vitoriaInter, resposta;
		String vencedor;

		teclado = new Scanner(System.in);
		grenais = 0;
		empates = 0;
		vitoriaGremio = 0;
		vitoriaInter = 0;
		resposta = 1;
		vencedor = "";

		while (resposta != 2){
			golsInter = teclado.nextInt();
			golsGremio = teclado.nextInt();

			grenais++;

			if (golsInter == golsGremio){
				empates++;
			} else if (golsInter > golsGremio){
				vitoriaInter++;
			} else if (golsInter < golsGremio){
				vitoriaGremio++;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			resposta = teclado.nextInt();

			while (resposta != 1 && resposta != 2){
				System.out.println("Novo grenal (1-sim 2-nao)");
				resposta = teclado.nextInt();
			}
		}

		teclado.close();

		if (vitoriaInter > vitoriaGremio){
			vencedor = "Inter venceu mais";
		} else if (vitoriaInter < vitoriaGremio){
			vencedor = "Gremio venceu mais";
		} else if (vitoriaInter == vitoriaGremio){
			vencedor = "Nao houve vencedor";
		}

		System.out.printf("%d grenais\n", grenais);
		System.out.printf("Inter:%d\n", vitoriaInter);
		System.out.printf("Gremio:%d\n", vitoriaGremio);
		System.out.printf("Empates:%d\n", empates);
		System.out.println(vencedor);
	}
}