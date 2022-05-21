package day2;
import java.io.*;
public class P11720 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int n =  Integer.parseInt(br.readLine());
	
	String input = br.readLine();
	int sum =0;
	for(int i=0;i<n;i++) {
		int tmp = input.charAt(i)-'0';
		sum += tmp;
		
	}
	bw.write(sum+"");
	
	/**
	 * sum이 char형태로 쓰여지기 때문에...
	 * sum을 그대로 출력하면 문제가 발생하게 된다.
	 */
	bw.close();
	br.close();
	
}
}
