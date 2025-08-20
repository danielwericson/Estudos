package Exercicio_23;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalarioLiquido {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora aula: ");
        double valorHora = sc.nextDouble();
        System.out.print("Digite a quantidade de aulas lecionadas no mes: ");
        double aulasLecionadas = sc.nextDouble();
        System.out.print("Digite o percentual de desconto do INSS: ");
        double descontoINSS = sc.nextDouble();

        double salarioBruto = valorHora * aulasLecionadas;
        double salarioLiquido = salarioBruto - (salarioBruto * (descontoINSS * 0.01));

        System.out.println();
        System.out.println("O salario liquido é: " + salarioLiquido);

        sc.close();
    }
}
