package mini_coffee;

import java.time.LocalDateTime;

public class TimeSale {
	public static void main(String[] args) {
		LocalDateTime nowTime = LocalDateTime.now();
//		System.out.println(nowTime);
		int strDateTime = nowTime.getHour();
//		System.out.println(strDateTime);
		if(strDateTime>9&&strDateTime<=11) {
			System.out.println("타임세일시간입니다. 500원할인됩니다.");
//			sum = sum-500;
		}
		
	}
}
