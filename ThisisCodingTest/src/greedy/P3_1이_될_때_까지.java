package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P3_1이_될_때_까지 {
	/**
	 * 어떤 수 N이 1이 될 때 까지 다음의 두 과정중 하나를 반복적으로 선택하여 수행한다.
	 * 두 번째 연산은 N이 K로 나누어떨어질 때만 사용한다.
	 * 1. N에서 1을 뺀다
	 * 2. N을 K로 나눈다.
	 * 
	 * N = 17 / K = 4 일때,
	 * N%4!=0이므로 K-1 = 16 : 1회
	 * N = 16, N%K = 0이므로 N/4 = 4 : 2회
	 * N%K =0 이므로 N/4 = 1 : 3회
	 * 
	 * N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번 과정을 수행해야하는 최소 횟수를 구하는 프로그램을 작성하라.
	 * 
	 * 입력 : 첫 째줄에 N(2<=N<=100000) K(2<=K<=100000)가 공백으로 구분되고 각각 자연수로 주어진다.
	 * 입력으로 주어지는 N은 항상 K보다 크거나 같다.
	 * 
	 * 입력 예시 
	 * 25 5
	 * 
	 * 출력 예시
	 * 2
	 * 
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count = 0;
		int remainder = 0;
		// 미완성
		bw.write(count+"");
		bw.close();
		br.close();
		
		
	}
}
