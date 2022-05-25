package chpater1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class O18_houseNoise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine(); // n, m
		String input2 = sc.nextLine(); // N초간 측정된 실시간 측정치
		StringTokenizer st = new StringTokenizer(input1," ");
		int n = Integer.parseInt(st.nextToken()); 
		int m = Integer.parseInt(st.nextToken()); // 경보음이 울리는 특정 수치
		int cnt = 0; // 알람 횟수
		int maxAlramed = -1; // 최대 알람 횟수
		st = new StringTokenizer(input2," ");
		int sound = 0; // 측정치
		for (int i = 0 ;i<n ;i++) {
			sound = Integer.parseInt(st.nextToken());
			if(sound>m) // 소리가 경계치보다 큰 경우
				cnt ++;
			else { // 소리가 경계치보다 작은 경우
				cnt = 0;
			}
			if(maxAlramed < cnt) { // 만약 모든 값이 기준치를 넘게 되면 maxAlramed에 값이 안들어가기 때문에
				// if문을 밖으로 빼주어야 한다.
				maxAlramed = cnt;
			}
			
		}
		System.out.println(maxAlramed==0 ? "-1" : maxAlramed);
		
		
		
	}
}
