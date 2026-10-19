package day_16.D_The_67th_OEIS_Problem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        int[] lengths = new int[cases];

        for( int i =0; i < cases; i ++){
            lengths[i] = sc.nextInt();
        }

        for( int i = 0; i < cases; i++){
            int start = 1;

            for( int j = 0; j < lengths[i] ; j++){
                System.out.print(start * (start + 2) + " ");
                start = (start + 2) ;
            }
            System.out.println();
        }

        sc.close();
    }
}
