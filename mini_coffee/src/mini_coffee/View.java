package mini_coffee;

import java.io.Serializable;
import java.util.Scanner;

public class View  {
	
	public static Scanner sc = new Scanner(System.in);
	
	Menujoin mjoin = new Menujoin();
	storemenuList slist = new storemenuList();
	
	public void mainView() throws Exception {
			mjoin.load();
				
		while (true) {
			
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
			System.out.println("�ڡڡ�coffee  oder�ڡڡ�");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
			System.out.println("�ڡڡ�1. ȸ������         �ڡڡ�");
			System.out.println("�ڡڡ�2. �α���            �ڡڡ�");
			System.out.println("�ڡڡ�3. ���������      �ڡڡ�");
			System.out.println("�ڡڡ�4. ����               �ڡڡ�");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
			
			String input = sc.nextLine();
			switch(input) {
			case "1":
				joinMenu();
				break;
			case "2":
				loginMenu();
				slist.storeListPrint();
				subMenu();
				break;
			case "3":
				stamp();
				return;
			case "4":
				System.out.println("���α׷��� ����˴ϴ�.");
				return;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}
		}
			
	}
	
	public void joinMenu() throws Exception {
		mjoin.join();
	}
	public void loginMenu() throws Exception {
		mjoin.login();
	}
		
	public void subMenu() {
		int selNum = Integer.parseInt(sc.nextLine());
		System.out.println(slist.SL2[selNum]);
		
	}
	public void stamp() throws Exception {
		int getStamp = mjoin.temp.stamp;
		System.out.println("�ڡڡڡڡڡڽ����� ���޴��ڡڡڡڡڡ�");
		System.out.println("��밡���� ������ ����: "+mjoin.temp.stamp);
		System.out.println("��� ����Ͻðڽ��ϱ�?");
		int useStamp = Integer.parseInt(sc.nextLine());
		if(getStamp<useStamp*10) {
			System.out.println("�������� ���ڶ��ϴ�.");
			mainView();
		}else {
			System.out.println("������ "+useStamp+"���� ����Ͽ����ϴ�.");
			getStamp = getStamp-(useStamp*10);
		}
		
	}
	
	
}
