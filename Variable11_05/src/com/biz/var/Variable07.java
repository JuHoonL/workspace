package com.biz.var;

public class Variable07 {
	public static void main(String[] args) {
		// ���� ������ : ������ �տ� ++, -- �����ڰ� ���� ���°��
		int intNum1 = 0;
		
		++intNum1; // intNum1�� 1 �������Ѷ�
		intNum1 += 1;
		intNum1 = intNum1 + 1;
		
		--intNum1; // intNum1�� 1 ���ҽ��Ѷ�
		intNum1 -= 1;
		intNum1 = intNum1 - 1;
		
		// ���� ������ : ������ �ڿ� ++, -- �����ڰ� ���߿� ���� ���
		intNum1++;
		intNum1 += 1;
		intNum1 = intNum1 + 1;
		
		intNum1--;
		intNum1 -= 1;
		intNum1 = intNum1 - 1;
		
		int intSum = 0;
		intNum1 = 0;
		
		intNum1 += 1;
		intSum += intNum1;  // intSum = 1
		
		intSum += ++intNum1;
		// num1 = 2, sum = 3
		
		System.out.println("intNum1 : " + intNum1);
		System.out.println("intSum : " + intSum);
		
		intSum += intNum1++;
		System.out.println("intNum1 : " + intNum1);
		System.out.println("intSum : " + intSum);
		
		intSum = ++intNum1;
		intNum1 += 1;
		intSum = intNum1;
		
		intSum = intNum1++;
		intSum = intNum1;
		intNum1 += 1;
		
		intNum1 = 0;
		System.out.println(++intNum1);
		System.out.println(++intNum1);
		System.out.println(++intNum1);
		
		System.out.println(intNum1++);
		System.out.println(intNum1);
		System.out.println();
		
		intSum = ++intNum1; // ���� intNum1�� 1 ���� ��Ų�� ������ ���� intSum�� ����
		System.out.println(intNum1);
		System.out.println(intSum);
		
		intSum = intNum1++; // ���⼭ intNum1�� �� ��ȭ�� intSum�� ������ ��ġ�� �ʴ´�.
		
		System.out.println(intNum1);
		System.out.println(intSum);
		
		System.out.println(intNum1);
		System.out.println(intSum);
	}
}