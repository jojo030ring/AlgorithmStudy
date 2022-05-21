package day4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class P2446 {
	public static void main(String[] args) throws Exception{
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bos = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt (bis.readLine());
		for(int i=0;i<n;i++) {
			for(int k=0;k<i;k++) sb.append(" ");
			for(int j=0;j<2*n-1-2*i;j++) sb.append("*");
			sb.append("\n");
		
		}
		
		for(int i=0;i<n-1;i++ ) {
			for(int j=n-1-i;j>1;j--) sb.append(" ");
			for(int k=0;k<2*i+3;k++) sb.append("*");
			sb.append("\n");
		}
		bos.write(sb.toString());
		bos.close();
		bis.close();
	}
}
