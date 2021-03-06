import java.util.Scanner;

/**Preenchimento de vetor I
*
*Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10]. Em cada posição subsequente, coloque o dobro do valor da posição anterior.
*Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.
*
*Entrada
*A entrada contém um valor inteiro (V<=50).

*Saída
*Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na posição i. O primeiro número do vetor N (N[0]) irá receber o valor de V.
*
*@author v.hofmeister@edu.pucrs.break;
*@version 2022-06-02
*/

public class Main{

      public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            int[] n = new int[10];

            n[0] = sc.nextInt();

            for (int i = 1; i < 10; i++){
                  n[i] = n[i-1] * 2;
            }

            for (int c = 0; c < 10; c++){
                  System.out.printf("N[%d] = %d\n", c, n[c]);
            }
      }
}
