package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, resultado;

        do {
            System.out.print("Digite o valor de a (maior que 1): ");
            a = sc.nextInt();
        } while (a <= 1);

        System.out.print("Digite o valor de b: ");
        b = sc.nextInt();
        System.out.print("Digite o valor de c: ");
        c = sc.nextInt();

        resultado = divisores(a, b, c);
        System.out.println("Soma dos inteiros divisíveis por " + a + " = " + resultado);
    }

    public static int divisores(int a, int b, int c) {
        int soma = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
