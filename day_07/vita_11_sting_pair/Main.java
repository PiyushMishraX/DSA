package day_07.vita_11_sting_pair;

// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static String getTextForm(int num){

        if( num == 100){
            return "hundred";
        }

        String[] lessThan20 = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy" , "eighty", "ninety"
        };

        if( num < 20){
            return lessThan20[num];
        }

        if( num < 100){
            int t = num/10;
            int remaining = num % 10;
            // return tens[t] + " " + ( remaining > 0 ? lessThan20[remaining] : "");
            return tens[t] + ( remaining > 0 ? lessThan20[remaining] : "");

        }

        return "";
    }

    public static int countVowel(String s) {
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int N = Integer.parseInt(br.readLine());

        Scanner sc = new Scanner(System.in); // better of integers

        int N = sc.nextInt();

        int[] arr = new int[N];
        int totalVowels = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            // get string form

            String text = getTextForm(arr[i]);

            // get vowels count

            totalVowels += countVowel(text);
        }

        int D = totalVowels;
        int pairCount = 0;

        for(int i = 0; i < N - 1; i++){
            for(int j = i +1; j < N ; j++){
                if(arr[i] + arr[j] == D){
                    pairCount++;
                }
            }
        }

        System.out.println(D);

        if(pairCount > 100){
            System.out.println("greater 100");
        } else {
            System.out.println(getTextForm(pairCount));
        }

        sc.close();

        
    }
}
