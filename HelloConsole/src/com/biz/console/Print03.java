package com.biz.console;

public class Print03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자 char, character
		//1개의 영문자, 숫자, 특수문자를 저장하거나, 통신(인터넷 포함)을 통해 전달하고자 할 때 사용하는 것으로 모든 정보를 한개의 1byte(8bit) 공간에서 처리할 수 있다.
		System.out.println('A');
		System.out.println('0');
		System.out.println(' ');
		
		// (int)'A' : 문자 A의 ASCII(아스키코드)의 코드 값을 보여달라
		// (int)'0' : 문자 0의 ASCII(아스키코드)의 코드 값을 보여달라
		// (int)' ' : space 문자의 ASCII(아스키코드)의 코드 값을 보여달라
		System.out.println((int)'A');
		System.out.println((int)'0');
		System.out.println((int)' ');
		System.out.println((int)'a');
		System.out.println((int)'*');
		System.out.println((int)'"');
		System.out.println((int)'헐');
		System.out.println((int)'\'');
		// '(작은 따음표)의 경우 '''이렇게 작성하면 컴퓨터가 어떠한 것을 문자로 인식할 지를 모르기 떄문에 \를 넣어서 \다음의 '가 문자라고 지정해주는 것임.
		System.out.println((int)'1');

	}

}
