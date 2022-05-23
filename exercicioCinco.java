package programas;

//Faça um programa que concatene em uma string somente os numeros impares de 0 até 20,
//e devolva essa string
public class exercicioCinco {
    public static void main(String args[]) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= 20; i++) {
            if ((i % 2) != 0) {
                builder.append(i + " ");
            }
        }
        System.out.println(builder);
    }

}