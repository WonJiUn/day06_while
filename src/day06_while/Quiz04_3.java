package day06_while;

import java.util.Scanner;

public class Quiz04_3 {
	public static void main(String[] args) {
		
		/*
		 * 숫자를 입력받고 그 숫자 이하의 완전수를 출력하시오. 
		 * 완전수의 조건은 자기 자신을 제외한 모든 양의 약수들의 합이 자기 자신이 되는 자연수 입니다.
		 * 덧 붙이자면 10000이하의 완전수는 6,28,496,8128이 있습니다
		 */
		Scanner sc = new Scanner(System.in);
		
		int a, num;
		int sum = 0;
		
		System.out.print("숫자입력 : ");
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