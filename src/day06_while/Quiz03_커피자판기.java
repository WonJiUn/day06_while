package day06_while;

import java.util.Scanner;

public class Quiz03_Ŀ�����Ǳ� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cash = 0;
		int coffee = 200;
		int cocoa = 250;
		int select;
		
		System.out.print("����� �����ϼ��� >>> ");
		cash = sc.nextInt();
		
		for(;;) {
			System.out.println("===========Ŀ�� ���Ǳ�===========");
			System.out.println();
			
			System.out.println("1. Ŀ��(200)\t2.���ھ�(250)\t3. ��ȯ\t4. ����");
			System.out.print("�޴��� �����ϼ��� >>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1 : 
				if((cash-coffee) < 0) {
					System.out.println("����� �����մϴ�.");
					break;
				}else {
					System.out.println("���ְ� �弼��");
					cash-=coffee;
					break;
				}
			case 2 : 
				if((cash-cocoa) < 0) {
					System.out.println("����� �����մϴ�.");
					break;
				}else {
					System.out.println("���ְ� �弼��");
					cash-=cocoa;
					break;
				}
			case 3 :
				System.out.println("�Ž����� : " + cash);
				cash = 0;
				break;
			case 4 : 
				System.out.println("���α׷��� �����մϴ�");
				System.exit(1);
			default : System.out.println("1~4�� �Է����ּ���");
			}
		}
		
		
		
		
	}
}
