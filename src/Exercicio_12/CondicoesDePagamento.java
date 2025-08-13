package Exercicio_12;

import java.util.Locale;
import java.util.Scanner;

public class CondicoesDePagamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.println("Condicoes de Pagamento");

        double aVista1 = 0;
        double aVista2 = 0;
        double parcelado1 = 0;
        double parcelado2 = 0;

        System.out.println("1 - À Vista em Dinheiro ou Pix"); // recebe 15% de desconto //
        System.out.println("2 - À Vista no cartão de crédito"); // recebe 10% de desconto //
        System.out.println("3 - Parcelado no cartão em duas vezes"); // preço normal do produto sem juros //
        System.out.println("4 - Parcelado no cartão em três vezes ou mais"); // preço normal do produto mais juros de 10% //

        System.out.println();
        System.out.print("Qual a forma de pagamento: ");
        int condicaoPagamento = sc.nextInt();

        if(condicaoPagamento == 1) {
            aVista1 = valorProduto - (valorProduto * 0.15);
            System.out.print("Valor final do produto: " + aVista1);
        } else if (condicaoPagamento == 2) {
            aVista2 = valorProduto - (valorProduto * 0.10);
            System.out.print("Valor final do produto: " + aVista2);
        } else if (condicaoPagamento == 3){
            parcelado1 = valorProduto;
            System.out.print("Valor final do produto: " + parcelado1);
        } else if (condicaoPagamento == 4) {
            parcelado2 = valorProduto + (valorProduto * 0.10);
            System.out.print("Valor final do produto: " + parcelado2);
        } else {
            System.out.println("null");
        }

        sc.close();

    }
}
