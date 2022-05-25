package chpater1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class O23_연속부분증가수열 {
	public static void main(String[] args) {
		StringTokenizer st;
		Scanner sc = new Scanner(System.in);
		st = new StringTokenizer(sc.nextLine(), " ");
		int max=-1000000; // 나오는 숫자의 max값
		int count = 0;   // 순열이 이어지는 카운트 수
		int maxCount = 0; // 최대 카운트 수
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			// 수열이란 건 증가할수록 점점 커지니까
			// 나는 max값으로 풀어봄
			if(max<=num) {
				count ++;
				max=num;
				if(count>maxCount)
					maxCount = count;
				
			} else {
				// 현재 자리부터 다시 순열이 시작될 수도 있어서 count에 1을 주게 됨
				count =1; // 현재 자리의 첫번째 수를 읽어들인거니 count는 0으로 초기화하면 안됨.
				max = num; // 이걸 0으로 초기화하면 안 됨...
							// 현재 읽어온 수로 초기화 해야함
				/**
				 * 10 3 1 2 3 4 
				 * 3 > count =1 / max = 0
				 * 1 > max<=1 => count=2 / max =1
				 * 카운트가 더 들어가게 됨. 절대 0으로 초기화하지 말아야함
				 */
				
			}
			
			
		}
		System.out.println(maxCount);
	}
}
