package aula_02_operadores;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float salarioBruto, adicionaoNot, horasExtras, descontosSal, salarioLiquido;
		
		System.out.print("Digite o salário: ");
		salarioBruto = teclado.nextFloat();
		
		System.out.print("Digite o adicional noturno: ");
		adicionaoNot = teclado.nextFloat();
		
		System.out.print("Digite as horas extras: ");
		horasExtras = teclado.nextFloat();
		
		System.out.print("Digite o descontos: ");
		descontosSal = teclado.nextFloat();
		
		
		salarioLiquido = salarioBruto + adicionaoNot + (horasExtras * 5) - descontosSal;
		
		System.out.printf("\nO valor do salário líquido é de: R$ %.2f", salarioLiquido);
				
		
		
		teclado.close();
	}

}
