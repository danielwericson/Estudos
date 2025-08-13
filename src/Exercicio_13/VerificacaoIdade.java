package Exercicio_13;

import java.util.Scanner;

public class VerificacaoIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Qual é a sua idade: ");
        int idade = sc.nextInt();

        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        if (idade < 18){
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }
    }
}
