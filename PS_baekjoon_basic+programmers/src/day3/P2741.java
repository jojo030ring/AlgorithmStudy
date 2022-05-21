package day3;
import java.io.*;
public class P2741 {
public static void main(String[] args) throws IOException {
	/**
	 * N 찍기
	 * 자연수 N > 1부터 N 까지 한 줄에 하나씩 출력
	 */
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int input = Integer.parseInt(br.readLine());
	
	for(int i=1;i<=input;i++) {
		/**
		 * StringBuilder 를 사용하여 시간을 단축해보자.
		 * 
		 */
		sb.append(i).append("\n");
		
	}
	bw.write(sb.toString());
	bw.close();
	br.close();
	
	
}
}
