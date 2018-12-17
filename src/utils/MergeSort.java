package utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MergeSort {
	
	static void sort(int num[]) {
		System.out.println("num: "+ num);
	}

	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(new File("src/utils/input.txt"));
		int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int qItr = 0; qItr < q; qItr++) {
        	int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
        	int num[] = new int[n];
        	String[] containerRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
        	for (int i = 0; i < n; i++) {
				num[i] = Integer.parseInt(containerRowItems[i]);
			}
        	sort(num);
        }
        scanner.close();
	}

}
