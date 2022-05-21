package day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10992 {
	public static void main(String[] args) throws Exception{
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bos = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bis.readLine());
		for(int i=0;i<n-1;i++) {
			for(int j=n-i;j>1;j--) {
				bos.write(" ");
			}
			for(int k=0;k<=i;k++) {
				if (k==0 || k==i) bos.write("* "); 
				else bos.write("  ");			}
			bos.newLine();
		}
		for(int i=0;i<2*n-1;i++) {
			bos.write("*");
		}
		bos.close();
		bis.close();
	}
}
