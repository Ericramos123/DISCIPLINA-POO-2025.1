package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] qtd = new int[10];     
        int[] preco = new int[10]; 
        int i, ind;
        double tot_geral = 0, tot_vend, comissao;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.println("Digite a quantidade do Produto " + (i + 1) + ":");
            qtd[i] = sc.nextInt();
            System.out.println("Digite o preço do Produto " + (i + 1) + ":");
            preco[i] = sc.nextInt();
        }

        System.out.println("\nResumo das Vendas:");
        for (i = 0; i < 10; i++) {
            tot_vend = qtd[i] * preco[i];
            System.out.println("Produto " + (i + 1) + ":");
            System.out.println("  Quantidade: " + qtd[i]);
            System.out.println("  Preço: " + preco[i]);
            System.out.println("  Total da venda: " + tot_vend);
            tot_geral += tot_vend;
        }

        comissao = tot_geral * 0.05;
        System.out.println("\nTotal geral das vendas: R$ " + tot_geral);
        System.out.println("Comissão (5%): R$ " + comissao);

        int maiorQtd = qtd[0];
        ind = 0;
        for (i = 1; i < 10; i++) {
            if (qtd[i] > maiorQtd) {
                maiorQtd = qtd[i];
                ind = i;
            }
        }

        System.out.println("\nProduto mais vendido:");
        System.out.println("  Produto " + (ind + 1));
        System.out.println("  Quantidade: " + maiorQtd);
        System.out.println("  Preço: R$ " + preco[ind]);

        sc.close();
    }
}
