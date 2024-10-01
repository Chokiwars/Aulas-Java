package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println(">>>>>MÉDIA DE NOTAS<<<<<");
        Scanner scanner = new Scanner(System.in);
        double nota = 0;

        for (double i = 0; i < 5; i++) {
            System.out.println("Digite sua nota");
            nota += scanner.nextInt();
        }
        System.out.println("Sua média  é " + nota / 5);
    }
}
