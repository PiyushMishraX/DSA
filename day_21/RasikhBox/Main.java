


// import java.io.*;
// import java.util.*;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

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

        PrintWriter out = new PrintWriter(
            new BufferedOutputStream(System.out)
        );
        Main sc = new Main();

        int M = sc.nextInt();
        int N = sc.nextInt();

        char[][] arr = new char[M][N];

        for ( int i = 0; i < M ; i++) {

            for ( int j = 0; j < N ; j++) {

                arr[i][j] = sc.nextToken().charAt(0);

            }

        }

        applyGravity(arr);

        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
                String s = sc.nextToken();

                if (s.equals("right")) {

                    int rows = arr.length;
                    int cols = arr[0].length;
                    char[][] arrNew = new char[cols][rows];
                    
                    for (int x = 0; x < rows; x++) {
                        for (int y = 0; y < cols; y++) {
                            arrNew[y][rows - 1 - x] = arr[x][y];
                        }
                    }

                    arr = arrNew;

                } else if (s.equals("left")) {

                    int rows = arr.length;
                    int cols = arr[0].length;

                    char[][] arrNew = new char[cols][rows];
                    
                    for (int x = 0; x < rows; x++) {

                        for (int y = 0; y < cols; y++) {

                            arrNew[cols - 1 - y][x] = arr[x][y];

                        }

                    }
                    arr = arrNew;

                }
                
                applyGravity(arr);
            }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                
    
                out.print(arr[i][j] + " ");
            }
            out.println(); 
        }

        out.flush();
    }



    static void applyGravity(char[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;
        
        for (int j = 0; j < cols; j++) {
            int pos = rows - 1; // starting 
            
            for (int i = rows - 1; i >= 0; i-- ) {
                if (arr[i][j] == '*') {

                    arr[i][j] = '.';
                    arr[pos][j] = '*';
                    pos--;

                }
            }
        }
    }

    
}