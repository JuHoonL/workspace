
//코드를 작성할때
//단어와 단어들을 나열하여 문장을 만들고
//문장들이 어울려서 어떤 기능 또는 결과를 만들어 낸다
//슬래시(/) 두개가 연속으로 시작되는 문장은 빈줄과 같이 인식 -> comment, 주석, 참고사항 (/* */도 있음)
 

public class HelloWorld01 {

	public static void main(String[] args) {

		/* 
		 만약 단어와 단어 사이을 띄어쓰기를 한칸이상 하지 않거나
		 _를 넣거나 숫자를 넣으면 그것은 정상적인 코드가 아니기 떄문에 요류를 표시한다.
		void main : 정상적인 문법
		void_main : 오류 >> 한단어로서 인식
		void2main : 오류 >> 한단어로서 인식
		static 2void : 2void라는 단어로 void 코드로 인식 안됌
		단 _test : 의미는 모르지만 단어로 생각함 (오류x)]
		*/
		// 별표(*)는 많다라는 것으로 인식 , 한줄을 지우려 할떄는 커서를 해당 줄에 놓고 ctrl+d, 실행취소 ctrl+z,
		// 특별히 빈칸으로 구분되지 않는 문장은 단어와 단어사이에 마침표(.)를 포함해서 단어와 단어를 구별한다.
		

		System.out.println(30*40);						//숫자 30과 40을 곱해서 결과를 보여준다.
		System.out.println();							//아무것도 보여주는 것 없이 줄바꿈만 
		//큰 따음표로 묶인 것은 무엇이든지 모두 문자열 (String)이라고 하고, 문자열은 보이는 그대로 이다.
		System.out.println("Hello");					//Hello라는 글자를 보여주기
		System.out.println("I am Tom");					//I am TOm이라는 글자를 보여주기
		System.out.println("30+40");					//30+40 이라는 글자를 보여주기
														//문자열들을 덧셈(연산)하면 문자열들을 서로 순서대로 연결하여 1개의 문자열로 만들어라 그리고 그 문자열을 보여달라
		System.out.println("Republic"+"of"+"Korea");
		System.out.println("Republic "+"of "+"Korea");
		//30과 40을 덧셈한 후 마치 "30+40="+"70" 한 결과처럼 보여라
		System.out.println("30+40="+(30+40));
		//"30+40="+"30"을 만들고 "30+40=30"+"40"을 만들어서 보여라
		System.out.println("30+40="+30+40);
		

	}

}
