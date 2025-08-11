package Exercicio_9;

import java.util.Locale;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora IMC");
        System.out.println();
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println();
        double imc = peso / Math.pow(altura, 2);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso ideal (parabéns!)");
        } else if (imc < 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade grau  I");
        } else if (imc < 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (morbida)");
        }

        sc.close();

    }
}