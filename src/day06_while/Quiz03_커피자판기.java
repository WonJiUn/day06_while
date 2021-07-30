package day06_while;

import java.util.Scanner;

public class Quiz03_커피자판기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cash = 0;
		int coffee = 200;
		int cocoa = 250;
		int select;
		
		System.out.print("요금을 투입하세요 >>> ");
		cash = sc.nextInt();
		
		for(;;) {
			System.out.println("===========커피 자판기===========");
			System.out.println();
			
			System.out.println("1. 커피(200)\t2.코코아(250)\t3. 반환\t4. 종료");
			System.out.print("메뉴를 선택하세요 >>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1 : 
				if((cash-coffee) < 0) {
					System.out.println("요금이 부족합니다.");
					break;
				}else {
					System.out.println("맛있게 드세요");
					cash-=coffee;
					break;
				}
			case 2 : 
				if((cash-cocoa) < 0) {
					System.out.println("요금이 부족합니다.");
					break;
				}else {
					System.out.println("맛있게 드세요");
					cash-=cocoa;
					break;
				}
			case 3 :
				System.out.println("거스름돈 : " + cash);
				cash = 0;
				break;
			case 4 : 
				System.out.println("프로그램을 종료합니다");
				System.exit(1);
			default : System.out.println("1~4를 입력해주세요");
			}
		}
		
		
		
		
	}
}
