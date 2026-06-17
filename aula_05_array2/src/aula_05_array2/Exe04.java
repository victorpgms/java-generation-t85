package aula_05_array2;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int qtAlunos = 3;
		int qtNotas = 4;
		
		double notas [][] = new double [qtAlunos][qtNotas];
		double mediaNotas [] = new double [qtAlunos];
		
		double somaNotas = 0, mediaNotasAluno = 0;
		
		//Inserir todas as notas
		System.out.println("\n*** LANÇAMENTO DE NOTAS ***");
		for (int alunos = 0; alunos < notas.length; alunos++) {
			for (int notaAluno = 0; notaAluno < notas[alunos].length; notaAluno++) {
				System.out.printf("\nDigite a %dª nota do %dº aluno: ", notaAluno+1, alunos+1);
				notas [alunos][notaAluno] = leia.nextDouble();				
				
			}
		}
		
		//Ler todas as notas
		System.out.println("\n*** TODAS AS NOTAS DOS ALUNOS ***");
		for (int alunos = 0; alunos < notas.length; alunos++) {
			for (int notaAluno = 0; notaAluno < notas[alunos].length; notaAluno++) {
				System.out.printf("\n%dª nota do %dº = %.1f", notaAluno+1, alunos+1, notas [alunos][notaAluno]);
				
			}
		}
		
		
		//processamento - 
		for (int alunos = 0; alunos < notas.length; alunos++) {
			somaNotas = 0;
			
			//somar notas individuais de cada aluno
			for (int notaAluno = 0; notaAluno < notas[alunos].length; notaAluno++) {

				somaNotas += notas [alunos][notaAluno];
				
			}
			
			//media individuais de cada aluno
			mediaNotasAluno = somaNotas / notas[alunos].length;
			
			//inserir médias individuais de cada aluno no vetor
			for (int mediaNotaInd = 0; mediaNotaInd < notas[alunos].length; mediaNotaInd++) {
	
				mediaNotas [alunos] = mediaNotasAluno;
			}
			
		}
		
		// escrever medias individuais de cada aluno
		System.out.println("");
		System.out.println("\n*** MÉDIAS FINAIS PARA CADA ALUNO ***");
		for (int alunosMediaFinal = 0; alunosMediaFinal < mediaNotas.length; alunosMediaFinal++) {
			System.out.printf("\nMédia do %dº aluno: %.1f", alunosMediaFinal+1, mediaNotas[alunosMediaFinal]);
		}
		
		
		
		
		leia.close();
		
	}

}
