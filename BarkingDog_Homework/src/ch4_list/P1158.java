package ch4_list;
import java.util.*;
import java.io.*;
public class P1158 {
	//¿ä¼¼Çª½º
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> people = new ArrayList<Integer>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		bw.write("<");
		for(int i = 1; i<=n;i++) {
			people.add(i);
		}
		
		int startIndex = k-1;
		while(people.size()>0) {
			if(people.size() == 0) {
				break;
			}
			if(startIndex<people.size()) {
				int removed = people.remove(startIndex);
				sb.append(removed+", ");
				startIndex += k-1;
			} else {
				startIndex = startIndex%people.size();
			}
			
			
		}
		sb.delete(sb.length()-2,sb.length());
		bw.write(sb.toString());
		bw.write(">");
		bw.close();
		
	}
}
