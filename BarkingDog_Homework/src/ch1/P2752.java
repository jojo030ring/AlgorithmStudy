package ch1;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class P2752 {
	public static void main(String[] args) throws IOException {
		// 세 수 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		st = new StringTokenizer(input);
		
		int[] arr = new int[3];
		int i = 0;
		while(st.hasMoreElements()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		Arrays.sort(arr);
		
		for(int j=0;j<arr.length;j++) {
			sb.append(arr[j]).append(' ');
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
		
	}
}
