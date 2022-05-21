package ch6_queue;
import java.util.*;
import java.io.*;
public class P10845 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i =0;i<n;i++) {
			String input = br.readLine();
			st = new StringTokenizer(input, " ");
			String command = st.nextToken();
			switch(command) {
			case "push" :
				q.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				bw.write((q.isEmpty()) ? "-1\n" : q.poll()+"\n");
				break;
			case "size" :
				bw.write(q.size()+"\n");
				break;
			case "empty" :
				bw.write((q.isEmpty()) ? "1\n" : "0\n");
				break;
			case "front" :
				if(!q.isEmpty())
					bw.write(((LinkedList<Integer>)q).getFirst()+"\n");
				else 
					bw.write("-1\n");
				break;
			case "back" :
				if(!q.isEmpty()) 
					bw.write(((LinkedList<Integer>)q).getLast()+"\n");
				else 
					bw.write("-1\n");
				break;
			}
		}
		
		bw.close();
		br.close();
		
	}
}
