package projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int valor;

        valor = scan.nextInt();

        int fatorial = valor;

        while (valor > 1) {
            fatorial = fatorial * (valor - 1);
            valor--;
        }

        System.out.println(fatorial);

    }

}
