package day06_while;

import java.util.Scanner;

public class Ex06_equals {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("ù ���� �Է�");
		n1 = input.next();
		System.out.println("�� ���� �Է�");
		n2 = input.next();
		System.out.println("n1 ���� : " + n1.length());
		System.out.println("n2 ���� : " + n2.length());
		System.out.println("n1 == n2 : " + (n1 == n2));			//�������ڿ��� �Է��ص� false��� ���
		System.out.println("n1.equals(n2) : " + n1.equals(n2));	//���ڿ��� �̷� ������� ��
		System.out.println("n2.equals(n1) : " + n2.equals(n1));
		
		String str = null;	//null���� �������ִ� ������ .�� �̿��Ҽ�����(�����߻�)
		//System.out.println(str.equals(n1));		//�����߻�
		System.out.println(n1.equals(str));			//����
		
	}
}
