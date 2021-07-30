package day06_while;

public class Quiz02_4©м6 {
	public static void main(String[] args) {
		
		int i;
		int sum = 0;
		
		for(i = 1; i <= 1000; i++) {
			
			if(i%4 == 1 && i%6 == 1) {
				sum += i;
				
			}
		}
		
		System.out.println("гу╟Х : " + sum);
		
		
		
		
	}
}
