package day06_while;

import java.util.Scanner;

public class Ex06_equals {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("첫 문자 입력");
		n1 = input.next();
		System.out.println("두 문자 입력");
		n2 = input.next();
		System.out.println("n1 길이 : " + n1.length());
		System.out.println("n2 길이 : " + n2.length());
		System.out.println("n1 == n2 : " + (n1 == n2));			//같은문자열을 입력해도 false라고 뜬다
		System.out.println("n1.equals(n2) : " + n1.equals(n2));	//문자열은 이런 방식으로 비교
		System.out.println("n2.equals(n1) : " + n2.equals(n1));
		
		String str = null;	//null값을 가지고있는 변수는 .을 이용할수없다(에러발생)
		//System.out.println(str.equals(n1));		//에러발생
		System.out.println(n1.equals(str));			//가능
		
	}
}
