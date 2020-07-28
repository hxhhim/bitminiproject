package mini_coffee;

public class Basket {
	   private String name;   // 주문할 음료명
	   private int count;      // 주문할 음료 수량
	   private int price;      // 잔당 가격
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