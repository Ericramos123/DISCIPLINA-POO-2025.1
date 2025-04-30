package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, media;
        int tr = 0, te = 0, ta = 0;
        double totalClasse = 0, mediaClasse;

        for (int cont = 1; cont <= 6; cont++) {
            System.out.print("Digite a primeira nota do aluno " + cont + ": ");
            n1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota do aluno " + cont + ": ");
            n2 = scanner.nextDouble();

            media = (n1 + n2) / 2;
            System.out.printf("Média: %.2f\n", media);

            if (media <= 3) {
                tr++;
                System.out.println("Reprovado");
            } else if (media > 3 && media < 7) {
                te++;
                System.out.println("Exame");
            } else {
                ta++;
                System.out.println("Aprovado");
            }

            totalClasse += media;
        }

        mediaClasse = totalClasse / 6;
        System.out.println("Total de alunos reprovados: " + tr);
        System.out.println("Total de alunos em exame: " + te);
        System.out.println("Total de alunos aprovados: " + ta);
        System.out.printf("Média da classe: %.2f\n", mediaClasse);

        scanner.close();
    }
}