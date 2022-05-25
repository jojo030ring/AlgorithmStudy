package chpater1;
import java.util.*;
public class O16_1_Anagram {
	public static void main(String[] args) {
		int[] a = new int[52]; // 0-25 : 소문자 / 26-51 : 대문자
		int[] b = new int[52];
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		boolean isAnagram = false;
		for(int i=0;i<input1.length();i++) {
			char c = input1.charAt(i);
			
			if(c>='A' && c<='Z')
				a[c-'A']++;
			else 
				a[c-'a']++;
		
		}
		for(int i=0;i<input2.length();i++) {
			char c = input2.charAt(i);
			
			if(c>='A' && c<='Z')
				b[c-'A']++;
			else 
				b[c-'a']++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i] == b[i]) {
				isAnagram = true;
			} else {
				isAnagram = false;
				break;
			}
		}
		System.out.println(isAnagram ? "YES" : "NO");
		sc.close();
	}
}
