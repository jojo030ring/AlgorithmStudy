package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10808 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input=br.readLine();
		char[] alphaCnt = new char[26];
		for(int i=0;i<input.length();i++) {
			alphaCnt[input.charAt(i)-'a'] ++;
		}
		
		for(int i=0;i<alphaCnt.length;i++) {
			sb.append((int)alphaCnt[i]+" ");
			
		}
		System.out.print(sb);
		br.close();
		
	}
}
//int cnt = 0;
//for(int i=0;i<alpha.length;i++) {
//	alpha[i]=(char) (i+'a');
//	for(int j=0;j<input.length();j++) {
//		if(input.charAt(j)==alpha[i]) {
//			cnt ++;
//		}
//	}
//	sb.append(cnt+" ");
//	cnt=0;
//}
//
//System.out.println(sb);
//sc.close();