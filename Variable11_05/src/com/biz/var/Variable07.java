package com.biz.var;

public class Variable07 {
	public static void main(String[] args) {
		// 선행 연산자 : 변수명 앞에 ++, -- 연산자가 먼저 오는경우
		int intNum1 = 0;
		
		++intNum1; // intNum1을 1 증가시켜라
		intNum1 += 1;
		intNum1 = intNum1 + 1;
		
		--intNum1; // intNum1을 1 감소시켜라
		intNum1 -= 1;
		intNum1 = intNum1 - 1;
		
		// 후행 연산자 : 변수명 뒤에 ++, -- 연산자가 나중에 오는 경우
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
		
		intSum = ++intNum1; // 먼저 intNum1을 1 증가 시킨후 증가된 값을 intSum에 누적
		System.out.println(intNum1);
		System.out.println(intSum);
		
		intSum = intNum1++; // 여기서 intNum1의 값 변화는 intSum에 영향을 미치지 않는다.
		
		System.out.println(intNum1);
		System.out.println(intSum);
		
		System.out.println(intNum1);
		System.out.println(intSum);
	}
}
