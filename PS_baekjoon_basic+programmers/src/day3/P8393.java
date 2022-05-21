package day3;
import java.io.*;
public class P8393 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=1;i<=input;i++) {
			sum += i;
		}
		bw.write(sum+"");
		bw.close();
		br.close();
		
	}
}
