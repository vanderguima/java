import java.util.Scanner;

public class Uri1046 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hinicial;
        int hfinal;

        hinicial = teclado.nextInt();
        hfinal = teclado.nextInt();

        if (hinicial > hfinal) {
            System.out.println ("O JOGO DUROU " + (24 - (hinicial - hfinal)) + " HORA(S)");
        } else if (hfinal > hinicial) {
            System.out.println ("O JOGO DUROU " + (hfinal - hinicial) + " HORA(S)");
        }  else System.out.println ("O JOGO DUROU 24 HORA(S)");
    }
}