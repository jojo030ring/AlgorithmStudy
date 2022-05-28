package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1_큰수의법칙_개선판 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = getIntegerValue(st.nextToken());
		int m = getIntegerValue(st.nextToken());
		int k = getIntegerValue(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		// 초기화
		for(int i=0;i<n;i++) {
			arr[i] = getIntegerValue(st.nextToken());
		}
		
		Arrays.sort(arr);
		int sum = 0;
		int max = arr[n-1]; // 가장 큰 수
		int secondMax = arr[n-2]; // 두 번째로 큰 수
		
		/**
		 * m = 5
		 * k = 3
		 * 
		 * 5/4 = 1 (뭉탱이 덧셈)
		 * 5%4 = 1 (개별 덧셈)
		 * 
		 */
		int remainderCount = m %(k+1);
		int count = m/(k+1) * k + remainderCount; 
		// k == 3일 때 totalRecursive에는 max가 3(m/(k+1))씩 들어감
		// remainderCount에는 m%(k+1)이 들어감.
		
		// 가장 큰 수 계산
		sum += count * max;
		// 작은 수 계산 >> m개에서 큰수가 더해지는 횟수를 빼면 작은 수가 나옴
		sum += (m-count) * secondMax;
		
		bw.write(sum+"");
		br.close();
		bw.close();
	}
	private static int getIntegerValue(String input) {
		return Integer.parseInt(input);
	}
}
