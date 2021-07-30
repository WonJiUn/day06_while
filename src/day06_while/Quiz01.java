package day06_while;

public class Quiz01 {
	public static void main(String[] args) {
		
		//1
		/*int day = 1, cash = 1;
		while(day<30) {
			day++;
			cash*=2;
		}
		System.out.println(day + "일째 금액 : " + cash + "원");
		*/
		
		int won = 0;
		for(int day = 1; day <=30; day++) {
			if(day == 1) {
				won = 1;
			}else {
				won *=2;
			}
		}
		System.out.println("30일째 금액 : " + won);
		
		
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
		System.out.println("합계 : " + sum1);
		
		//전체합과 3의배수의 합 구해서 차감해주는 방식으로도 가능
		
		
		
		/*
		int num2 = 0, sum2 = 0;
		
		while(sum2 < 10000) {
			
			num2++;
			
			if(num2 % 2 != 0) {		//홀수
				sum2 += num2;
			}
			
		}
		System.out.println(sum2);
		System.out.println("마지막 수 : " + (num2-2));
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
