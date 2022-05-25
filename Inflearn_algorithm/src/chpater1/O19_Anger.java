package chpater1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class O19_Anger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input," ");
		
		int arr[] = new int[100]; // 몇 명이 앉을 지 몰라서 100개 선언
		int maxIndex = arrInit(st,arr); // 대신 maxIndex값을 받아옴
		
		int makingAngerCount = 0;	// 분노유발자
		int count = 0;				// 임시  카운트
		int i, j;					// 반복변수
		for(i=0;i<=maxIndex;i++) {
			for(j=0;j<maxIndex;j++) {
				if(arr[i]>arr[j]) {
					count++;
				} 
			}
			if(count == maxIndex-i) { // 끝 학생 위치 - 자기 위치 뺀 값이 같으면 자기 뒤부터 싹 다 막아놓고있는거
				makingAngerCount ++;
			}
			count = 0; // 임시카운트 초기화
				
		}
		System.out.println(makingAngerCount);
		
	}
	public static int arrInit(StringTokenizer st, int arr[]) {
		int index = 0;
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index ++;
		}
		Arrays.toString(arr);
		return index;
	}
}
