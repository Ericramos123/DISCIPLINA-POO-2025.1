package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        double precoIngresso = 5.00;
        double precoFinal = 1.00;
        double despesas = 200.00;
        int ingressosVendidos = 120;
        double lucroMaximo = 0.0;
        double precoMaximo = 0.0;
        int ingressosMaximo = 0;

        System.out.println("Preço do Ingresso | Quantidade Vendida | Lucro Esperado");

        while (precoIngresso >= precoFinal) {
            int vendaAtual = ingressosVendidos + (int)((5 - precoIngresso) / 0.50) * 26;
            double lucro = (precoIngresso * vendaAtual) - despesas;

            System.out.printf("R$ %.2f          | %d                 | R$ %.2f\n", precoIngresso, vendaAtual, lucro);

            if (lucro > lucroMaximo) {
                lucroMaximo = lucro;
                precoMaximo = precoIngresso;
                ingressosMaximo = vendaAtual;
            }

            precoIngresso -= 0.50;
        }

        System.out.println("\nLucro máximo esperado: R$ " + lucroMaximo);
        System.out.println("Preço do ingresso para o lucro máximo: R$ " + precoMaximo);
        System.out.println("Quantidade de ingressos vendidos para o lucro máximo: " + ingressosMaximo);
    }
}