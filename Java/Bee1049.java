import java.util.Scanner;

public class Animal{ //Trocar nome para Bee

	public static void main(String args[]){

		Scanner teclado;
		String c1; //Caracteristica 1
		String c2; //Caracteristica 2
		String c3; //Caracteristica 3
		String animal;

		System.out.println("Animal");
		System.out.println("Insira as 3 caracteristicas do animal:");

		teclado = new Scanner(System.in);
		c1 = teclado.nextLine();
		c2 = teclado.nextLine();
		c3 = teclado.nextLine();
		teclado.close();

		System.out.println(c1 + " " + c2 + " " + c3);

		if (c1 == "vertebrado"){

			if (c2 == "ave"){

				if (c3 == "carnivoro"){
					System.out.println("aguia");
				}

				if (c3 == "onivoro"){
					System.out.println("pomba");
				}
			}

			if (c2 == "mamifero"){

				if (c3 == "onivoro"){
					System.out.println("homem");
				}

				if (c3 == "herbivoro"){
					System.out.println("vaca");
				}
			}
		}

		if (c1 == "invertebrado"){

			if (c2 == "inseto"){

				if (c3 == "hematofago"){
					System.out.println("pulga");
				}

				if (c3 == "herbivoro"){
					System.out.println("lagarta");
				}
			}

			if (c2 == "anelideo"){

				if (c3 == "hematofago"){
					System.out.println("sanguessuga");
				}

				if (c3 == "onivoro"){
					System.out.println("minhoca");
				}
			}
		}
	}
}