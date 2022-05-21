package day5;

import java.io.*;
public class P10991 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bos = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bis.readLine());
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				bos.write(" ");
			}
			for(int k=0;k<=i;k++) {
				bos.write("* ");
			}
			bos.newLine();
		}
		bos.close();
		bis.close();
	}
}
