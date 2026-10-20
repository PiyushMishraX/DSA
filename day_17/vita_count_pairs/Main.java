package day_17.vita_count_pairs;

// import java.io.*;
// import java.util.*;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import java.util.HashMap;




public class Main {

    public BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in)
    );
    StringTokenizer st;

    String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    public static void main(String[] args) throws IOException {
        // Main sc = new Main();


        //  PrintWriter out = new PrintWriter(
        //     new BufferedOutputStream(System.out)
        // );

        // int a = sc.nextInt();
        // long b = sc.nextLong();
        //  String s = sc.nextToken();

        // long result = a + b;

        // out.println("Result: " + result);

        // out.flush(); // At the very end


         PrintWriter out = new PrintWriter(
            new BufferedOutputStream(System.out)
        );

        Main sc = new Main();

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] nums = new int[N];


        // HashSet<Integer> set = new HashSet<>();

        HashMap<Integer, Boolean> map = new HashMap<>();

        // for(int num: nums){
        //     // set.add(num);


        //     map.put(num, false);
        // }


        for( int i = 0; i< N ; i++){

            nums[i] = sc.nextInt();

            map.put(nums[i], false);
        }

        for( int i = 0; i < N; i++ ){

            if(!map.get(nums[i])){
                // map.put(nums[i], true);

                for( int j = nums[i] - K; j < nums[i] ;j++){
                    if( map.containsKey(j)){
                        map.put(nums[i], true);
                        map.put(j, true);
                    }
                }

                for( int j = nums[i] + K; j > nums[i] ;j--){
                    if( map.containsKey(j)){
                        map.put(nums[i], true);
                        map.put(j, true);
                    }
                }
            }
        }

        int count = 0;

        for( int i = 0 ; i < N; i++){
            if( map.get(nums[i])){
                count++;
            }
        }

        out.println(count);


        out.flush();
    }
}
