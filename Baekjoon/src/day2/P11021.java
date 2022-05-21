package day2;
import java.util.*;
import java.io.*;
public class P11021 {
public static void main(String[] args) throws Exception{
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int a = Integer.parseInt(br.readLine());
	
	for(int i=0;i<a;i++) {
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input," ");
		// ÇÑ ÁÙ·Î StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		sb.append("Case #"+(i+1)+": "+(Integer.parseInt(st.nextToken())
		+Integer.parseInt(st.nextToken()))+"\n");
		
	}
	
	bw.write(sb.toString());
	bw.flush();
	bw.close();
	br.close();
	
	
	
}
}
