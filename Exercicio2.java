package matrizExercicios;

public class Exercicio2 {

	public static void main(String[] args) {
	
		char A [][] = {
				{'*','*','*','*'},		
				{'*','*','*',' '},
				{'*','*',' ',' '},
				{'*',' ',' ',' '},
				};
		
		System.out.println("Desenho 1");
		for(char [] Letra:A) {
			for(char coluna:Letra) {
			System.out.print(coluna+"\t");
		}System.out.println(" ");

	}
		char B [][] = {
				{' ',' ',' ','*'},		
				{' ',' ','*',' '},
				{' ','*',' ',' '},
				{'*',' ',' ',' '},
				};
		
		System.out.println("Desenho 2");
		for(char[] Letra:B) {
			for(char coluna:Letra) {
			System.out.print(coluna+"\t");
		}System.out.println(" ");
}
		char C [][] = {
				{' ',' ','*',' ',' '},		
				{' ',' ','*',' ',' '},
				{'*','*','*','*','*'},		
				{' ',' ','*',' ',' '},
				{' ',' ','*',' ',' '},		
				
				};
		
		System.out.println("Desenho 3");
		for(char[] Letra:C) {
			for(char coluna:Letra) {
			System.out.print(coluna+"\t");
		}System.out.println(" ");
	}
		
		
	}
	
}