package aula_02_operadores;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		float novoSalario;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o salário: ");
		salario = teclado.nextFloat();
		
		System.out.print("Informe o abono: ");
		abono = teclado.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nO valor do salário é: R$ %.2f \nO valor do abono é: R$ %.2f \nO valor do novo salário é de: %.2f", salario, abono, novoSalario);

		
		teclado.close();

	}

}
