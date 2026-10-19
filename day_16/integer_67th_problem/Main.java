package day_16.integer_67th_problem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        int[] nums = new int[cases];

        for( int i = 0; i < cases; i ++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        for( int i = 0; i < cases; i ++){
            System.out.println(nums[i]); // because the min(i , i) is also i therefore such number exist which lets i be minimum
        }

    }
    
}