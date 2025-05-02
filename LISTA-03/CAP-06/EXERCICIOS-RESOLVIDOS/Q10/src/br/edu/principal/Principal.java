package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String gabarito[] = new String[8], resposta[] = new String[8]; 
        int num, pontos, tot_ap = 0, perc_ap;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite a resposta da questão " + (i + 1) + ":");
            gabarito[i] = sc.next();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número do aluno " + (i + 1) + ":");
            num = sc.nextInt();
            pontos = 0;

            for (int j = 0; j < 8; j++) {
                System.out.println("Digite a resposta do aluno " + num + " à questão " + (j + 1) + ":");
                resposta[j] = sc.next();
                if (resposta[j].equals(gabarito[j])) {
                    pontos++;
                }
            }

            System.out.println("A nota do aluno " + num + " foi: " + pontos);
            if (pontos >= 6) {
                tot_ap++;
            }
        }

        perc_ap = (int)(((double) tot_ap / 10) * 100);
        System.out.println("O percentual de alunos aprovados é: " + perc_ap + "%");
    }
}
