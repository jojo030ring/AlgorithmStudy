package programmers_lv1;
import java.util.*;
public class P9_���������������ϱ� {
	public static void main(String[] args) {
		// ������ ������ �迭 arr. 
		// ���� ���� ���� ������ �迭�� �����ϴ� �Լ� solution
		// �����ϴ� �迭�� �� �迭�� ��� -1�� ä�� ����.
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
    	 
    	 // �ּҰ��� ��� ����
    	 int min = list.remove(list.size()-1);
    	 while(list.contains(min)) {
    		 list.removeLast();
    	 }
    	 
    	 // �迭�� �Űܴ�� ��ȯ
    	 int[] result = new int[list.size()];
    	 for(int i=0;i<list.size();i++) {
    		 result[i] = list.get(i);
    	 }
    	 return result;
     }
	 }
  */

