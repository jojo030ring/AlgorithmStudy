package day4;
import java.io.*;
public class P2440 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				bw.write('*');
				
			}
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}
