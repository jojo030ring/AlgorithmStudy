package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10818 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int min = 99999999;
		int max = -99999999;
		/**
		 * �Է��� �鸸�̱� ������, ����� ���� ����� ū ���� ����� ���� ����
		 * �����Ͽ� � ���� �ԷµǴ��� min�� max ���� ���� �� �ְ� ��
		 */
		int num = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		st = new StringTokenizer(input, " ");
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			if(min>temp) {
				min = temp;
			}
			if(max<temp ) {
				max = temp;
			}
		}
		
		sb.append(min).append(" ").append(max);
		bw.write(sb.toString());
		br.close();
		bw.close();
		
		
		
		
	}
	
	
}
