package Exercicio_1;

import java.util.Scanner;

    public class VerificacaoNumerica {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um numero: ");
            int A = sc.nextInt();
            System.out.print("Digite outro numero: ");
            int B = sc.nextInt();
            System.out.print("Digite mais um numero: ");
            int C = sc.nextInt();
            int soma = A + B;

            System.out.println();
            System.out.println("A soma de " + A  + " + " + B + " = " + soma);
            if (soma < C) {
                System.out.println( soma + " é menor que " + C);
            } else if (soma > C){
                System.out.println(soma + " é maior que " + C);
            } else {
                System.out.println( soma + " é igual a " + C);
            }
        }
    }

