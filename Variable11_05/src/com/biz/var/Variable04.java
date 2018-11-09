package com.biz.var;

public class Variable04 {

	public static void main(String[] args) {
		
		int intNum1; // 변수 선언부
		intNum1 = 0; // 초기화, clear

		int intNum2;
		intNum2 = 0; // clear과정이 생략된 것 과 같다
		System.out.println(intNum2);
		intNum2 = 30;
		System.out.println(intNum2);
		
		int intNum3 = 50; // 선언, clear, 저장을 한문장으로 압축
		
		System.out.println(intNum3);
		
		/*
		 *	선언만 된 변수를 읽으려고 시도하면 초기화(init) 오류가 발생한다. <초기화 = 값을 clear 하는 것> 
		 *	int intNum4;(X)	==>		int intNum4 = 0;(O)
		 	System.out.println(intNum4); // 해당 공간의 초기화가 되어있지 않아서 오류 발생
		*/
	}

}
