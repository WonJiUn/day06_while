package day06_while;

public class Quiz02_¡„Ω“ {
	public static void main(String[] args) {
		
		int rice = 100000;
		int mouse = 2;
		int day = 0;
		
		/*
		while(true) {
			day++;
			
			if(rice > 0) {
				rice = rice-(mouse*20);
			}
			else
				break;
			
			if(day % 10 == 0) {
				mouse = mouse*2;
			}
		}
		day--;
		System.out.println("day : " + day);
		System.out.println("¡„ : " + mouse + "∏∂∏Æ");
		*/
		
		
		
		for(day = 1; rice >0;day++) {
			rice -= mouse*20;
			if(day%10==0) {
				mouse *= 2;
			}
			//System.out.println(day + " : " + mouse);
		}
		day--;
		System.out.println("day : " + day);
		System.out.println("¡„ : " + mouse + "∏∂∏Æ");
		
	}
}
