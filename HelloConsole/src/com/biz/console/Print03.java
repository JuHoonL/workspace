package com.biz.console;

public class Print03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� char, character
		//1���� ������, ����, Ư�����ڸ� �����ϰų�, ���(���ͳ� ����)�� ���� �����ϰ��� �� �� ����ϴ� ������ ��� ������ �Ѱ��� 1byte(8bit) �������� ó���� �� �ִ�.
		System.out.println('A');
		System.out.println('0');
		System.out.println(' ');
		
		// (int)'A' : ���� A�� ASCII(�ƽ�Ű�ڵ�)�� �ڵ� ���� �����޶�
		// (int)'0' : ���� 0�� ASCII(�ƽ�Ű�ڵ�)�� �ڵ� ���� �����޶�
		// (int)' ' : space ������ ASCII(�ƽ�Ű�ڵ�)�� �ڵ� ���� �����޶�
		System.out.println((int)'A');
		System.out.println((int)'0');
		System.out.println((int)' ');
		System.out.println((int)'a');
		System.out.println((int)'*');
		System.out.println((int)'"');
		System.out.println((int)'��');
		System.out.println((int)'\'');
		// '(���� ����ǥ)�� ��� '''�̷��� �ۼ��ϸ� ��ǻ�Ͱ� ��� ���� ���ڷ� �ν��� ���� �𸣱� ������ \�� �־ \������ '�� ���ڶ�� �������ִ� ����.
		System.out.println((int)'1');

	}

}