package Exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
    int fatorial , numeroDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber seu fatorial");
        numeroDigitado = scanner.nextInt();
        fatorial=numeroDigitado;

        for (int contador=1; contador<numeroDigitado; contador++){
            fatorial*=contador;
        }
        System.out.println("O fatorial de " + numeroDigitado + " é " + fatorial);
    }
}
