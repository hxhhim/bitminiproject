package addDate;

import java.io.Serializable;

public class Member implements Serializable{
	String name;
	String phoneNumber;
	String creditCard;
	String id;
	String password;
	String myStore;
	 int stamp;
	
	public  Member() {
		
	}
	public Member(String name,String phoneNumber,String creditCard,String id,
			String password,String myStore) {
		
		this.name = name;
		this.phoneNumber= phoneNumber;
		this.creditCard = creditCard;
		this.id = id;
		this.password = password;
		this.myStore = myStore;
		stamp=30;
		
	}
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Member[id="+id+" , password="+password+" ,name="+name+" ,phoneNumber="+
					phoneNumber+" , creditCard="+creditCard+", myStore="+myStore+
							 ", stamp="+stamp+"]";
	}
}
