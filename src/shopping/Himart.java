package shopping;
import javax.swing.JOptionPane;
import shopping.Product;

public class Himart {
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();  //다형성
		String status = "";
		while(true){
			switch(JOptionPane.showInputDialog("뭘 살까 0.종료 1.TV 2.폰 3.청소기 4.PC")){
			case "0" : 
				JOptionPane.showMessageDialog(null,service.getBill()); 
				return;
			case "1" : 
				Product tv = new TV(); //Product 
				status = service.buy(tv);
				JOptionPane.showMessageDialog(null, status);
				break;
			case "2" :
				Product smartphone = new SmartPhone();
				status = service.buy(smartphone);
				JOptionPane.showMessageDialog(null, status);
				break;
			case "3" :
				Product cleaner = new Cleaner();
				status = service.buy(cleaner);
				JOptionPane.showMessageDialog(null, status);
				break;
			case "4" :
				Product pc = new Computer();
				status = service.buy(pc);
				JOptionPane.showMessageDialog(null, status);
				break;
			}
		}
	}
}
