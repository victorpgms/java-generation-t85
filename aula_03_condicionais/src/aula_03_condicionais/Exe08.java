package aula_03_condicionais;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int op;
		float saldo = 1000;
		float valorMov = 0;
		
		System.out.println("Tabela de operações");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		System.out.print("\nDigite o código da operação desejada: ");
		op = teclado.nextInt();
		
		
		switch (op) {
		case 1: {
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;
		}
		case 2: {
			System.out.println("Operação - Saque");
			System.out.println("\nDigite o valor do saque: ");
			valorMov = teclado.nextFloat();
			
			if (valorMov > saldo) {
				System.out.println("Saldo insuficiente!");
				System.out.printf("\nSaldo atual: %.2f", saldo);
			} else {
			System.out.printf("Novo saldo: R$ %.2f", saldo - valorMov);
			}
			break;
		}
		case 3: {
			System.out.println("Operação - Depósito");
			System.out.println("\nDigite o valor do depósito: ");
			valorMov = teclado.nextFloat();
			System.out.printf("Novo saldo: R$ %.2f", saldo + valorMov);
			break;
		}		
		default:
			System.out.println("Operação inválida!");
			
		}
		
		
		teclado.close();
	}

}
