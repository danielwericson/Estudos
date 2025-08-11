package Exercicio_5;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalarioMinimo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1272.20;
        System.out.print("Qual é o valor do seu salário? ");
        double salarioUsuario = sc.nextDouble();
        double resultado = salarioUsuario / salarioMinimo;
        if (resultado == salarioMinimo) {
            System.out.printf("Você recebe %.2f salário minímo.", resultado);
        } else {
            System.out.printf("Você recebe %.2f salários minímos.", resultado);
        }

        sc.close();

    }
}

