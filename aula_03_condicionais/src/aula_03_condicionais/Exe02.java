package aula_03_condicionais;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int n1;
		
		boolean positivo;
		boolean par;
		
		System.out.print("Digite um número: ");
		n1 = teclado.nextInt();
		
		positivo = n1 > 0;
		par = n1 % 2 == 0;
		
		 if (positivo && par) {
			System.out.printf("O número %d é par e positivo.", n1);
		}else if (positivo && !par) {
			System.out.printf("O número %d é ímpar e positivo.", n1);
		}else if (!positivo && par) {
			System.out.printf("O número %d é par e negativo.", n1);
		}else if (!positivo && !par) {
			System.out.printf("O número %d é ímpar e negativo.", n1);
		}else {
			System.out.printf("\nO número %d é zero.", n1);
		}
		
		
		teclado.close();
	}

}
