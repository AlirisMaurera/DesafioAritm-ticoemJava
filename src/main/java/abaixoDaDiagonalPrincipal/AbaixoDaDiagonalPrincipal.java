package abaixoDaDiagonalPrincipal;

import java.util.Scanner;

public class AbaixoDaDiagonalPrincipal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 1,l = 1; i < 12; i++) {
            for (int j = 0; j < l; j++) {
                soma += M[i][j];
            }
            l++;
        }

        if (O == 'S') {
            System.out.println(soma);
        } else {
            if (O == 'M') soma /= ((M.length * M.length) - 12) / 2; // 66
            System.out.println(String.format("%.1f", soma));
        }

    }
}
