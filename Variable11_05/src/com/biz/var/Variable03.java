package com.biz.var;

public class Variable03 {
	public static void main(String[] args) {
		
		int intNum1 ;
		int intNum2 ;
		
		intNum1 = 30;
		intNum2 = intNum1;	// intNum1�� �� 30�� �о intNum2�� �����϶�. (���簳��)
		
		System.out.println("intNum1: " + intNum1);
		System.out.println("intNum2: " + intNum2);
		
		intNum1 = 50;
		System.out.println("intNum1: " + intNum1); // ��ǻ�ʹ� �̹� �ַܼ� ǥ���� ������ ���ƺ�������. �׷��� ���� intNum1�� 30���� ǥ�� ��.
		System.out.println("intNum2: " + intNum2);
		
		intNum1 = intNum1 + 10 ;
		System.out.println("intNum1: " + intNum1); // ��� ���� �������� ����! �ش� intNum1�� cpu�� ����Ǿ��ִ� ���� +10�� ���ؼ� �ٽ� intNum1���� ������ ǥ���ϰ� ������.
		
		intNum1 = intNum1 + 10 ; // �ش� ���� cpu�� ������ 10�� �ٽ� cpu�� ������ �� ���� +���� �Ͽ� �� ����� �ٽ� intnum1�� ����, ���� ���� ����
		intNum1 = intNum1 + 10 ;
		intNum1 = intNum1 + 10 ; // ����!
		
		System.out.println("Last intNum1: " + intNum1);
	}

}
