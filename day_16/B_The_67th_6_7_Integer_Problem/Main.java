package day_16.B_The_67th_6_7_Integer_Problem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        int[] ans = new int[cases];

        for( int i =0; i < cases; i++){

            int max = sc.nextInt();
            int sum = -1 * max;


            for( int j = 1; j <7; j++ ){
                int num = sc.nextInt();
                
                if( num > max){
                    max = num;
                }

                sum += -1 * num;
            }

            sum = sum + ( 2 * max);

            ans[i] = sum;
        }

        // System.out.println(ans[0]);

        for( int i = 0; i < cases; i++){
            System.out.println(ans[i]);
        }

        sc.close();

    }
    
}
