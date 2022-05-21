package ch7_deque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P10866 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> d = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
		String command;
		int value;
		for(int i=0;i<n;i++) {
			command = br.readLine();
			st = new StringTokenizer(command, " ");
			switch(st.nextToken()) {
			case "push_front" :
				value = Integer.parseInt(st.nextToken());
				d.offerFirst(value);
				break;
				
			case "push_back" :
				value = Integer.parseInt(st.nextToken());
				d.offerLast(value);					
				break;
				
			case "pop_front" :
				if(d.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					value = d.pollFirst();
					sb.append(value+"\n");
				}
				break;
				
			case "pop_back" :
				if(d.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					value = d.pollLast();
					sb.append(value+"\n");
				}
				break;
			case "size" :
				sb.append(d.size()+"\n");
				break;
				
			case "empty" :
				sb.append((d.isEmpty()) ? "1\n" : "0\n");
				break;
				
			case "front" :
				sb.append((d.isEmpty()) ? "-1\n" : d.peekFirst()+"\n");
				break;
				
			case "back" :
				sb.append((d.isEmpty()) ? "-1\n" : d.peekLast()+"\n");
				break;
				
				
			}// switch
		}// for
		bw.write(sb.toString());
		bw.close();
		br.close();
	}// main
}// class
