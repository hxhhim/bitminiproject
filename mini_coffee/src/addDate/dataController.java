package addDate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import mini_coffee.Member;

public class dataController {
	static ArrayList<Member> members = new ArrayList<>();
	
	void load1() throws Exception{
		
		File file = new File("member1.dat");
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
				System.out.println("loaderror");
			}
			
	}
	void load2() throws Exception{
		
		File file = new File("member2.dat");
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
				System.out.println("loaderror");
			}
			
	}
	void load3() throws Exception{
		
		File file = new File("member3.dat");
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
				System.out.println("loaderror");
			}
			
	}
		void load4() throws Exception{
		
		File file = new File("memberplus.dat");
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
				System.out.println("loaderror");
			}
			
	}
	
		 void savetoFile() throws Exception {
			File file = new File("memberplus.dat");
			FileOutputStream out = null;
			ObjectOutputStream out2= null;
			try {
				out = new FileOutputStream(file);
				out2 = new ObjectOutputStream(out);
				for(Member member : dataController.members) {
				out2.writeObject(member);
				}
			}catch(Exception e) {
				System.out.println("데이터 저장시 오류발생");
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
