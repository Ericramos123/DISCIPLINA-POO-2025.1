package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite a primeira nota(peso 2): ");
			Double nota1 = scanner.nextDouble();
			System.out.println("Digite a segunda nota(peso 3): ");
			Double nota2 = scanner.nextDouble();
			
			double mediaPonderada = (nota1 * 2 + nota2 * 3) / (2 + 3);
			
			System.out.print("A média ponderada é: " + mediaPonderada);
		}
		
		

	}

}