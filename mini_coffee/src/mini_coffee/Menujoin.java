package mini_coffee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menujoin {
	ArrayList<Member> members = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Member temp = new Member();
	
	public void join() throws Exception {
			
	System.out.println("ȸ�����Ը޴��Դϴ�.");
	System.out.println("id: ");
	String id = sc.nextLine();
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
	savetoFile();
	
	}
	 Member login() {
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
	public Menujoin() throws Exception{
		
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
	
	
	void savetoFile() throws Exception {
		File file = new File("member.dat");
		FileOutputStream out = null;
		ObjectOutputStream out2= null;
		try {
			out = new FileOutputStream(file);
			out2 = new ObjectOutputStream(out);
			for(Member member : members) {
			out2.writeObject(member);
			}
		}catch(Exception e) {
			System.out.println("������ ����� �����߻�");
			throw e;
		}finally {
			try {out2.close();}catch(Exception e) {}
			try {out.close();}catch(Exception e) {}
		}
	}
	void printAll() {
		for(Member member : members) {
			System.out.println(member);
		}
	}
	
	
}