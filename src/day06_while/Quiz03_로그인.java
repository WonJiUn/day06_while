package day06_while;

import java.util.Scanner;

public class Quiz03_로그인 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String id = null;
		String pw = null;
		int select;
		
		for(;;) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.print(">>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1 : 
				System.out.print("아이디 입력 : ");
				String input_id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String input_pw = sc.next();
				if(input_id.equals(id) && input_pw.equals(pw)) {
					System.out.println("인증 성공 !!!");
					break;
				}
				else {
					System.out.println("인증 실패 !!!");
					break;
				}
				
			case 2 : 
				System.out.print("저장할 아이디 입력 : ");
				id = sc.next();
				System.out.print("저장할 비밀번호 입력 : ");
				pw = sc.next();
				System.out.println("가입완료 !!!");
				break;
				
			case 3 : 
				System.out.println("프로그램을 종료합니다");
				System.exit(1);
			default : System.out.println("1~3중에 하나를 입력해주세요");
			}
			
		}
		
		
		
		
		
	}
}
