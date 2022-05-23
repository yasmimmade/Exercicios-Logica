package programas;

import java.util.Scanner;

//Faça um programa que receba um numero inteiro, multiplique esse número por ele mesmo
// 4 vezez (usando for), e devolva o resultado
public class exercicioTres {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int multi = 1;

        System.out.println("Entre com um número inteiro: ");
        numero = leia.nextInt();

        for (int i = 0; i < 4; i++) {
            multi = numero * multi;
        }
        System.out.println(multi);
    }
}
