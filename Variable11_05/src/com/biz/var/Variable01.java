package com.biz.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �ڵ�� 30�̶�� ��, 40�̶�� �� �׸��� ����� 70�̶�� ���� java(�Ǵ� ��ǻ��)�� ���Ƿ� ������ ���� ������ �ϰ� 
		// ��� ó���� �˾Ƽ� �Ѵ�.
		System.out.println("30 + 40 = " + (30+40));
		
		System.out.print("30");
		System.out.print(" ");
		System.out.print("+");
		System.out.print(" ");
		System.out.print("40");
		System.out.print(" ");
		System.out.print("=");
		System.out.print(" ");
		System.out.print(30+40);
		System.out.print("\n");
		
		System.out.printf("%d + %d = %d\n", 30, 40, 30+40);
		
		System.out.println();
		// �츮�� ������ ��� ��ҿ� 30, 40�� �����ϰ� �� ����� �츮�� ������ �����ҿ� ���� ���Ѽ� ��Ȱ�� �� ����.
		
		// int(����)�� ������ ��ŭ�� ũ���� ������ 3���� �����ϰڴ�.
		
		int num1 ; // num1 �̶�� �����Ҹ� ����(����)
		int num2 ;
		int num3 ;
		
		// check in 
		num1 = 30;
		// keyword�� �ƴ� � ������ ������ ���۵Ǹ� �߰��� ���� ��� �κп��� =�� ���´�.
		// = �� ������ �켱������ �������� ���� �м�, �����Ѵ�.
		num2 = 40;
		
		num3 = num1 + num2;
		
		System.out.println(num1 +" " + "+" + " " + num2 + " " + "=" + " " + num3);
		System.out.println(num1 +" " + "+" + " " + num2 + " " + "=" + " " + num3);
		System.out.println(num1 +" " + "+" + " " + num2 + " " + "=" + " " + num3);
		
		/*
		 *  ������ ����Ģ
		 	1. ù���ڴ� ���� �ҹ��ڷ� ����.
		 	2. �ι��� ���ʹ� ������ҹ���, ����,  _�� �����ִ�.
		 	3. ���� �̸��� �ǹ� �ִ� �̸����� �ϴ� ���� ����.
		 	4. ������ ������ �ڷ�, �������� ���� ���λ�� ���� �͵� ����.
		 	5. �������� keyword�� ��� �� ������.
		 		=> �� �ܾ� �̻��� �����ϴ� ���� ����. ��> int int; (X)  int intKor; (O)
		 */	
		
		// ���� ���� ����, ���������� ������ ������ ����ٸ�
		int korGrade;
		int engGrade;
		
		// ������ ���λ縦 �־� ���ٸ�
		int intKorGrade;
		int intEngGrade;
		
		int intNum1;
		int intNum2;
		int intNum3;
		
		
		
	}

}
 