package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1_큰수의법칙 {
	public static void main(String[] args) throws Exception {
		/**
		 * 큰 수의 법칙 
		 * : 배열이 있을 때 주어진 수를 M번 더하여 가장 큰 수를 만드는 것
		 * 특정한 인덱스에 해당하는 수가 연속해서 K번을 초과할 순 없다.
		 * ex) 2,4,5,4,6 
		 * M=8 / K=3
		 * 특정한 인덱스의 수가 연속해서 3번까지만 더해질 수 있음.
		 * 큰 수의 법칙에 따라 6+6+6+5+6+6+6+5 > 46
		 * 
		 * 3,4,3,4,3으로 이루어진 배열이 있을 때 M=7, K=2
		 * 두 번째 해당하는 4와 네 번째 원소에 해당하는 4를 번갈아 두 번씩 더하는게 가능하다.
		 * 4+4+4+4+4+4+4 = 28
		 * 
		 * 배열의 크기 N, 숫자가 더해지는 횟수 M, K가 주어질 때 큰 수의 법칙에 따른 결과를 출력
		 * 
		 * 입력 : 첫 째줄에 N M K가 주어지며, 두 수는 공백으로 구분된다
		 * K : 1<=K<=10000 / N : 2<= N <=1000
		 * 둘 째줄에 자연수 N개가 주어진다. 각 자연수 역시 공백으로 구분. 각각의 자연수는 1이상 10000이하의 수로 주어짐.
		 * 입력으로 주어지는 K는 항상 M보다 작거나 같다.
		 */
		
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
		// 번갈아 더하면 된다.
		int i=0;
		while(i<m) {
			for(int j=0;j<k;j++) {
				i++; 
				sum += max;
			}
			sum += secondMax;
			i++;
			
		}
		
		bw.write(sum+"");
		br.close();
		bw.close();
	}
	private static int getIntegerValue(String input) {
		return Integer.parseInt(input);
	}
} // M이 10000이하여서 이런 방식으로 해결이 가능하지만, 
 // M이 10000이상이면 시간초과가 날 것.
 
