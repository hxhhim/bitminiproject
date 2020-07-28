package mini_coffee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menujoin {
	static ArrayList<Member> members = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	Member temp = new Member();
	
	public Menujoin() {
		
	}
	
	public void join() throws Exception  {
		load();
		System.out.println("회원가입메뉴입니다.");
		int result=1;
		String id = null;
		while(result!=0) {
			System.out.println("id: ");
			id = sc.nextLine();
			for(int i=0;i<members.size();i++) {
				if(members.get(i).id.equals(id)) {
					result = 1;
				}else {
					result = 0;
				}
			}
			if(result==1) {
				System.out.println("이미 사용된 아이디 입니다.");
			}else {
				System.out.println("사용가능한 아이디입니다.");
			}
			
	}
		System.out.println("password: ");
		String password = sc.nextLine();
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("전화번호: ");
		String phoneNumber = sc.nextLine();
		System.out.println("결제정보(카드번호): ");
		String creditCard = sc.nextLine();
		System.out.println("나의매장(없으면 없음): ");
		String myStroe = sc.nextLine();
	
		Member member =  new Member(name,phoneNumber,creditCard,id,password,myStroe);
		
		members.add(member);
		Filesave.savetoFile();
	}
	 Member login() throws Exception {
		load();
		System.out.println("--로그인메뉴--");
		System.out.println("id를 입력: ");
		String inputid = sc.nextLine();
		System.out.println("password 입력: ");
		String inputpassword = sc.nextLine();
		int result = 0;
		for(int i=0;i<members.size();i++) {
			if(members.get(i).id.equals(inputid)) {
				if(members.get(i).password.equals(inputpassword)) {
					temp = members.get(i);
					result = 0;
					break ;
			   	}else {
						result = 1;
					}
			 }else {
					result = 1;
			}
			
		}
		if(result ==0) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("일치하지 않습니다.");
		}
		return temp;
		
	}
	
	public void load() throws Exception{
		
		File file = new File("member.dat");
		if(!(file.exists()&&file.isFile())) {
			return;
		}
		try (
			FileInputStream in = new FileInputStream(file);
			ObjectInputStream in2 = new ObjectInputStream(in);)
			{Member member =null;
			while(true){
				member = (Member)in2.readObject();
				members.add(member);
			}
			}catch(Exception e) {
				
			}
			
	}
	
	
	
	void printAll() {
		for(Member member : members) {
			System.out.println(member);
		}
	}
	
	
}
