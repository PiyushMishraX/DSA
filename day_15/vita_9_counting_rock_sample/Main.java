package day_15.vita_9_counting_rock_sample;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int R = sc.nextInt();

        int[] sampleList = new int[S];

        // for( int i = 0; i < S; i++) {
        //     sampleList[i] = sc.nextInt();
        // }

        // int[][] ranges = new int[R][2];

        // for( int j = 0; j < R; j++){
        //     ranges[j][0] = sc.nextInt();
        //     ranges[j][1] = sc.nextInt();
        // }

        // int[] elementsInRange = new int[R];

        // for( int i = 0; i < R; i++){
        //     for(int j = 0; j < S; j++){

        //         if(sampleList[j] >= ranges[i][0]) {
        //             if(sampleList[j] <= ranges[i][1]) {
        //                 elementsInRange[i]++;
        //             }
        //         }
        //     }
        // }




        //  PREFIX SUM METHOD --> 

        int[] freq = new int[1000];

        // frqencies
        for( int i = 0; i < S; i++) {
            // // sampleList[i] = sc.nextInt();
            // freq[sc.nextInt()]++;
            
            // sampleList[i] = sc.nextInt();
            // freq[sampleList[i]]++;

            freq[sc.nextInt()]++;
        }


        // prefix array which tells the range how many elements are smaller or bigger

        int[] prefixFreq = new int[1000];

        prefixFreq[0] = freq[0];
        for(int i = 1; i < 1000; i++ ){
            prefixFreq[i] = prefixFreq[i - 1] + freq[i];
        }

        int[][] ranges = new int[R][2];

        for( int j = 0; j < R; j++){
            ranges[j][0] = sc.nextInt();
            ranges[j][1] = sc.nextInt();
        }

        int[] elementsInRange = new int[R];

        for( int i = 0; i < R; i++){
            // count of elements in range A to B
            //  prefixFreq[B] - prefixFreq[A -1]

            elementsInRange[i] = prefixFreq[ranges[i][1]] - prefixFreq[ranges[i][0] - 1];
        }

        for( int i = 0; i < R; i++){
            // System.out.println(elementsInRange[i]);
            System.out.print(elementsInRange[i] + " ");
        }
        
    }
}
