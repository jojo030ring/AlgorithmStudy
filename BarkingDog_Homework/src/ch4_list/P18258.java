package ch4_list;
import java.util.*;
import java.io.*;
public class P18258 {
	public static void main(String[] args) throws Exception{
		Deque<Integer> deque = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		for(int i=0;i<n;i++) {
			String command = br.readLine();
			st = new StringTokenizer(command," ");
			switch(st.nextToken()) {
			case "push" :
				int value = Integer.parseInt(st.nextToken());
				deque.addLast(value);
				break;
			case "pop" :
				bw.write(deque.isEmpty() ? "-1\n" : deque.removeFirst()+"\n");
				break;
			case "front" :
				bw.write(deque.isEmpty()? "-1\n" : deque.getFirst()+"\n");
				break;
			case "back" :
				bw.write(deque.getLast()+"\n");
				break;
			case "empty" :
				bw.write(deque.isEmpty() ? "1\n" : "0\n");
				break;
			case "size" :
				bw.write(deque.isEmpty() ? "0\n" : deque.size()+"\n");
				break;
			
			default :
				break;
			}
		}
		br.close();
		bw.close();
		
	}
}
