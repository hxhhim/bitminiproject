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
		System.out.println("ȸ�����Ը޴��Դϴ�.");
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
				System.out.println("�̹� ���� ���̵� �Դϴ�.");
			}else {
				System.out.println("��밡���� ���̵��Դϴ�.");
			}
			
	}
		System.out.println("password: ");
		String password = sc.nextLine();
		System.out.println("�̸�: ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ: ");
		String phoneNumber = sc.nextLine();
		System.out.println("��������(ī���ȣ): ");
		String creditCard = sc.nextLine();
		System.out.println("���Ǹ���(������ ����): ");
		String myStroe = sc.nextLine();
	
		Member member =  new Member(name,phoneNumber,creditCard,id,password,myStroe);
		
		members.add(member);
		Filesave.savetoFile();
	}
	 Member login() throws Exception {
		load();
		System.out.println("--�α��θ޴�--");
		System.out.println("id�� �Է�: ");
		String inputid = sc.nextLine();
		System.out.println("password �Է�: ");
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
			System.out.println("�α��� �Ǿ����ϴ�.");
		}else {
			System.out.println("��ġ���� �ʽ��ϴ�.");
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
