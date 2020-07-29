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
			
			System.out.println("★★★★★★★★★★★★★★★★★");
			System.out.println("★★★coffee  oder★★★");
			System.out.println("★★★★★★★★★★★★★★★★★");
			System.out.println("★★★1. 회원가입         ★★★");
			System.out.println("★★★2. 로그인            ★★★");
			System.out.println("★★★3. 스탬프사용      ★★★");
			System.out.println("★★★4. 종료               ★★★");
			System.out.println("★★★★★★★★★★★★★★★★★");
			System.out.println("★★★★★★★★★★★★★★★★★");
			
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
				System.out.println("프로그램이 종료됩니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
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
		System.out.println("★★★★★★스탬프 사용메뉴★★★★★★");
		System.out.println("사용가능한 스탬프 갯수: "+mjoin.temp.stamp);
		System.out.println("몇개를 사용하시겠습니까?");
		int useStamp = Integer.parseInt(sc.nextLine());
		if(getStamp<useStamp*10) {
			System.out.println("스탬프가 모자랍니다.");
			mainView();
		}else {
			System.out.println("스탬프 "+useStamp+"개를 사용하였습니다.");
			getStamp = getStamp-(useStamp*10);
		}
		
	}
	
	
}
