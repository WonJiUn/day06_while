package day06_while;

public class Quiz01 {
	public static void main(String[] args) {
		
		//1
		/*int day = 1, cash = 1;
		while(day<30) {
			day++;
			cash*=2;
		}
		System.out.println(day + "��° �ݾ� : " + cash + "��");
		*/
		
		int won = 0;
		for(int day = 1; day <=30; day++) {
			if(day == 1) {
				won = 1;
			}else {
				won *=2;
			}
		}
		System.out.println("30��° �ݾ� : " + won);
		
		
		//2
		/*
		int num = 0; 
		int sum = 0;
		
		while(num <= 1000) {
			num++;
			
			if(num%3 == 0 && num%5 != 0) {
				continue;
			}
			sum += num;
			
		}
		
		System.out.println("sum : " + sum);
		*/
		
		int sum1 = 0;
		
		
		for(int num1 = 1;num1<=1000;num1++) {
			if(num1%3 == 0 && num1%5 != 0) {
				continue;
			}
			sum1 += num1;
		}
		System.out.println("�հ� : " + sum1);
		
		//��ü�հ� 3�ǹ���� �� ���ؼ� �������ִ� ������ε� ����
		
		
		
		/*
		int num2 = 0, sum2 = 0;
		
		while(sum2 < 10000) {
			
			num2++;
			
			if(num2 % 2 != 0) {		//Ȧ��
				sum2 += num2;
			}
			
		}
		System.out.println(sum2);
		System.out.println("������ �� : " + (num2-2));
		*/
		
		int i = 1, sum = 0;
		
		for(; sum < 10000;i++) {
			if(i%2 == 1) {
				sum += i;
			}
			//System.out.println(i + " : " + sum);
		}
		i--;
		System.out.println(i + " : " + sum);
		
		
		
		
	}
}
