package Exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        int impar =0, par =0, numero;
        Scanner scanner= new Scanner(System.in);

        for (int i= 0; i<10 ; i++) {
            System.out.println("Digite um número");
            numero = scanner.nextInt();
            if (numero %2==0){
                par++;
            }else{
                impar++;
            }

        }
        System.out.println("Você digitou " + par + " números pares e " + impar + " números ímpares");
        scanner.close();
    }
}
