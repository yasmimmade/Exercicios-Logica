package programas;

import java.util.Scanner;

// Faça um programa que você passe um número inicial, um numero final, e some todos os valores
// entre esses números (incluindo os numeros passados)
public class exercicioSeis {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int soma = 0;

        System.out.println("Entre com o primeiro número inteiro: ");
        int numero = leia.nextInt();

        System.out.println("Entre com o segundo número inteiro: ");
        int numeroDois = leia.nextInt();

        if (numero < numeroDois) {

            for (int i = numero; i <= numeroDois; i++) {
                soma = i + soma;
            }
            System.out.print(soma);
        }
        if (numero > numeroDois) {

            for (int j = numeroDois; j <= numero; j++) {
                soma = j + soma;
            }
            System.out.print(soma);
        }
    }
}