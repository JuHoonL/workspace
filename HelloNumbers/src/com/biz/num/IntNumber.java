/*
 * package�� ������ ������ �ڹ� ������Ʈ���� ���� �����ϱ� ���� ���̴�.
 * ������ IntNumber.java �ҽ��ڵ�� ������Ʈ ������ src���� �Ʒ��� com/biz/num ������ ������ ��Ÿ���� ����ǥ������ �Ѵ�.
 */

package com.biz.num;

public class IntNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(3000*3000);	//9 ���ϱ� 10�� 6��
		System.out.println(30000*30000); 	//9 ���ϱ� 10�� 8��
		System.out.println(300000*300000); 	
		/*
		 * 9 ���ϱ� 10�� 10�� -> ���ڰ� �ʹ� ũ�� ��ǻ�Ͱ� ����� ���� 
		 * over flow �߻� : Java �����ڰ� ǥ���Ҽ��ִ� ������ ������ �����صּ� ���ѵ� ���� ���� ���ڴ� ������� ���ڷ� ǥ����
		 */
		System.out.println(333333333*3); //2147483647������ ǥ��
		
	}

}
