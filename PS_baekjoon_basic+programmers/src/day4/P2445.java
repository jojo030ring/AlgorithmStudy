package day4;
import java.io.*;
public class P2445 {
	public static void main(String[] args) throws Exception{
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bos = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt (bis.readLine());
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) sb.append("*");
			for(int k=0;k<2*n-2*i;k++) sb.append(" ");
			for(int l=0;l<i;l++) sb.append("*");
			sb.append("\n");
		}
		
		for(int i=1;i<=n-1;i++) {
			for(int j=n-i;j>0;j--) sb.append("*");
			for(int k=0;k<2*i;k++) sb.append(" ");
			for(int l=n-i;l>0;l--) sb.append("*");
			sb.append("\n");
		}
		bos.write(sb.toString());
		bos.close();
		bis.close();
	}
}
