package chpater1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class O24_teacher_solve {
	public static void main(String[] args) {
		int n, now, pre, pos;
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		n = Integer.parseInt(sc.nextLine());
		int[] ch = new int[n-1];
		st = new StringTokenizer(sc.nextLine(), " ");
		pre = Integer.parseInt(st.nextToken());
		while(st.hasMoreTokens()) {
			now = Integer.parseInt(st.nextToken());
			pos = Math.abs(pre-now);
			if(pos > 0 && pos <n && ch[pos] ==0) 
				ch[pos] = 1;
			else { 
				System.out.println("NO");
				return;
			}
			pre = now;
		}
		System.out.println("YES");
		
	}
	
}
