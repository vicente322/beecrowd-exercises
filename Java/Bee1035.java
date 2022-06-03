
/**
 * TesteSelecao é um programa que deve analisar 4 valores inteiros, A B C e D, e determinar se são aceitas ou não
 * As variaveis são aceitas se atenderem todos os seguintes requerimentos:
 * - B ser maior que C;
 * - D ser maior que A;
 * - C + D ser maior que A + B;
 * - C e D ambos positivos;
 * - A ser par;
 * 
 * @author v.hofmeister@edu.pucrs.br
 * @version 26/03/2022
 */

import java.util.Scanner;

public class TesteSelecao{
    public static void main(String args[]){
        Scanner leitor;
        int A;
        int B;
        int C;
        int D;
        int verificador1;//Verifica se B > C
        int verificador2;//Verifica se D > A
        int verificador3;//Verifica se C + D > A + B
        int verificador4;//Verifica se C é positivo
        int verificador5;//Verifica se D é positivo
        int verificador6;//Verifica se A é par
        int verificadorFinal;
        
        leitor = new Scanner(System.in);
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();
        
        if (B > C)
        verificador1 = 1;
        else
        verificador1 = 0;
        
        if (D < A)
        verificador2 = 1;
        else
        verificador2 = 0;
        
        if (C + D > A + B)
        verificador3 = 1;
        else
        verificador3 = 0;
        
        if (C > 0)
        verificador4 = 1;
        else
        verificador4 = 0;
        
        if (D > 0)
        verificador5 = 1;
        else
        verificador5 = 0;
        
        if (A %2 == 0)
        verificador6 = 1;
        else
        verificador6 = 0;
        
        verificadorFinal = verificador1 + verificador2 + verificador3 + verificador4 + verificador5 + verificador6;
        
        if (verificadorFinal == 6)
        System.out.println("Valores aceitos");
        else
        System.out.println("Valores nao aceitos");
    }
}