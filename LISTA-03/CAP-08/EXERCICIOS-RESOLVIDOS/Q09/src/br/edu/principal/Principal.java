package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maiorMenor();
    }

    public static void maiorMenor() {
        Scanner sc = new Scanner(System.in);
        int num, maior, menor;

        System.out.print("Digite o 1º número: ");
        num = sc.nextInt();
        maior = num;
        menor = num;

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
    }
}
