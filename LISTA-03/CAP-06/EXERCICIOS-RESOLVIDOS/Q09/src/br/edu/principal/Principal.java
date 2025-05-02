package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int voo[] = new int[12], lugares[] = new int[12];
        int i, op, op2, num_voo;
        String origem[] = new String[12], destino[] = new String[12];
        String local;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 12; i++) {
            System.out.println("Voo: ");
            voo[i] = sc.nextInt();
            System.out.println("Origem: ");
            origem[i] = sc.next();
            System.out.println("Destino: ");
            destino[i] = sc.next();
            System.out.println("Lugares: ");
            lugares[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("1 - Consultar: ");
            System.out.println("2 - Reservar: ");
            System.out.println("3 - Finalizar: ");
            System.out.print("Digite a opção: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.println("1 - Consultar por voo: ");
                System.out.println("2 - Consultar por origem: ");
                System.out.println("3 - Consultar por destino: ");
                System.out.print("Digite a opção: ");
                op2 = sc.nextInt();

                if (op2 == 1) {
                    System.out.println("Digite o número do voo: ");
                    num_voo = sc.nextInt();
                    i = 0;
                    while (i < 12 && voo[i] != num_voo) {
                        i++;
                    }
                    if (i >= 12) {
                        System.out.println("Voo inexistente");
                    } else {
                        System.out.println("Número do voo: " + voo[i]);
                        System.out.println("Local de origem: " + origem[i]);
                        System.out.println("Destino: " + destino[i]);
                        System.out.println("Lugares disponíveis: " + lugares[i]);
                    }
                }

                if (op2 == 2) {
                    System.out.println("Digite o local de origem: ");
                    local = sc.next();
                    i = 0;
                    while (i < 12) {
                        if (local.equals(origem[i])) {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Local de origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                        i++;
                    }
                }

                if (op2 == 3) {
                    System.out.println("Digite o local de destino: ");
                    local = sc.next();
                    i = 0;
                    while (i < 12) {
                        if (local.equals(destino[i])) {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Local de origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                        i++;
                    }
                }
            }

            if (op == 2) {
                System.out.println("Digite o número do voo desejado: ");
                num_voo = sc.nextInt();
                i = 0;
                while (i < 12 && voo[i] != num_voo) {
                    i++;
                }
                if (i >= 12) {
                    System.out.println("Número do voo não encontrado");
                } else {
                    if (lugares[i] == 0) {
                        System.out.println("Voo lotado");
                    } else {
                        lugares[i]--;
                        System.out.println("Reserva confirmada!");
                    }
                }
            }

            if (op == 3) {
                break;
            }
        }
    }
}
