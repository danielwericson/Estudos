package Exercicio_16;

import java.util.Locale;
import java.util.Scanner;

public class VerificacaoTriangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Verificação de triangulos");
        System.out.println();
        System.out.print("Digite o valor do lado A: ");
        double ladoA = sc.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        double ladoB = sc.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        double ladoC = sc.nextDouble();

        System.out.println();
        if (ladoA == ladoB && ladoA == ladoC){
            System.out.print("Resultado: Triangulo Equilátero");
        } else if ( ladoA == ladoB && ladoA != ladoC || ladoA != ladoB && ladoA == ladoC || ladoB == ladoC && ladoB != ladoA){
            System.out.print("Resultado: Triângulo Isósceles");
        }else {
            System.out.println("Resultado: Triangulo Escaleno");
        }

        sc.close();
    }
}
