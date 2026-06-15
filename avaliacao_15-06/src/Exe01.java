import java.util.Scanner;

public class Exe01 {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//DECLARAÇÃO DAS VARIÁVEIS
		String nome;
		int idade;
		boolean autorizacaoResp;
		
		boolean fEtaria;
		
		
		//ENTRADA DE DADOS
		
		System.out.println("**** SISTEMA DE ANÁLISE DE ACESSO ****");
		
		System.out.print("Digite o nome: ");
		nome = teclado.nextLine().toLowerCase();
		
		System.out.print("Digite a idade: ");
		idade = teclado.nextInt();
		
		System.out.print("Possui autorização dos responsáveis? (true ou false): ");
		autorizacaoResp = teclado.nextBoolean();
		
		
		//PROCESSAMENTO
		fEtaria = idade >= 18;
	
		
		//SAIDA DE DADOS
		if (fEtaria) {
			System.out.printf("\nAcesso liberado para %s.", nome);
		} else if (autorizacaoResp) {
			System.out.printf("\nAcesso liberado com autorização para %s.", nome);
		} else {
			System.out.printf("\n%s não tem acesso liberado!", nome); }
			
		teclado.close();
	}
}
	
