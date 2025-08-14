package Exercicio_15;

import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma dia de nascimento: ");
        int diaNascimento = sc.nextInt();
        System.out.print("Digite uma mesNascimento de nascimento: ");
        int mesNascimento = sc.nextInt();
        System.out.print("Digite uma ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int anosAtual = 2025;
        int mesesAtual = 8;
        int diasAtual = 14;

        if (diaNascimento > 14){
            diasAtual = 30 + 14 - (diaNascimento - 1);
        } else {
            diasAtual = 14 - diaNascimento;
        }

        if (mesNascimento > 8){
            mesesAtual = 12 + 8 - (mesNascimento + 1);
        } else {
            mesesAtual = 8 - mesNascimento;
        }

        if (anoNascimento > 2000) {
            anosAtual = 2025 - (anoNascimento + 1);
        } else {
            anosAtual = 2025 - anoNascimento;
        }

        System.out.println();
        System.out.println("Data de nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento);
        System.out.println(anosAtual + " anos, " + mesesAtual + " meses, " + diasAtual + " dias de vida.");

        sc.close();
    }
}
