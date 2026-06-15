package aula_03_condicionais;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String colaborador;
		int cargo;
		float salario;

		System.out.println("*  Tabela de reajuste  *");
		System.out.println("1 - Gerente       - 10%");
		System.out.println("2 - Vendedor      -  7%");
		System.out.println("3 - Supervisor    -  9%");
		System.out.println("4 - Motorista     -  6%");
		System.out.println("5 - Estoquista    -  5%");
		System.out.println("6 - Técnico de TI -  8%");
		
		
		System.out.print("Digite o nome do colaborador: ");
		colaborador = teclado.nextLine();
		
		System.out.print("Digite o nº do cargo: ");
		cargo = teclado.nextInt();
		
		System.out.print("Digite o salário atual: ");
		salario = teclado.nextFloat();
		
		switch (cargo) {
		case 1: {
			System.out.printf("\nNome do colaborador: %s", colaborador);	
			System.out.printf("\nCargo: Gerente");	
			System.out.printf("\nSalário: R$ %.2f", (salario * 1.1));	
			break;
		}
		case 2: {
			System.out.printf("\nNome do colaborador: %s", colaborador);	
			System.out.printf("\nCargo: Vendedor");	
			System.out.printf("\nSalário: R$ %.2f", (salario * 1.07));	
			break;
		}
		case 3: {
			System.out.printf("\nNome do colaborador: %s", colaborador);	
			System.out.printf("\nCargo: Supervisor");	
			System.out.printf("\nSalário: R$ %.2f", (salario * 1.09));	
			break;
		}
		case 4: {
			System.out.printf("\nNome do colaborador: %s", colaborador);	
			System.out.printf("\nCargo: Motorista");	
			System.out.printf("\nSalário: R$ %.2f", (salario * 1.06));	
			break;
		}
		case 5: {
			System.out.printf("\nNome do colaborador: %s", colaborador);	
			System.out.printf("\nCargo: Estoquista");	
			System.out.printf("\nSalário: R$ %.2f", (salario * 1.05));	
			break;
		}
		case 6: {
			System.out.printf("\nNome do colaborador: %s", colaborador);	
			System.out.printf("\nCargo: Técnico de TI");	
			System.out.printf("\nSalário: R$ %.2f", (salario * 1.08));	
			break;
		}
		default:
			System.out.println("\nCargo inexistente.");
			
		}
		
		
		
		teclado.close();

	}

}
