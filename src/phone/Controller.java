package phone;

import javax.swing.JOptionPane;

public class Controller {

	public void start() {
		
		while(true){
			switch(JOptionPane.showInputDialog("기능선택: 0.종료 1.삼성전화기 2.노키아 3.아이폰 4.안드로이드")){
			case "0":
				return;
			case "1":
				Phone phone = new Phone();
				phone.setReceiver(JOptionPane.showInputDialog("누구세요."));
				phone.setCall(JOptionPane.showInputDialog("전할 메시지를 입력하세요."));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case "2":
				Nokia nokia = new Nokia();
				nokia.setReceiver(JOptionPane.showInputDialog("누구세요."));
				nokia.setCall(JOptionPane.showInputDialog("전할 메시지를 입력하세요."));
				nokia.setPortable(true);
				JOptionPane.showMessageDialog(null,nokia.toString());
				break;
			case "3":
				Iphone iphone = new Iphone();
				iphone.setReceiver(JOptionPane.showInputDialog("어느사이트에서 검색하시겟습니까?"));
				iphone.setData(JOptionPane.showInputDialog("검색할 단어을 입력하세요."));
				iphone.setPortable(true);
				JOptionPane.showMessageDialog(null,iphone.toString());
				break;
			case "4":
				GalaxyNote galaxy = new GalaxyNote();
				galaxy.setReceiver(JOptionPane.showInputDialog("어느사이트에서 검색하시겟습니까?"));
				galaxy.setSize(JOptionPane.showInputDialog("어떤 사이즈로 보시겟습니까?"));
				galaxy.setData(JOptionPane.showInputDialog("검색할 단어을 입력하세요."));
				galaxy.setPortable(true);
				JOptionPane.showMessageDialog(null,galaxy.toString());
				break;
			}
		}
	}
}
