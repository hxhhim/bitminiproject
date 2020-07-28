package mini_coffee;

import java.util.ArrayList;

class storemenuList {											
		String[] SL1 = new String[10];
		String[] SL2 = new String[10];	
		ArrayList<Basket> bsk = new ArrayList<Basket>();
		public storemenuList() {										
			//2P에서 보여지는 storeList									
												
			SL1[0] = "1. 신논현점";									
			SL1[1] = "2. 언주점";									
			SL1[2] = "3. 선정릉점";									
			SL1[3] = "4. 삼성중앙점";									
			SL1[4] = "5. 봉은사점";									
			SL1[5] = "6. 종합운동장점";									
			SL1[6] = "7. 삼전점 ";									
			SL1[7] = "8. 석촌고분점";									
			SL1[8] = "9. 석촌점";									
			SL1[9] = "10. 송파나루점";		
													
			//    지점명/      위치/         운영시간/        전화번호/										
			SL2[0] = "신논현점\n신논현역 6번 출구\n09:00 ~ 21:00\n02-0001-0001";										
			SL2[1] = "언주점\n언주역 2번 출구\n09:00 ~ 21:00\n02-0001-0002";										
			SL2[2] = "선정릉점\n선정릉역 1번출구\n09:00 ~ 21:00\n02-0001-0003";										
			SL2[3] = "삼성중앙점\n삼성중앙역 4번 출구\n09:00 ~ 21:00\n02-0001-0004";										
			SL2[4] = "봉은사점\n봉은사역 2번 출구\n09:00 ~ 21:00\n02-0001-0005";										
			SL2[5] = "종합운동장점\n종합운동장 매점\n09:00 ~ 21:00\n02-0001-0006";										
			SL2[6] = "삼전점 \n삼전역 3번 출구\n09:00 ~ 21:00\n02-0001-0007";										
			SL2[7] = "석촌고분점\n석촌고분역 2번 출구\n09:00 ~ 21:00\n02-0001-0008";										
			SL2[8] = "석촌점\n석촌역 2번출구\n09:00 ~ 21:00\n02-0001-0009";										
			SL2[9] = "송파나루점\n송파나루역 역사내\n09:00 ~ 21:00\n02-0001-0010";
			
//			Basket bsk1 = new Basket("아메리카노",3000);
//			ArrayList<Basket> bsk = new ArrayList<Basket>();
//			ArrayList<Basket> bsk = new ArrayList<Basket>();
//			ArrayList<Basket> bsk = new ArrayList<Basket>();
//			ArrayList<Basket> bsk = new ArrayList<Basket>();
//			ArrayList<Basket> bsk = new ArrayList<Basket>();
//			ArrayList<Basket> bsk = new ArrayList<Basket>();
//			ArrayList<Basket> bsk = new ArrayList<Basket>();
//			ArrayList<Basket> bsk = new ArrayList<Basket>();
//			ArrayList<Basket> bsk = new ArrayList<Basket>();
//			ArrayList<Basket> bsk = new ArrayList<Basket>();
//			
		}
		
		public void storeListPrint() {									
			for(int i = 0; i < SL1.length; i++) {									
				System.out.println(SL1[i]);								
			}	
		}
		
		
}										
										
												
											
												
	/*											
	* 1. 신논현점 / 신논현역 6번 출구 / 09:00 ~ 21:00 / 02-0001-0001											
	* 2. 언주점 / 언주역 2번 출구 / 09:00 ~ 21:00 / 02-0001-0002											
	* 3. 선정릉점 / 선정릉역 1번출구 / 09:00 ~ 21:00 / 02-0001-0003											
	* 4. 삼성중앙점 / 삼성중앙역 4번 출구 / 09:00 ~ 21:00 / 02-0001-0004											
	* 5. 봉은사점 / 봉은사역 2번 출구 / 09:00 ~ 21:00 / 02-0001-0005											
	* 6. 종합운동장점 / 종합운동장 매점 / 09:00 ~ 21:00 / 02-0001-0006											
	* 7. 삼전점 / 삼전역 3번 출구 / 09:00 ~ 21:00 / 02-0001-0007											
	* 8. 석촌고분점 / 석촌고분역 2번 출구 / 09:00 ~ 21:00 / 02-0001-0008											
	* 9. 석촌점 / 석촌역 2번출구 / 09:00 ~ 21:00 / 02-0001-0009											
	* 10. 송파나루점 / 송파나루역 역사내 / 09:00 ~ 21:00 / 02-0001-0010											
	*											
	*/											