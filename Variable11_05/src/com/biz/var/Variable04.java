package com.biz.var;

public class Variable04 {

	public static void main(String[] args) {
		
		int intNum1; // ���� �����
		intNum1 = 0; // �ʱ�ȭ, clear

		int intNum2;
		intNum2 = 0; // clear������ ������ �� �� ����
		System.out.println(intNum2);
		intNum2 = 30;
		System.out.println(intNum2);
		
		int intNum3 = 50; // ����, clear, ������ �ѹ������� ����
		
		System.out.println(intNum3);
		
		/*
		 *	���� �� ������ �������� �õ��ϸ� �ʱ�ȭ(init) ������ �߻��Ѵ�. <�ʱ�ȭ = ���� clear �ϴ� ��> 
		 *	int intNum4;(X)	==>		int intNum4 = 0;(O)
		 	System.out.println(intNum4); // �ش� ������ �ʱ�ȭ�� �Ǿ����� �ʾƼ� ���� �߻�
		*/
	}

}
