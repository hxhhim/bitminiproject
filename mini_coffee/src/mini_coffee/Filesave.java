package mini_coffee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Filesave {
	static void savetoFile() throws Exception {
		File file = new File("member.dat");
		FileOutputStream out = null;
		ObjectOutputStream out2= null;
		try {
			out = new FileOutputStream(file);
			out2 = new ObjectOutputStream(out);
			for(Member member : Menujoin.members) {
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

}
