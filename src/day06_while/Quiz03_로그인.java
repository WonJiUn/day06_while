package day06_while;

import java.util.Scanner;

public class Quiz03_�α��� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String id = null;
		String pw = null;
		int select;
		
		for(;;) {
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ������");
			System.out.print(">>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1 : 
				System.out.print("���̵� �Է� : ");
				String input_id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String input_pw = sc.next();
				if(input_id.equals(id) && input_pw.equals(pw)) {
					System.out.println("���� ���� !!!");
					break;
				}
				else {
					System.out.println("���� ���� !!!");
					break;
				}
				
			case 2 : 
				System.out.print("������ ���̵� �Է� : ");
				id = sc.next();
				System.out.print("������ ��й�ȣ �Է� : ");
				pw = sc.next();
				System.out.println("���ԿϷ� !!!");
				break;
				
			case 3 : 
				System.out.println("���α׷��� �����մϴ�");
				System.exit(1);
			default : System.out.println("1~3�߿� �ϳ��� �Է����ּ���");
			}
			
		}
		
		
		
		
		
	}
}
