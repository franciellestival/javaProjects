package exercicios03;

import java.util.Scanner;

public class DetMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double det = 0;
        // Variaveis para cálculo das diagonais
        double diagPrin1, diagPrin2, diagPrin3, diagSec1, diagSec2, diagSec3;

        // Declarando e alocando matriz
        double[][] mat = new double[3][3];

        for (int i = 0; i < mat.length; i++) {

            for (int c = 0; c < mat[i].length; c++) {

                System.out.printf("Informe %do valor da %da linha : ", c + 1, i + 1);
                mat[i][c] = sc.nextDouble();
            }
        }

        // Diagonais principais
        diagPrin1 = mat[0][0] * mat[1][1] * mat[2][2];
        diagPrin2 = mat[0][1] * mat[1][2] * mat[2][0];
        diagPrin3 = mat[0][2] * mat[1][0] * mat[2][1];

        // Diagonais Secundárias
        diagSec1 = mat[2][0] * mat[1][1] * mat[0][2];
        diagSec2 = mat[2][1] * mat[1][2] * mat[0][0];
        diagSec3 = mat[2][2] * mat[1][0] * mat[0][1];

        // Determinante
        det = -(diagSec1 + diagSec2 + diagSec3)
                + (diagPrin1 + diagPrin2 + diagPrin3);
        System.out.println("O determinante da matriz eh : " + det);

        sc.close();
    }
}
