package com.biz.console;

public class Print01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print** 키워드는 일반적으로 무엇인가 정보를 보여주는 용도이다.
		//이는 컴퓨터에서 외부장치(모니터, 프린터등)에 데이터, 정보를 출력하는 키워드이다.
		System.out.println();
		System.out.println("Hello");
		System.out.println(30);
		System.out.println(30+30);
		System.out.println("=======================");
		
		//()를 사용해서 어떤 것을 처리하라고 명령을 내릴 때 ()안에 넣어주는 것들을 argument(s)라고 한다.
		System.out.print("");	// null, Nothing 이라고 표현(아무것도 아님으로)
		System.out.print(30);
		
		// key word 중에는 끝에 ()가 있는 키워드가 있고, 없는 키워드가 있는데 ()가 있는 키워드는 method라고 부른다.
		// 이를 Java외 다른 언어에는 함수, function 이라고 부르기도 한다.
		System.out.print("Hello");
		System.out.print(30+30);
		
		// *.*.println() : argument로 아무것도 주지 않아도 new line을 표시하는 기본 기능을 가지고 있기 때문에 argument를 주지 않아도 오류가 나지 않는다.
		// *.*.print() : argument만을 표시하도록 만들어진 method()이기 때문에 아무것도 아닌 값(null, "")이라도 argument로 넣어주지 않으면 오류가 발생하게 된다.
		
		// println() 과 print()를 사용할 때 예제
		System.out.println();
		System.out.println("30+40=" + (30+40));
		
		System.out.print(30);
		System.out.print("+");
		System.out.print(40);
		System.out.print("=");
		System.out.print(30+40);
		
		System.out.println();
		System.out.print("\n"); 	// \n은 \n 문자열을 표시하라는 의미가 아니고 new line 기호를 보내서 줄바꿈을 하라는 의미이다.
		System.out.println("\n");	// println의 경우 \n을 넣을경우 한칸이 아니고 2칸의 new line이 출력됌
		
		System.out.println("대한\t\t민국\n만세\t만세");	// \t는 tab키를 한번적용해라는 명령어
		System.out.println("\t\t우리나라만세");

	}

}
