package aula_05_array2;

public class Exe03 {
	public static void main(String[] args) {
		
		int soma1 = 0, soma2 = 0, regressor = 2;
		
		
		int matrizInt [][] = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
		};
		

		//diagonal principal
		System.out.println("\nElementos da Diagonal Principal:");
		for ( int coluna = 0; coluna < matrizInt.length; coluna ++) {
			System.out.print(matrizInt[coluna][coluna] + " ");
			soma1 += matrizInt[coluna][coluna];	
		}
			
		//diagonal secundária
		System.out.println("\nElementos da Diagonal Secundária:");
		for ( int coluna = 0; coluna < matrizInt.length; coluna ++) {
			System.out.print(matrizInt[coluna][regressor] + " ");
			soma2 += matrizInt[coluna][regressor];
			regressor--;	
		}
			
		//Soma da diagonal principal
		System.out.print("\nSoma dos elementos da Diagonal Principal: \n" + soma1);

			
		//Soma da diagonal secundária
		System.out.print("\nSoma dos elementos da Diagonal Secundária: \n" + soma2);
			
		
	}

}
