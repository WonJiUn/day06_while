package day06_while;

import java.util.Scanner;

public class Quiz04_3 {
	public static void main(String[] args) {
		
		/*
		 * ���ڸ� �Է¹ް� �� ���� ������ �������� ����Ͻÿ�. 
		 * �������� ������ �ڱ� �ڽ��� ������ ��� ���� ������� ���� �ڱ� �ڽ��� �Ǵ� �ڿ��� �Դϴ�.
		 * �� �����ڸ� 10000������ �������� 6,28,496,8128�� �ֽ��ϴ�
		 */
		Scanner sc = new Scanner(System.in);
		
		int a, num;
		int sum = 0;
		
		System.out.print("�����Է� : ");
		num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			a = i;
			for(int j = 1; j<=i; j++) {
				if(a%j == 0) {
					sum += j;
				}
			}
			if((sum-i) == i) {
				System.out.print(i + " ");
			}
			sum = 0;
		}
		
		
		
		
		
		
		
		
		
		
		
	
	}
}