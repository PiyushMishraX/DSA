package day_16.E_The_67th_XOR_Problem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        int[] ans = new int[cases];

        for( int i = 0; i < cases; i ++){
            int len = sc.nextInt();

            int[] arr = new int[len];

            for( int j = 0; j < len; j++){
                arr[j] = sc.nextInt();
            }

            // we are not mutilplying each element to everyone then loop again fully to again perform the same operation
            // but just have to check the combination of pairs( any 2 elements) and get max of it  
            // for( int j = len-1; j >= 0 ; j--){
            //     for( int k = 0; k < j; k++){
            //         arr[k] = arr[k] ^ arr[j];
            //     }
            // }

            // ans[i] = arr[0];


            ans[i] = 0;

            for( int j  = 0; j < len - 1; j++ ){
                for(int k = j +1; k < len; k++ ){
                    ans[i] = Math.max( ans[i], arr[j] ^ arr[k]);
                }
            }
        }

        for( int i = 0; i < cases; i++){
            System.out.println(ans[i]);
        }

        sc.close();
    }
}
