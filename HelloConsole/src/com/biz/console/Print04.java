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

		// %d�� ,���� ù��° ���ڸ� ������� ���ɾ�
		System.out.printf("%d\n" , 30);
		System.out.printf("%d\n" , 30+40);
		System.out.printf("%d\n" , 30, 40, 30+40);
		System.out.printf("%d + %d\n" , 30, 40, 30+40);
		System.out.printf("%d + %d = %d\n" , 30, 40, 30+40);
		System.out.printf("%d + %d = %d , %d\n" , 10, 30, 40, 30+40); // %d�� ���ں��� , ���� ������ ���� ���ƾ���. ������ ����!
		
		
	}

}