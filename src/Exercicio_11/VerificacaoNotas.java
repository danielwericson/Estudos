package Exercicio_11;

import java.util.Locale;
import java.util.Scanner;

public class VerificacaoNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        double nota = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota + nota2 + nota3 + nota4) / 4;

        System.out.println();
        System.out.println("nome: " + nome);
        System.out.println("media final: " + media);

        if (media >= 7){
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }

        sc.close();
    }
}
