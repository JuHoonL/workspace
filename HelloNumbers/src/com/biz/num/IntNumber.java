/*
 * package는 폴더의 개념을 자바 프로젝트에서 쉽게 구분하기 위한 것이다.
 * 여기의 IntNumber.java 소스코드는 프로젝트 폴더에 src폴더 아래의 com/biz/num 폴더에 있음을 나타내느 이정표역할을 한다.
 */

package com.biz.num;

public class IntNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(3000*3000);	//9 곱하기 10의 6승
		System.out.println(30000*30000); 	//9 곱하기 10의 8승
		System.out.println(300000*300000); 	
		/*
		 * 9 곱하기 10의 10승 -> 숫자가 너무 크면 컴퓨터가 계산을 안함 
		 * over flow 발생 : Java 개발자가 표시할수있는 숫자의 범위를 제한해둬서 제한된 범위 밖의 숫자는 예상외의 숫자로 표시함
		 */
		System.out.println(333333333*3); //2147483647까지만 표시
		
	}

}
