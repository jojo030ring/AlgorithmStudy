package chpater1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class O24_JollyJumpers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 횟수를 받음
		int n = Integer.parseInt(sc.nextLine());
		// jolly jumper를 구별해줄 hashset. 정상적인 경우라면 1~n-1까지 가능
		HashSet<Integer> hs = new HashSet<>();
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int []arr = getArrFromSt(st,n);
		boolean isJolly = true;
		for(int i=0;i<n-1;i++) {
			int sub = Math.abs(arr[i]-arr[i+1]);
			// 뺀 값이 n-1보다 크면 안 됨
			if(sub>n-1) {
				isJolly = false;
				break;
			}else {
				hs.add(sub);
			}
				
		}
		for(int i=0;i<n-1;i++) {
			if(!hs.contains(i+1))
				isJolly = false;
		}
		
		System.out.println((isJolly)? "YES" : "NO");
		
	}
	
	private static int[] getArrFromSt(StringTokenizer st, int n) {
		int[] result = new int[n];
		for(int i=0;i<n;i++) {
			result[i] = Integer.parseInt(st.nextToken());
		}
		return result;
	}
}
