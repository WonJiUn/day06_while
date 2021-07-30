package day06_while;

import java.util.Scanner;

public class Quiz02_최소최대 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, max = 0, min = 0, i = 2;
		System.out.print("숫자 두개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		while(i<=num1 && i<=num2) {
			if(num1%i == 0 && num2%i == 0) {
				min=i;
			}
			i++;
		}
		
		max = num1 * num2 / min;
		System.out.println("최소공배수 : " + max);
		System.out.println("최대공약수 : " + min);
		
		
		
	}
}
