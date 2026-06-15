import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		//DECLARAÇÃO DE VARIÁVEIS
		float n1;
		float n2;
		
		int operacao;
		
		
		//ENTRADA DE DADOS
		System.out.println("**** Simulação de calculadora ****");
		
		System.out.print("Digite o 1º valor: ");
		n1 = teclado.nextFloat();
		
		System.out.print("Digite o 2º valor: ");
		n2 = teclado.nextFloat();
		
		System.out.println(""
				+ "\n1 - Soma"
				+ "\n2 - Subtração"
				+ "\n3 - Multiplicação"
				+ "\n4 - Divisão");
		System.out.print("\nDigite o código da operação: ");
		operacao = teclado.nextInt();
		
		
		//SAIDA E PROCESSAMENTO DE DADOS
		switch (operacao) {
		case 1: {
			System.out.printf("\n%.1f + %.1f = %.1f", n1, n2, n1 + n2);
			System.out.printf("\nOperação SOMA - Resultado = %.1f", n1 + n2);
			break;
		}
		case 2: {
			System.out.printf("\n%.1f - %.1f = %.1f", n1, n2, n1 - n2);
			System.out.printf("\nOperação SUBTRAÇÃO - Resultado = %.1f", n1 - n2);
			break;
		}
		case 3: {
			System.out.printf("\n%.1f * %.1f = %.1f", n1, n2, n1 * n2);
			System.out.printf("\nOperação MULTIPLICAÇÃO - Resultado = %.1f", n1 * n2);
			break;
		}
		case 4: {
			if (n2 == 0) {
				System.out.println("\nNão é possível dividir por zero.");
			}else {
			System.out.printf("\n%.1f / %.1f = %.1f", n1, n2, n1 / n2);
			System.out.printf("\nOperação DIVISÃO - Resultado = %.1f", n1 / n2);
			}
			break;
		}
		default:
			System.out.println("Operação inválida");
		}
		
		
		teclado.close();
	}

}
