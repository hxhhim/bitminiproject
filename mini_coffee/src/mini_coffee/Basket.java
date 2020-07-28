package mini_coffee;

public class Basket {
	   private String name;   // �ֹ��� �����
	   private int count;      // �ֹ��� ���� ����
	   private int price;      // �ܴ� ����
	   private int sum;
	   
	   public Basket() {
	      
	   }
	   
	   public Basket(String name, int count, int price) {
	      this.name = name;
	      this.count = count;
	      this.price = price;
	      sum = getSum();
	   }
	   
	   public int getCount() {
	      return count;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   public int getSum() {      
	      return sum = count*price;
	   }
	   public String toString() {
	      return "Basket: [name:"+name+"  totalPrice:"+sum+" count:"+count+"]";
	   }
	}