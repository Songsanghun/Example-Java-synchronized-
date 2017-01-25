package shopping;
import javax.swing.JOptionPane;
import shopping.Product;
import shopping.Customer;

public class Himart {
	public static void main(String[] args) {
		CustomerServiceImpl service = new CustomerServiceImpl();  //다형성
		String status = "";
		Customer c = service.c;
		StringBuffer sb = new StringBuffer();
		while(true){
			switch(JOptionPane.showInputDialog("뭘 살까 0.종료 1.TV 2.폰 3.청소기 4.PC")){
			case "0" : 
				JOptionPane.showMessageDialog(null,service.getBill()); 
				return;
			case "1" : 
				Product tv = new TV();
				sb.append(tv.toString()+"\n");
				status = service.buy(tv);
				JOptionPane.showMessageDialog(null, status);
				break;
			case "2" :
				Product smartphone = new SmartPhone();
				sb.append(smartphone.toString()+"\n");
				status = service.buy(smartphone);
				JOptionPane.showMessageDialog(null, status);
				break;
			case "3" :
				Product cleaner = new Cleaner();
				sb.append(cleaner.toString()+"\n");
				status = service.buy(cleaner);
				JOptionPane.showMessageDialog(null, status);
				break;
			case "4" :
				Product pc = new Computer();
				sb.append(pc.toString()+"\n");
				status = service.buy(pc);
				JOptionPane.showMessageDialog(null, status);
				break;
			}
		}
	}
}
