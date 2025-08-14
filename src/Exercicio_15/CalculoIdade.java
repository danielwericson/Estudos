package Exercicio_15;

import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma dia de nascimento: ");
        int dia = sc.nextInt();
        System.out.print("Digite uma mes de nascimento: ");
        int mes = sc.nextInt();
        System.out.print("Digite uma ano de nascimento: ");
        int ano = sc.nextInt();

        int anosVividos = 2025;
        int mesesVividos = 8;
        int diasVividos = 14;

        if (dia > 14){
            diasVividos = 30 + 14 - (dia - 1);
        } else {
            diasVividos = 14 - dia;
        }

        if (mes > 8){
            mesesVividos = 12 + 8 - (mes + 1);
        } else {
            mesesVividos = 8 - mes;
        }

        if (ano > 2000) {
            anosVividos = 2025 - (ano + 1);
        } else {
            anosVividos = 2025 - ano;
        }

        System.out.println();
        System.out.println("Data de nascimento: " + dia + "/" + mes + "/" + ano);
        System.out.println(anosVividos + " anos, " + mesesVividos + " meses, " + diasVividos + " dias de vida.");

        sc.close();
    }
}
