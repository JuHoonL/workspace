package com.biz.var;

public class Variable06 {

	public static void main(String[] args) {

		int intNum1 = 0;
		int intSum = 0;
		
		intNum1 = intNum1 + 1;
		intNum1 += 1; // Num1�� ���� 2�� ��.
		intSum += intNum1; // intSum = intSum + intNum1�� ����
		 
		intNum1 += 1;
		intSum += intNum1;
		 
		// Ư���� += 1 �϶��� 
		intNum1 ++;
		intSum += intNum1;
		 
		intNum1 ++;
		intSum += intNum1;
		 
		// ���� �տ� ++�� �տ� ���°�� ++�� ���� ���� ������.
		++intNum1;
		intSum += intNum1;
		 
		intSum += ++intNum1; // intSum + (intNum1+1); �� ����
		 
		intSum += ++intNum1;
		System.out.println(intSum);
		
		//��
		intSum += intNum1++;
		// ���� = ������ ���� �ڿ� ++�� ������ ������ ������ �ٷ� ������ ���� = ���� + 1�� �����Ѵ�.
	}

}
