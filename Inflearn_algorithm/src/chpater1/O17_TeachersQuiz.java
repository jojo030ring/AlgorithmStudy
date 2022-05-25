package chpater1;
import java.util.*;
import java.io.*;
public class O17_TeachersQuiz {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int tmpN = Integer.parseInt(st.nextToken());
			int inputSum = Integer.parseInt(st.nextToken());
			int sum = 0;
			for(int j=1;j<=tmpN;j++) {
				sum+=j;
			}
			if(inputSum == sum) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}
		
		bw.close();
		br.close();
		
	}
}
