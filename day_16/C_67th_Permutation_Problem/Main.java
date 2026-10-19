package day_16.C_67th_Permutation_Problem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        int[] lengths = new int[cases];
        for( int i = 0; i < cases; i++){
            lengths[i] = sc.nextInt();
        }

        for( int i = 0; i < cases; i++){

            int k = 3 * lengths[i];

            for( int j = 1; j <= lengths[i]; j++){
                System.out.print( j + " " + (k -1 ) + " " + k + " ");
                k -= 2;
            }

            System.out.println();
        }

        sc.close();
    }
}
