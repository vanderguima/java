import java.util.Scanner;

public class Uri1065 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero, soma = 0.0;
        int qtdpares = 0;

        for (int cont=1 ; cont <=5; cont++){
            numero = teclado.nextDouble();
            if (numero % 2 == 0){
                qtdpares++;
                soma = soma + numero;
            }
        }
        System.out.println(qtdpares + " valores pares");
    }
}
