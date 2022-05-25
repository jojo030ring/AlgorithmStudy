package chpater1;
import java.util.*;
import java.io.*;
public class O16_Anagram {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] input1Cnt = new int[26];
		int[] input2Cnt = new int[26];
		String input1 = br.readLine().toLowerCase(); // 대소문자 상관없이 같은 문자를 골라내기 위함
		String input2 = br.readLine().toLowerCase();
		
		for(int i=0;i<input1.length();i++) {
			input1Cnt[input1.charAt(i)-'a']++;
			input2Cnt[input2.charAt(i)-'a']++;
		}
		int cnt=0;
		for(int i=0;i<input1Cnt.length;i++, cnt ++) {
			if(input1Cnt[i] != input2Cnt[i]) {
				bw.write("NO");
			}
			
		}
		if(cnt==input1Cnt.length)
			bw.write("YES");
		
		bw.close();
	}
}
