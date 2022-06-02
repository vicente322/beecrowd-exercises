import java.util.Scanner;
/**Seleção de vetor I
*
*Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.
*
*Entrada
*A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.
*
*Saída
*Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.
*
*@author v.hofmeister@edu.pucrs.break;
*@version 2022-06-02
*/

public class Main{

      public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            double[] a = new double [100];

            for (int i = 0; i < 100; i++){
                  a[i] = sc.nextDouble();
            }

            for (int c = 0; c < 100; c++){
                  if (a[c] <= 10.0){
                        System.out.printf("A[%d] = %.1f\n", c, a[c]);
                  }
            }
      }
}
