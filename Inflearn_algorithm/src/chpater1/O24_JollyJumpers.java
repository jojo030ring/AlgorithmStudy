package chpater1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class O24_JollyJumpers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ƚ���� ����
		int n = Integer.parseInt(sc.nextLine());
		// jolly jumper�� �������� hashset. �������� ����� 1~n-1���� ����
		HashSet<Integer> hs = new HashSet<>();
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int []arr = getArrFromSt(st,n);
		boolean isJolly = true;
		for(int i=0;i<n-1;i++) {
			int sub = Math.abs(arr[i]-arr[i+1]);
			// �� ���� n-1���� ũ�� �� ��
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
