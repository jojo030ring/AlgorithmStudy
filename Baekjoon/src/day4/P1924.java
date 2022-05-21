package day4;
import java.util.*;
import java.io.*;
public class P1924 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2007);
		c.set(Calendar.MONTH, Integer.parseInt (st.nextToken())-1);
		c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(st.nextToken()));
		
		switch(c.get(Calendar.DAY_OF_WEEK)) {
		case 1 :
			bw.write("SUN");
			break;
		case 2 :
			bw.write("MON");
			break;
		case 3 :
			bw.write("TUE");
			break;
		case 4 :
			bw.write("WED");
			break;
		case 5 :
			bw.write("THU");
			break;
		case 6 :
			bw.write("FRI");
			break;
		case 7 :
			bw.write("SAT");
			break;
		}
		
		bw.close();
		br.close();
	}
}
