public class Pares{
	public static void main(String args[]){
		int numero;
		int numeroFinal;

		numero = 1;
		numeroFinal = 100;

		while (numero <= numeroFinal){
			if (numero % 2 == 0){
				System.out.println(numero);
			}
			numero = numero + 1;
		}
	}
}