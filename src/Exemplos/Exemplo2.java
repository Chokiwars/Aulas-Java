package Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        String nome = "Beatriz", nomeDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nomeDigitado = scanner.nextLine();

        while (!nome.equals(nomeDigitado)) {
            System.out.println("Nome errado, digite novamente");
            nomeDigitado = scanner.nextLine();
        }
        System.out.println("Parabéns, esse é seu nome!!!");
        scanner.close();
    }
}
