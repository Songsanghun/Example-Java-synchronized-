package hashset;

import java.util.*;

public class HashSetController2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 추가 ... 위에 주어진 배열 arr을 set에 추가하기
		String[] arr = {"Java","JSP","Spring","JS","Html"};
		
		Set<String> set = new HashSet<String>();
		for(String i:arr){
			set.add(i);
		}
		// 2.검색(1)...첫글자가 H로 시작하는 단어를 출력
		System.out.println("2 : 첫글자 H로 시작하는 단어 출력 로직");
		String h = "H";
		String result = "";
		for(int i=0;i<arr.length;i++){
			char c = arr[i].charAt(0);
			if(h.equals(String.valueOf(c))){
				result = arr[i];
				break;
			}
		}
		System.out.println(result);
		System.out.println("3 : 첫글자 J로 시작하는 단어 출력 로직");
		// 3.검색(some)...첫글자가 J로 시작하는 단어를 출력
		result = "";
		for(int i=0;i<arr.length;i++){
			if('J' == arr[i].charAt(0)){
				result +=arr[i]+"\t";
			}
		}
		System.out.println(result);
		// 4.전체 출력
		System.out.println("4 : 전체출력 로직");
		result = "";
		for(int i=0;i<arr.length;i++){
			result += arr[i]+"\t";
		}
		System.out.println(result);
		// 매 알고리즘이 완성되면 배열 arr을 프린트하기
		// 5.수정 (JS를 Javascript) 로 변경
		System.out.println("5 : Javascript 변경 로직");
		result ="";
		for(int i=0;i<arr.length;i++){
			if("JS".equals(arr[i])){
				arr[i] = "Javascript";
			}
			result += arr[i]+"\t";
		}
		System.out.println(result);
		
		// 6.삭제 (Spring 를 삭제)
		System.out.println("6 : Spring 삭제 로직");
		result = "";
		for(int i=0;i<arr.length;i++){
			if("Spring".equals(arr[i])){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=null;
				result = "Spring은 삭제되었습니다.";
			}
		}
		System.out.println(result);
		result ="";
		for(int i=0;i<arr.length-1;i++){
			result += arr[i]+"\t";
		}
		System.out.println(result);
	}
}
