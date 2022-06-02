import java.util.Scanner;

/**Sentença Daçante
*
*Uma sentença é chamada de dançante se sua primeira letra for maiúscula e cada letra subsequente for o oposto da letra anterior. Espaços devem ser
*ignorados ao determinar o case (minúsculo/maiúsculo) de uma letra. Por exemplo, "A b Cd" é uma sentença dançante porque a primeira letra ('A') é maiúscula,
*a próxima letra ('b') é minúscula, a próxima letra ('C') é maiúscula, e a próxima letra ('d') é minúscula.
*
*Entrada
*A entrada contém vários casos de teste. Cada caso de teste é composto por uma linha que contém uma sentença, que é uma string que contém entre 1 e 50
*caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').
*
*Saída
*Transforme a sentença de entrada em uma sentença dançante (conforme o exemplo abaixo) trocando as letras para minúscula ou maiúscula onde for necessário.
*Todos os espaços da sentença original deverão ser preservados, ou seja, " sentence " deverá ser convertido para " SeNtEnCe ".
*
*@author v.hofmeister@edu.pucrs.break;
*@version 2022-06-01+
*/

public class Main{

      public static void main (String args[]){
            Scanner sc;
            String word, dancingWord;
            int c;
            char cWord;

            sc = new Scanner(System.in);
            word = sc.nextLine();
            sc.close();

            dancingWord = "";
            c = 0;

            word = word.toUpperCase();

            for (int i = 0; i <word.length(); i++){

                  cWord = word.charAt(i);

                  if (cWord >= 'A' && cWord <= 'Z'){

                        if (c == 0){
                              dancingWord = dancingWord + Character.toUpperCase(cWord);

                              c = 1;
                        }
                        else if (c == 1){
                              dancingWord = dancingWord + Character.toLowerCase(cWord);

                              c = 0;
                        }
                  }
                  else {
                        dancingWord = dancingWord + cWord;
                  }

            }

            System.out.println(dancingWord);

      }
}
