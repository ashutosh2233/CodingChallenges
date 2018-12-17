package hackerrank.organizing_containers;

//  https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {
    	int n = container.length;
    	int rowSum[] = new int[n];
    	int colSum[] = new int[n];

    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n; j++) {
    			rowSum[i] += container[i][j];
    			colSum[j] += container[i][j];
			}			
		}
    	
    	for (int i = 0; i < n; i++) {
    		for (int j = i; j < n; j++) {
    			
    		}
    	}
    	return "Possible";
    }


    public static void main(String[] args) throws IOException {
    	Scanner scanner;
        BufferedWriter bufferedWriter;
        if(null != System.getenv("OUTPUT_PATH")) {
        	scanner = new Scanner(System.in);
        	bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        }else {
        	scanner = new Scanner(new File("src/hackerrank/organizing_containers/input.txt"));
        	bufferedWriter = new BufferedWriter(new PrintWriter(System.out));
        }

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
