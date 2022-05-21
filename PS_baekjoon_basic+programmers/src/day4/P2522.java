package day4;
import java.io.*;
public class P2522 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) sb.append(" ");
			for(int k=0; k<=i;k++) sb.append("*");
			sb.append("\n");
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<=i;j++) sb.append(" ");
			for(int k=n-i;k>1;k--) sb.append("*");
			sb.append("\n");
		}
		bw.write(sb.toString());
		
		
		br.close();
		bw.close();
	}
}
