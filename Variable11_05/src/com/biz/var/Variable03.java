package com.biz.var;

public class Variable03 {
	public static void main(String[] args) {
		
		int intNum1 ;
		int intNum2 ;
		
		intNum1 = 30;
		intNum2 = intNum1;	// intNum1의 값 30을 읽어서 intNum2에 저장하라. (복사개념)
		
		System.out.println("intNum1: " + intNum1);
		System.out.println("intNum2: " + intNum2);
		
		intNum1 = 50;
		System.out.println("intNum1: " + intNum1); // 컴퓨터는 이미 콘솔로 표시한 내용은 돌아보지않음. 그래서 위의 intNum1은 30으로 표시 됌.
		System.out.println("intNum2: " + intNum2);
		
		intNum1 = intNum1 + 10 ;
		System.out.println("intNum1: " + intNum1); // 모든 식은 오른쪽이 먼저! 해당 intNum1의 cpu에 저장되어있는 값에 +10을 더해서 다시 intNum1으로 보내서 표시하고 저장함.
		
		intNum1 = intNum1 + 10 ; // 해당 값을 cpu로 보내고 10을 다시 cpu에 보내고 두 값을 +연산 하여 그 결과를 다시 intnum1에 저장, 증가 누적 개념
		intNum1 = intNum1 + 10 ;
		intNum1 = intNum1 + 10 ; // 누적!
		
		System.out.println("Last intNum1: " + intNum1);
	}

}
