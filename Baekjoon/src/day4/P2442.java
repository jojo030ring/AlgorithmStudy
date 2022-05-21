package day4;
import java.io.*;
public class P2442  {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			// j : 0~n-i-1 
			/**
			 * 1줄 : 4
			 * 	0<=x<4 >> 0,1,2,3
			 * 2줄 : 3
			 *  0<=x<3 >> 0,1,2
			 * 3줄 : 2
			 *  0<=x<2 >> 0,1
			 * 4줄 : 1
			 *  0<=x<1 >> 0
			 * 5줄 : X 
			 */
			// k : 1,3,5,7,9... 
			for(int j=0;j<n-i-1;j++) {
				bw.write(' ');
			}
			for(int k=0;k<2*i+1;k++) {
				bw.write('*');
			}
			
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
