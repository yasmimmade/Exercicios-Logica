package programas;

import java.util.Random;
import java.util.Scanner;

//Faça um programa que voce passe uma senha de 3 digitos númericos, e o seu programa sejá capaz, 
//de identificar essa senha
// Ex: Imagine que vc tenha uma senha do facebook, de 3 digitos
// Voce terá que fazer um programa, que irá tentar diversas vezes acertar a senha, até
// Descobrir a senha verdadeira
public class exercicioOito {

    public static void main(String args[]) {
    int senha = 327;
        // 000
        // 001
        // 002
        // ...
        // 010
        // 011

        for (int i=0; i<400; i++){
            int senha2 = i+1;
            System.out.println(senha2);
            if (senha2 == senha){
            System.out.println(senha);
            break;
            }
        }


        
    }
}
