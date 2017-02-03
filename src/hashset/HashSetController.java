package hashset;
import java.util.*;
public class HashSetController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {"Java","JSP","Spring","JS","Html"};
		String k ="";
		for(int i=0;i<arr.length;i++){
			k+=arr[i]+",";
		}
		System.out.println("Array :  [" +k+"]");
		HashSet<String> set = new HashSet<String>();
		
		for(String i:arr){ //for(int i=0;i<....,i++)과 같은 뜻 arr이 더 큼 int;;i++ 이 문법을 축약하기위해 :쓰고 작은것이 앞 큰것이 :뒤에 온다.
			set.add(i);  //가방구조로 저장 널부러져있다. //"Java","JSP","Spring","JS" 중복 제거
		}
		System.out.println();
		System.out.println("SET : " +set.toString());  //set 출력은 순서가 돌릴때마다 다르게 나온다.
		System.out.println("삭제를 원하는 값 입력하세요.");
		String del = s.next();
		String result = "";
		String result2 = "";
		for(int i=0;i<arr.length;i++){
			if(del.equals(arr[i])){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=null;
				result2 = "삭제가 되었습니다.";
				break;
			}else{
				result=del+"는 없는 값입니다.";
			}
		}
		System.out.println(result);
		System.out.println(result2);
		String result3 = "";
		for(int i=0;i<arr.length-1;i++){
			result3+=arr[i]+"\t";
		}
		System.out.println(result3);
	}
}
