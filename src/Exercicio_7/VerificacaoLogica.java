package Exercicio_7;

import java.util.Locale;
import java.util.Scanner;

public class VerificacaoLogica {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor (verdadeiro ou falso)");
        boolean valor1 = sc.nextBoolean();
        System.out.println("Digite o segundo valor (verdadeiro ou falso)");
        boolean valor2 = sc.nextBoolean();

        if(valor1 && valor2) {
            System.out.println("Ambos são VERDADEIROS");
        } else if (!valor1 && !valor2){
            System.out.println("Ambos são FALSOS");
        } else {
            System.out.println("Os valores são diferentes, um valor é VERDADEIRO e o outro é FALSO");
        }
        sc.close();

    }
}

