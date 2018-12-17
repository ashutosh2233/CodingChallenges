package utils.merge_sort;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MergeSort {
	
	static void merge(int num[], int l, int m, int r) {
		
		int n_l = m - l + 1;
		int n_r = r - m;

		int num_l[] = new int[n_l];
		int num_r[] = new int[n_r];

		for (int i = 0; i < n_l; i++) num_l[i] = num[l + i];
		for (int i = 0; i < n_r; i++) num_r[i] = num[m + 1 + i];
		
		int i = 0, j = 0, k = l;
		while(i < n_l && j < n_r) {
			if(num_l[i] <= num_r[j]) {
				num[k++] = num_l[i++];
			}else {
				num[k++] = num_r[j++];
			}
		}
		/* Copy remaining elements of num_l[] & num_r[] if any */
		while(i < n_l) {
			num[k++] = num_l[i++];
		}
		while(j < n_r) {
			num[k++] = num_r[j++];
		}
	}
	
	static void mergeSort(int num[], int l, int r) {
		if(l < r) {
			int m = (l + r) / 2;
			mergeSort(num, l, m);
			mergeSort(num, m + 1, l);
			merge(num, l, m, r);
		}
	}
	
	static void printArray(int arr[]) { 
        for (int i=0; i<arr.length; ++i)  System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(new File("src/utils/merge_sort/input.txt"));
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
        	
        	printArray(num);
        	mergeSort(num, 0, n-1);
        	printArray(num);
        }
        scanner.close();
	}

}
