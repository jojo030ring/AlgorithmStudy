package programmers_lv1;
import java.util.*;
public class P9_제일작은수제거하기 {
	public static void main(String[] args) {
		// 정수를 저장할 배열 arr. 
		// 가장 작은 수를 제거한 배열을 리턴하는 함수 solution
		// 리턴하는 배열이 빈 배열인 경우 -1을 채워 리턴.
		solution(new int[] {1,2,3,4,5,1});
	}
	
	  public static int[] solution(int[] arr) {
	      if(arr.length == 1){
	          int[] answer = {-1};
	          return answer;
	      }

	      int[] answer = new int[arr.length-1];
	      int minIndex=0;

	      for(int i=0;i<arr.length;i++){
	          if(arr[minIndex]>arr[i]){
	              minIndex = i;
	          }
	      }
	      for(int i=minIndex+1;i<arr.length;i++){
	          arr[i-1] = arr[i];
	      }
	      for(int i=0;i<answer.length;i++){
	          answer[i] = arr[i];
	      }
	      System.out.println(Arrays.toString(answer));
	      return answer;
	  }
}
 /**
  * public int[] solution(int[] arr) {
	 
     if(arr.length==1) {
    	 return new int[] {-1};
    	 
     }
     else {
    	 LinkedList<Integer> list = new LinkedList<>();
    	 for(int i=0;i<arr.length;i++) {
    		 list.add(arr[i]);
    	 }
    	 Collections.sort(list,new Comparator<Integer>() {
    		 public int compare(Integer i1, Integer i2) {
    			 return (int)(i2-i1);
    		 }
    	 });
    	 
    	 // 최소값을 모두 삭제
    	 int min = list.remove(list.size()-1);
    	 while(list.contains(min)) {
    		 list.removeLast();
    	 }
    	 
    	 // 배열에 옮겨담고 반환
    	 int[] result = new int[list.size()];
    	 for(int i=0;i<list.size();i++) {
    		 result[i] = list.get(i);
    	 }
    	 return result;
     }
	 }
  */

