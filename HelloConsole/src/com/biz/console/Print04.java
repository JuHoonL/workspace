package com.biz.console;

public class Print04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Hello");
		System.out.printf("" , 30);
		System.out.printf("" , 30+40);
		System.out.printf("" , 30, 40, 30+40);
		System.out.printf("");
		
		System.out.println("==============================");

		// %d는 ,뒤의 첫번째 문자를 보여라는 명령어
		System.out.printf("%d\n" , 30);
		System.out.printf("%d\n" , 30+40);
		System.out.printf("%d\n" , 30, 40, 30+40);
		System.out.printf("%d + %d\n" , 30, 40, 30+40);
		System.out.printf("%d + %d = %d\n" , 30, 40, 30+40);
		System.out.printf("%d + %d = %d , %d\n" , 10, 30, 40, 30+40); // %d의 숫자보다 , 뒤의 문자의 수가 많아야함. 없으면 오류!
		
		
	}

}
