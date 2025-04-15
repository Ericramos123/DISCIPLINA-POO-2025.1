package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite um número: ");
	Double numero1 = scanner.nextDouble();
	System.out.print("Digite outro número: ");
	Double numero2 = scanner.nextDouble();
	
	if (numero2 == 0){
		System.out.println("O segundo número não pode ser 0");
	}
	else {
		System.out.print(numero1 / numero2);
	}
	}

}