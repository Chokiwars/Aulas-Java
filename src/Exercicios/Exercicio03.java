package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println(">>>>>CÁLCULO DE FATORIAL<<<<<");

        double fatorial, numeroScanner, resultado = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ser fatorado:");
        numeroScanner = scanner.nextInt();
        fatorial = numeroScanner;
        do{
            fatorial--;
            double numero1 = numeroScanner *=fatorial;
            double numero3 = numero1/fatorial;
            resultado = numero3;
            if (fatorial==1){
                System.out.println(resultado);
            }
        }while (fatorial >= 0);
    }
}
