package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero1 = scanner.nextDouble();
		System.out.print("Digite outro número: ");
		double numero2 = scanner.nextDouble();
		System.out.print("Digite outro número: ");
		double numero3 = scanner.nextDouble();
		double resultado = numero1 * numero2 * numero3;
		System.out.println("O resultado da multiplicação é:" + resultado);
		
		scanner.close();

	}

}