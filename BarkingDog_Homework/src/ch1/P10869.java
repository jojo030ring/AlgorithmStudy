package ch1;
import java.io.*;
import java.util.StringTokenizer;
public class P10869 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		st = new StringTokenizer(input);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		sb.append(a+b).append("\n");
		sb.append(a-b).append("\n");
		sb.append(a*b).append("\n");
		sb.append(a/b).append("\n");
		sb.append(a%b).append("\n");
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}
