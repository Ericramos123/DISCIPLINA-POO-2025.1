package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numTermos, i = 4;
        int num1 = 2, num2 = 7, num3 = 3;

        System.out.print("Digite o número de termos: ");
        numTermos = scanner.nextInt();

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        System.out.print(num3 + " ");

        while (i <= numTermos) {
            num1 = num1 * 2;
            System.out.print(num1 + " ");
            i++;
            if (i <= numTermos) {
                num2 = num2 * 3;
                System.out.print(num2 + " ");
                i++;
                if (i <= numTermos) {
                    num3 = num3 * 4;
                    System.out.print(num3 + " ");
                    i++;
                }
            }
        }

        scanner.close();
    }
}