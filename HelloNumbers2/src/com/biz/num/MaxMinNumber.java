package com.biz.num;

public class MaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� ��Ŀ� ���� ����ü �󸶳� ���� ������ �󸶳� ū ������ ǥ�� �Ǵ� ���� �� �� �ִ°�?
		// ����  : Int(Integer)
		System.out.println(Integer.MIN_VALUE);
		/*
		 * ù���ڰ� �ҹ����� Ű������ ��� ������ �������� ����
		 * ù���ڰ� �빮���� Ű������ ��� .�� �������� ����
		 */
		
		System.out.println(20);
		/*
		 * Java�� key word(���ɾ�)�� �����Ͽ� ���ɹ��� �ۼ��ϴ� 2���� ū ��Ģ]
		  	1. ù���ڰ� �ҹ����� ��� Ű������� ����( )���� �����Ͽ� �����Ѵ�. �����ϴ� Ű������� ������Ģ�� ������ Ű���帶�� �����ϴ� ����� �ٸ���
		  	2. ù���ڰ� �빮���� ��� Ű������� ��ħǥ(.)�� �����Ͽ� �����Ѵ�. �����ϴ� Ű������� ������Ģ�� ������ ù��° Ű���� ������ �̾ ������ Ű����� ������ Ű����� �߿� �����ؾ� �Ѵ�.
		  	      Ű������ �����Ǵ� ������ ���� 2�� �̻��̴�.
		 * ��Ŭ���������� assist����� �־ ù��° Ű���带 �Է��� �� ��ħǥ(.)�� ������ ������ ����� �� �ִ� Ű������� �����Ͽ� �����ְ� ������ �� �ֵ��� �����ش�.
		 */
		
		System.out.println(Integer.MAX_VALUE);
		
		// ���� �� 8byte ũ��� long, Long
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		//�Ǽ� float, Float
		//�Ҽ������� 15~17�ڸ� �������� ǥ��
		System.out.println(Float.MIN_VALUE);	//
		System.out.println(Float.MAX_VALUE);
		
		//���е��� �� ���� �Ǽ� double, Double
		//�Ҽ��� ���� 15~17�ڸ� �������� ǥ��
		System.out.println(Double.MIN_VALUE);	//49x(10��-324��)
		System.out.println(Double.MAX_VALUE);
	}

}