package mini_coffee;

import java.util.ArrayList;

class storemenuList {											
		String[] SL1 = new String[10];
		String[] SL2 = new String[10];	
		ArrayList<Basket> bsk = new ArrayList<Basket>();
		public storemenuList() {										
			//2P���� �������� storeList									
												
			SL1[0] = "1. �ų�����";									
			SL1[1] = "2. ������";									
			SL1[2] = "3. ��������";									
			SL1[3] = "4. �Ｚ�߾���";									
			SL1[4] = "5. ��������";									
			SL1[5] = "6. ���տ����";									
			SL1[6] = "7. ������ ";									
			SL1[7] = "8. ���̰����";									
			SL1[8] = "9. ������";									
			SL1[9] = "10. ���ĳ�����";		
													
			//    ������/      ��ġ/         ��ð�/        ��ȭ��ȣ/										
			SL2[0] = "�ų�����\n�ų����� 6�� �ⱸ\n09:00 ~ 21:00\n02-0001-0001";										
			SL2[1] = "������\n���ֿ� 2�� �ⱸ\n09:00 ~ 21:00\n02-0001-0002";										
			SL2[2] = "��������\n�������� 1���ⱸ\n09:00 ~ 21:00\n02-0001-0003";										
			SL2[3] = "�Ｚ�߾���\n�Ｚ�߾ӿ� 4�� �ⱸ\n09:00 ~ 21:00\n02-0001-0004";										
			SL2[4] = "��������\n�����翪 2�� �ⱸ\n09:00 ~ 21:00\n02-0001-0005";										
			SL2[5] = "���տ����\n���տ�� ����\n09:00 ~ 21:00\n02-0001-0006";										
			SL2[6] = "������ \n������ 3�� �ⱸ\n09:00 ~ 21:00\n02-0001-0007";										
			SL2[7] = "���̰����\n���̰�п� 2�� �ⱸ\n09:00 ~ 21:00\n02-0001-0008";										
			SL2[8] = "������\n���̿� 2���ⱸ\n09:00 ~ 21:00\n02-0001-0009";										
			SL2[9] = "���ĳ�����\n���ĳ��翪 ���系\n09:00 ~ 21:00\n02-0001-0010";
			
//			Basket bsk1 = new Basket("�Ƹ޸�ī��",3000);
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
	* 1. �ų����� / �ų����� 6�� �ⱸ / 09:00 ~ 21:00 / 02-0001-0001											
	* 2. ������ / ���ֿ� 2�� �ⱸ / 09:00 ~ 21:00 / 02-0001-0002											
	* 3. �������� / �������� 1���ⱸ / 09:00 ~ 21:00 / 02-0001-0003											
	* 4. �Ｚ�߾��� / �Ｚ�߾ӿ� 4�� �ⱸ / 09:00 ~ 21:00 / 02-0001-0004											
	* 5. �������� / �����翪 2�� �ⱸ / 09:00 ~ 21:00 / 02-0001-0005											
	* 6. ���տ���� / ���տ�� ���� / 09:00 ~ 21:00 / 02-0001-0006											
	* 7. ������ / ������ 3�� �ⱸ / 09:00 ~ 21:00 / 02-0001-0007											
	* 8. ���̰���� / ���̰�п� 2�� �ⱸ / 09:00 ~ 21:00 / 02-0001-0008											
	* 9. ������ / ���̿� 2���ⱸ / 09:00 ~ 21:00 / 02-0001-0009											
	* 10. ���ĳ����� / ���ĳ��翪 ���系 / 09:00 ~ 21:00 / 02-0001-0010											
	*											
	*/											