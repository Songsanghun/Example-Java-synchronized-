package array;

public class ArrayServiceImpl implements ArrayService{
//"Java","JSP","Spring","JS","Html"
	String[] arr;
	public ArrayServiceImpl() {
		arr = new String[5];
	}
	@Override
	public void add() {
		arr[0]="Java";
		arr[1]="JSP";
		arr[2]="Spring";
		arr[3]="JS";
		arr[4]="Html";
	}

	@Override
	public String findOne() {
		String h = "H";
		String result="";
		for(int i=0;i<arr.length;i++){
			char c = arr[i].charAt(0);
			if(h.equals(String.valueOf(c))){
				result = arr[i];
				break;
			}
		}
		return result;
	}

	@Override
	public String findSome() {
		String result="";
		for(int i=0;i<arr.length;i++){
			if('J' == arr[i].charAt(0)){
				result +=arr[i]+"\t";
			}
		}
		return result;
	}

	@Override
	public String List() {
		String result="";
		for(int i=0;i<arr.length;i++){
			result += arr[i]+"\t";
		}
		return result;
	}

	@Override
	public String update() {
		String result="";
		for(int i=0;i<arr.length;i++){
			if("JS".equals(arr[i])){
				arr[i] = "Javascript";
			}
			result += arr[i]+"\t";
		}
		return result;
	}

	@Override
	public String delete() {
		String result="";
		for(int i=0;i<arr.length;i++){
			if("Spring".equals(arr[i])){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=null;
			}
		}
		for(int i=0;i<arr.length-1;i++){
			result+=arr[i]+"\t";
		}
		return result;
	}
	
		
}
