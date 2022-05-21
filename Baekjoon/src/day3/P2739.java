package day3;
import java.io.*;
public class P2739 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int dan = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=1;i<=9;i++) {
			sb.append(dan).append(" * ").append(i).append(" = ").append(dan*i).append("\n");
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}

}
