package day2;
import java.util.StringTokenizer;
import java.io.*;
public class P11022 {
public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st = null;
	
	int n = Integer.parseInt(br.readLine());
	
	for(int i=0;i<n;i++) {
		st=  new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		bw.write("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b)+"\n");
	}
	bw.flush();
	bw.close();
	br.close();
	
}
}
