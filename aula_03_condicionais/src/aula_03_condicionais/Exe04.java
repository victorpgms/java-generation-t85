package aula_03_condicionais;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String caracteristica1;
		String caracteristica2;
		String caracteristica3;
		
		
		System.out.println("Escolha a 1ª característica do animal - Vertebrado ou Invertebrado:");
		caracteristica1 = teclado.nextLine();
		
		
		if (caracteristica1.equalsIgnoreCase("Vertebrado")) {
			System.out.println("Escolha a 2ª característica do animal - Ave ou Mamífero:");
			caracteristica2 = teclado.nextLine();
			
			if (caracteristica2.equalsIgnoreCase("Ave")) {
				System.out.println("Escolha a 3ª característica do animal - Carnívoro ou Onívoro:");
				caracteristica3 = teclado.nextLine();
				
				if (caracteristica3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Águia");
					
				} else if (caracteristica3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Pomba");
				}
				
			} else if (caracteristica2.equalsIgnoreCase("Mamífero")) {
				System.out.println("Escolha a 3ª característica do animal - Onívoro ou Herbívoro:");
				caracteristica3 = teclado.nextLine();
				
				if (caracteristica3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Homem");
					
				} else if (caracteristica3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Vaca");
				}
			}
			
		} else {
			System.out.println("Escolha a 2ª característica do animal - Inseto ou Anelídeo:");
			caracteristica2 = teclado.nextLine();			
			
			if (caracteristica2.equalsIgnoreCase("Inseto")) {
				System.out.println("Escolha a 3ª característica do animal - Hematófago ou Herbívoro:");
				caracteristica3 = teclado.nextLine();
				
				if (caracteristica3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Pulga");
					
				} else if (caracteristica3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Lagarta");
				}
				
			} else if (caracteristica2.equalsIgnoreCase("Anelídeo")) {
				System.out.println("Escolha a 3ª característica do animal - Hematófago ou Onívoro:");
				caracteristica3 = teclado.nextLine();
				
				if (caracteristica3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Sanguessuga");
					
				} else if (caracteristica3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Minhoca");
				}
			}
		}
		
		teclado.close();
	}
}