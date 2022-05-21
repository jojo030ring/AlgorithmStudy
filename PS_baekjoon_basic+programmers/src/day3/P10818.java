package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10818 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int min = 99999999;
		int max = -99999999;
		/**
		 * 입력이 백만이기 때문에, 충분히 각각 충분히 큰 값과 충분히 작은 값을
		 * 설정하여 어떤 수가 입력되더라도 min과 max 값을 구할 수 있게 함
		 */
		int num = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		st = new StringTokenizer(input, " ");
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			if(min>temp) {
				min = temp;
			}
			if(max<temp ) {
				max = temp;
			}
		}
		
		sb.append(min).append(" ").append(max);
		bw.write(sb.toString());
		br.close();
		bw.close();
		
		
		
		
	}
	
	
}
