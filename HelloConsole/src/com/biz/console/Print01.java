package com.biz.console;

public class Print01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print** Ű����� �Ϲ������� �����ΰ� ������ �����ִ� �뵵�̴�.
		//�̴� ��ǻ�Ϳ��� �ܺ���ġ(�����, �����͵�)�� ������, ������ ����ϴ� Ű�����̴�.
		System.out.println();
		System.out.println("Hello");
		System.out.println(30);
		System.out.println(30+30);
		System.out.println("=======================");
		
		//()�� ����ؼ� � ���� ó���϶�� ������ ���� �� ()�ȿ� �־��ִ� �͵��� argument(s)��� �Ѵ�.
		System.out.print("");	// null, Nothing �̶�� ǥ��(�ƹ��͵� �ƴ�����)
		System.out.print(30);
		
		// key word �߿��� ���� ()�� �ִ� Ű���尡 �ְ�, ���� Ű���尡 �ִµ� ()�� �ִ� Ű����� method��� �θ���.
		// �̸� Java�� �ٸ� ���� �Լ�, function �̶�� �θ��⵵ �Ѵ�.
		System.out.print("Hello");
		System.out.print(30+30);
		
		// *.*.println() : argument�� �ƹ��͵� ���� �ʾƵ� new line�� ǥ���ϴ� �⺻ ����� ������ �ֱ� ������ argument�� ���� �ʾƵ� ������ ���� �ʴ´�.
		// *.*.print() : argument���� ǥ���ϵ��� ������� method()�̱� ������ �ƹ��͵� �ƴ� ��(null, "")�̶� argument�� �־����� ������ ������ �߻��ϰ� �ȴ�.
		
		// println() �� print()�� ����� �� ����
		System.out.println();
		System.out.println("30+40=" + (30+40));
		
		System.out.print(30);
		System.out.print("+");
		System.out.print(40);
		System.out.print("=");
		System.out.print(30+40);
		
		System.out.println();
		System.out.print("\n"); 	// \n�� \n ���ڿ��� ǥ���϶�� �ǹ̰� �ƴϰ� new line ��ȣ�� ������ �ٹٲ��� �϶�� �ǹ��̴�.
		System.out.println("\n");	// println�� ��� \n�� ������� ��ĭ�� �ƴϰ� 2ĭ�� new line�� ���
		
		System.out.println("����\t\t�α�\n����\t����");	// \t�� tabŰ�� �ѹ������ض�� ���ɾ�
		System.out.println("\t\t�츮���󸸼�");

	}

}