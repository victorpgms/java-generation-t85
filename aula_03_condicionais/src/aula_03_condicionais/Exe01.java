package aula_03_condicionais;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int valorA;
		int valorB;
		int valorC;
		
		System.out.print("Digite o valor A: ");
		valorA = teclado.nextInt();
		
		System.out.print("Digite o valor A: ");
		valorB = teclado.nextInt();

		System.out.print("Digite o valor A: ");
		valorC = teclado.nextInt();
		
		
		if ((valorA + valorB) > valorC) {
			System.out.printf("A soma A + B é maior do que C");
		} else if ((valorA + valorB) < valorC) {
			System.out.printf("A soma A + B é menor do que C");
		} else {
			System.out.printf("A soma A + B é igual do que C");

		}
		
		
		teclado.close();

	}

}
