package Exercicio_21;

import java.util.Random;

public class ProcurarNumero {
    public static void main(String[] args) {

        Random ramdom = new Random();

        int numeroAleatorio = ramdom.nextInt(100);
        System.out.println("Numero: " + numeroAleatorio);

    }
}
