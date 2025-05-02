package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, s;

        System.out.print("Digite o primeiro número positivo: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número positivo: ");
        num2 = sc.nextInt();

        s = somar(num1, num2);

        System.out.println("Soma = " + s);
    }

    public static int somar(int num1, int num2) {
        int s = 0;
        for (int i = num1 + 1; i < num2; i++) {
            s += i;
        }
        return s;
    }
}
