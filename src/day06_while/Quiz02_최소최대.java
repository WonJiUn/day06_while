package day06_while;

import java.util.Scanner;

public class Quiz02_�ּ��ִ� {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, max = 0, min = 0, i = 2;
		System.out.print("���� �ΰ� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		while(i<=num1 && i<=num2) {
			if(num1%i == 0 && num2%i == 0) {
				min=i;
			}
			i++;
		}
		
		max = num1 * num2 / min;
		System.out.println("�ּҰ���� : " + max);
		System.out.println("�ִ����� : " + min);
		
		
		
	}
}
