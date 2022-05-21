package day4;
import java.util.*;
import java.io.*;
public class P1924_1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		int totalDay = 0;
		int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] days = { "SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"};
		for(int i=1;i<month;i++) {
			totalDay += months[i];
		}
		totalDay += day;
		bw.write(days[totalDay%7]);
		bw.close();
		br.close();
		
	}
}
