package programas;

import java.util.Scanner;

//Faça um programa que receba um número inteiro, conte mais 20 (usando for), concatene cada
//número em uma string (separando por espaço), e devolva essa string
public class exercicioDois {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.println("Entre com um número inteiro: ");
        numero = leia.nextInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            numero = numero + i;
            builder.append(numero + " ");
        }
        System.out.println(builder);
    }
}