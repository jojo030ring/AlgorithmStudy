package chpater1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class O22_MaxTemperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(sc.nextLine(), " ");
		int[] arr = initArray(st,n);
		int sum =0;
		int max = -2100000000;
		for(int i=0;i<n-k;i++) {
			for(int j=0;j<k;j++) {
				sum +=arr[i+j];
			}
			if(sum>max)
				max = sum;
			sum = 0;
		}
		System.out.println(max);
	}

	private static int[] initArray(StringTokenizer st,int n) {
		int[] result = new int[n];
		for (int i=0;i<n;i++) {
			result[i] = Integer.parseInt(st.nextToken());
		}
		return result;
	}
}
