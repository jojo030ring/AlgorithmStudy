package chapter5;

import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.*;
public class P1406 {
	// 시간초과
	public static void main(String[] args) throws IOException {
		LinkedList<String> list = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inputStr = br.readLine();
		for(int i =0;i<inputStr.length();i++) {
			list.add(inputStr.charAt(i)+"");
			
		}
		
		int cursor = inputStr.length();
		
		
		int commandCnt = Integer.parseInt(br.readLine());
		String command = null;
		String targetChar = null;
		StringTokenizer st;
		for(int i=0;i<commandCnt;i++) {
			command = br.readLine();
			st = new StringTokenizer(command, " ");
			command = st.nextToken();

			
			switch(command) {
			case "L" : 
				cursor += (cursor!=0)? -1 : 0;
				break;
			case "D" :
				cursor += (cursor!=inputStr.length()-1)? 1 : 0;
				break;
			case "B" :
				if(cursor!=0) {
					list.remove(cursor);
				}
				break;
			case "P" :
				targetChar = st.nextToken();
				if(cursor == 0)
					list.addFirst(targetChar);
				else if(cursor == inputStr.length()-1)
					list.addLast(targetChar);
				else 
					list.add(cursor,targetChar);
				cursor ++;
				
				break;
			}
			
			
			
		}
		
		for(int i=0;i<list.size();i++) {
			bw.write(list.get(i));
		}
		
		bw.close();
		br.close();
	}
}
