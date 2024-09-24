package Exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println(">>>>>SOMA DE NÚMEROS PARES<<<<<");

        int soma= 0, contador =1;

        while (contador <= 100){
            contador++;
            if (contador % 2 == 0){
                soma += contador;
            }
        }
        System.out.println(soma);
    }
}