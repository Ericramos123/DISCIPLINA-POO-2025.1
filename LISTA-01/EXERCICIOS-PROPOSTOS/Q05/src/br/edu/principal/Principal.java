package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Digite um preço: ");
		Double preco = scanner.nextDouble();

		double desconto = preco * 0.10;
		double novoPreco = preco - desconto;

		System.out.println("O valor do desconto é: R$ " + desconto);
		System.out.println("O novo preço do produto com 10% de desconto é: R$ " + novoPreco);
	}
	}

}