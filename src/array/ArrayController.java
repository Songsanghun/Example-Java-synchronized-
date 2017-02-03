package array;
public class ArrayController {
	public static void main(String[] args) {
		ArrayService service = new ArrayServiceImpl();
		service.add();
		String temp ="";
		temp = String.format("First H : %s\n"
				+ "First J : %s\n"
				+ "FindAll : %s\n"
				+ "Update : %s\n"
				+ "Delete : %s",service.findOne(),service.findSome(),service.List(),service.update(),service.delete());
		System.out.printf(temp);
	}
}
