import java.util.Scanner;

public class Uri1066 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qtdpares = 0;
        int qtdimpares = 0;
        int qtdpositivos = 0;
        int qtdnegativos = 0;
        int numero;

        for (int cont=1 ; cont <=5; cont++){
            numero = teclado.nextInt();
            if (numero % 2 == 0)
                qtdpares++;
                else qtdimpares++;
              if (numero > 0) qtdpositivos++;
              else if(numero < 0) qtdnegativos++;
            }
        
        System.out.println(qtdpares + " valor (es) par (es)");
        System.out.println(qtdimpares + " valor (es) impar (es)");
        System.out.println(qtdpositivos + " valor (es) positivo (s)");
        System.out.println(qtdnegativos + " valor (es) negativos (s)");
        }
    }