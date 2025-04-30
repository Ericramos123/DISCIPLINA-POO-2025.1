package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;
        int totalPessoas = 8;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();

            if (idade <= 15) {
                faixa1++;
            } else if (idade >= 16 && idade <= 30) {
                faixa2++;
            } else if (idade >= 31 && idade <= 45) {
                faixa3++;
            } else if (idade >= 46 && idade <= 60) {
                faixa4++;
            } else if (idade > 60) {
                faixa5++;
            }
        }

        int faixa1Porcentagem = (faixa1 * 100) / totalPessoas;
        int faixa5Porcentagem = (faixa5 * 100) / totalPessoas;

        System.out.println("\nQuantidade de pessoas em cada faixa etária:");
        System.out.println("Até 15 anos: " + faixa1);
        System.out.println("De 16 a 30 anos: " + faixa2);
        System.out.println("De 31 a 45 anos: " + faixa3);
        System.out.println("De 46 a 60 anos: " + faixa4);
        System.out.println("Acima de 60 anos: " + faixa5);

        System.out.println("\nPorcentagem de pessoas na primeira faixa etária (Até 15 anos): " + faixa1Porcentagem + "%");
        System.out.println("Porcentagem de pessoas na última faixa etária (Acima de 60 anos): " + faixa5Porcentagem + "%");
    }
}