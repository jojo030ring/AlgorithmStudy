package chpater1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class O23_teacher_solve {
	public static void main(String[] args) {
		int n, i, pre, now, cnt, max=-1;
		StringTokenizer st;
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		st = new StringTokenizer(sc.nextLine(), " ");
		
		// pre�� ���� �ϳ� �о���´�.
		pre = Integer.parseInt(st.nextToken());
		cnt = 1;
		// 2��°���� ����
		while(st.hasMoreTokens()) {
			now = Integer.parseInt(st.nextToken());
			if(now >= pre) {
				cnt ++;
				if(cnt > max) {
					max = cnt;
				}
			} else 
				cnt = 1;
			pre = now;
			
		}
		System.out.println(max);

	}
}
