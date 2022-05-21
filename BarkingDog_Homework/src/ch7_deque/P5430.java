package ch7_deque;

import java.io.*;
import java.util.*;
public class P5430 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> ll = new LinkedList<>();
		int T= Integer.parseInt(br.readLine());
		int n;
		char[] command;
		int arr[];
		
		
		int sameRcommand = 0;
		
		
		for(int i=0;i<T;i++) {
			command = getCommand(br.readLine());
			n = Integer.parseInt(br.readLine());
			arr = getInputArray(br.readLine(),n);
			ll.clear();
			initList(ll,arr);
			
			for(int j=0;j<command.length;j++) {
				switch(command[j]) {
				case 'D' :
					// D ±¸Çö
					if(ll.isEmpty()) {
						sb.append("error\n");
					} else {
						ll.remove(0);
					}
					sameRcommand = 0;
					
					break;
				case'R' :
						sameRcommand ++;
						if(sameRcommand % 2!=0) {
							Collections.sort(ll,new Comparator<Integer>() {
								public int compare(Integer i1, Integer i2) {
									return i2-i1;
								}
							});
						} else {
							Collections.sort(ll);
						}
					
					break;
					} 
		
					
				}
			if(!ll.isEmpty()) sb.append(ll.toString()+"\n");
			}
			
		
		bw.write(sb.toString());
		bw.close();
		br.close();
		
	}

	private static int[] getInputArray(String arrInput,int n) {
		// TODO Auto-generated method stub
		arrInput = arrInput.substring(1,arrInput.length()-1).replace(",","");
		int [] result = new int[n];
		for(int i=0;i<n;i++) {
			result[i] = arrInput.charAt(i)-'0';
		}
		return result;
	}

	private static char[] getCommand(String p) {
		char[] result = new char[p.length()];
		for(int i=0;i<p.length();i++) {
			result[i] = p.charAt(i);
		}
		return result;
	}
	private static void initList(LinkedList<Integer> list, int arr[]) {
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
	}
}
