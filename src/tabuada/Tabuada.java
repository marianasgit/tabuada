package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int multiplicando, multiplicador, produto; 
		int contador = 0;
		
		System.out.println("          TABUADA         ");
		System.out.println("----------------------------");
		System.out.println();
		
		System.out.print("Qual o multiplicando desejado? ");
		multiplicando = leitor.nextInt();
		System.out.println();
		
		System.out.print("Qual o multiplicador máximo desejado? ");
		multiplicador = leitor.nextInt();
		leitor.close();
		
		System.out.println();
		
		System.out.println("----------------------------");
		System.out.println("TABUADA DO " + multiplicando);
		
		System.out.println("----------------------------");
		
		while (contador <= multiplicador) {
			produto = multiplicando * contador;
			
			System.out.println(multiplicando + " x " + contador + " = " + produto);
			
			contador++;
			
		}
		
		System.out.println("----------------------------");
		

	}

}
