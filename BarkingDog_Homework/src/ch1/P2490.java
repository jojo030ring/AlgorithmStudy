package ch1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P2490 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input  = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int[] dice = new int[6]; // 주사위 눈과 주사위 눈이 나온 횟수를 지정하는 dice
		// 토큰을 잘라서 삽입함
		while(st.hasMoreElements()) {
			int index = getInteger(st.nextToken())-1;	// 인덱스가 나온 주사위의 눈
			dice[index] ++;	// 값이 주사위 횟수
			
		}
		// 순회하면서 찾기 
		int cnt = 0; // 주사위를 던져 나온 수
		int maxCnt = 0; // 주사위를 던져 나온 수의 최대값
		int sameValue = 0; // 같은 눈이 나왔다면, 그 값
		int maxValue = 0; // 가장 큰 값
		for(int i = 0; i<dice.length;i++ ) {
			cnt = dice[i];
			if(cnt > maxCnt) { 
				maxCnt = cnt;
			}
			if(dice[i] >=2) { // 중복출현한 눈의 수 구함 - 1,2번째 조건
				sameValue = i+1; // 인덱스 값 -> 주사위 눈의 값
			} 
			if(((i+1)>maxValue) && dice[i]>0) { // 세 번째 조건(중복 없음)과 관련된 if문
												// 한 번이라도 나온 적 있는데 값이 제일 큰 놈 받아옴
				maxValue = i+1;
			}
		}
		if(maxCnt == 1) {
			System.out.println(maxValue*100);
		} else if(maxCnt == 2) {
			System.out.println(1000+(sameValue)*100);
		} else if(maxCnt == 3) {
			System.out.println((10000+(sameValue)*1000));
		}
		
	}
	static int getInteger(String str) {
		return Integer.parseInt(str);
	}
	
	/**
	 * 처음 생각했던 것 : HashSet
	 * 안됐던 이유 : 중복되는 수를 찾아야하는데
	 * 1번이나 3번 조건같은 경우는 가능했으나
	 * 2번조건의 경우 숫자가 2개가 남는다. 두 개중 어떤 것이 
	 * 중복되는 수인지 알기 힘들어서 X
	 * 
	 */
}
