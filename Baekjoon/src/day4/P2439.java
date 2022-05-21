package day4;
import java.io.*;
public class P2439 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			for(int j=4-i;j>0;j--) {
				bw.write(' ');
			}
			for(int k=0;k<=i;k++) {
				bw.write('*');
			}
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}
