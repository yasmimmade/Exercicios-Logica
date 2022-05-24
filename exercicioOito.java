package programas;

//Faça um programa que voce passe uma senha de 3 digitos númericos, e o seu programa sejá capaz, 
//de identificar essa senha
// Ex: Imagine que vc tenha uma senha do facebook, de 3 digitos
// Voce terá que fazer um programa, que irá tentar diversas vezes acertar a senha, até
// Descobrir a senha verdadeira
public class exercicioOito {

    public static void main(String args[]) {
        int senha = 321;
        String tente;
        String[] tentativas = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        boolean controle;

        for (int i = 0; i < 10; i++) {
            controle = true;
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    tente = tentativas[i] + tentativas[j] + tentativas[k];
                    int tenteConvertido = Integer.valueOf(tente);
                    System.out.println(tente);
                    if (tenteConvertido == senha) {
                        System.out.println(senha + " acesso permitido");
                        controle = false;
                        break;
                    }
                }
                if (controle == false) {
                    break;
                }
            }
            if (controle == false) {
                break;
            }
        }
    }
}