package programas;

//Faça um programa que receba um número inteiro, conte mais 10 (usando for) e devolva o resultado
import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero, resultado;

        System.out.println("Entre com um número inteiro: ");
        numero = leia.nextInt();

        for (int i = 1; i <= 10; i++) {
            
            resultado = numero + i;
            System.out.println("A soma de: " + i + " + " + numero + " = " + resultado);
            numero = resultado;
        }
    }
}