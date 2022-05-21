package day3;
import java.io.*;
public class P2742 {

	public static void main(String[] args) throws IOException {
		/**
		 * N ��� (����)
		 * �ڿ��� N > N���� 1 ���� �� �ٿ� �ϳ��� ���
		 */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int input = Integer.parseInt(br.readLine());
		
		for(int i=input;i>=1;i--) {
			/**
			 * StringBuilder �� ����Ͽ� �ð��� �����غ���.
			 * 
			 */
			sb.append(i).append("\n");
			
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
		
		
	}

}
