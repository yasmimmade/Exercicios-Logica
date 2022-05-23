//Faça um programa que receba um numero inicial, um número final, execulte o for usando esses números, concatene cada
//número em uma string, e devolva essa string
//fazer tratativa**********
package programas;

import java.util.Scanner;

public class exercicioQuatro {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Integer numero, numeroDois;

        System.out.println("Entre com o primeiro número inteiro: ");
        numero = leia.nextInt();

        System.out.println("Entre com o segundo número inteiro: ");
        numeroDois = leia.nextInt();

        String numeroConvertido = new String();
        if (numero < numeroDois) {
            for (Integer i = numero; i <= numeroDois; i++) {
                numeroConvertido += i+" ".toString();
            }
            System.out.println(numeroConvertido);
        }
         if (numero > numeroDois) {
             for (int i = numeroDois; i <= numero; i++) {
                numeroConvertido += String.valueOf(i + " ");
            }
            System.out.println(numeroConvertido);
        }
    }
}