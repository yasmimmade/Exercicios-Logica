package programas;


import java.util.Scanner;

//Faça um programa, que voce passe dois números, um inteiro, e um número real
//calcule a potencia do numero real, usando o numero inteiro
public class exercicioSete {
    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
        int numeroInteiro;
        double numeroReal, resultado;
        
        System.out.println("Entre com o primeiro número real: ");
        numeroReal = leia.nextDouble();

        System.out.println("Entre com o segundo número inteiro: ");
        numeroInteiro = leia.nextInt();

        //Usando math
        resultado = Math.pow(numeroReal, numeroInteiro);
        System.out.println(resultado);

        //Usando laço for
        double resultadoFor = 1;
        for (int i = 1; i <= numeroInteiro; i++) {
            resultadoFor = resultadoFor * numeroReal;
        } 
        System.out.println(resultadoFor);
    }
}