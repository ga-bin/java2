package com.yedam.java.ch1601;

public class Comment {
/*- 람다식 문법
 * 익명객체를 구현하는 방식
 * (타입 매개변수, ...) => { 실행문; }
 *	예를 들어,
 *	Interface value = (int a) -> { System.out.println(a); } - 실행하는 부분이 아니라 선언하는 부분이다.
 *	매개변수를 사용해서 하나의 함수(메소드)를 정의하는 것
 *	람다식으로 정의? 혹은 실행? 할때 객체가 생성된다.
 *	함수는 정의하는 부분과 호출하는 부분이 따로 존재하기 떄문에 메소드를 호출하는 부분이 필요하다.
 *	호출하려면 메소드에 대한 이름이 필요하고 이는 인터페이스 타입으로 정의하는 경우가 많다.
 *	람다식을 구현하기 위한 인터페이스는 몇가지 조건이 필요하다
 *	1. 반드시 하나의 (추상)메소드만 포함하고 있어야 한다.
 *	2. 람다식에 대해 하나를 정의하는 형태로 구현
 *	원래는 객체지향 프로그래밍이 함수형 프로그래밍이 맞지 않는개념, 자바가 자신의 목적에 의해
 *	객체지향프로그램안에서 함수형 프로그래밍이 가능하도록 하는 것
 *	원래는 람다식으로 만들었을 때 함수만 정의하는것이 함수형프로그래밍의 원칙인데,
 *	자바는 객체지향이기 때문에 함수형 프로그래밍을 쓸려고 함수를 정의했을 때 객체를 생성하게됨
 *	그래서 이 객체는 어쩔 수 없이 하나의 메소드를 포함하고 있을 수 밖에 없다.
 *	(인터페이스가 하나의 메소드만 포함하고 있어야 하는 기유)
 *	생성된 객체에 여러가지 메소드가 있게 되면 람다식으로 함수를 선언하는 경우 그 함수가 어떤
 *	메소드를 구현하는 것인지 알 수 없다. 
 *	내가 실행하고자 하는 것을 미리 정의하는 것
 *	
 *	람다식을 이용하면 메소드에 대해서 간단하게 정의하는데는 좋으나, 당연히 필드 추가하거나 여러 메소드를 가지고
 *	연산을 하는 것은 힘들다.
 *	자바의 기존 문법으로 충분히 구현이 가능하지만 코드상으로 훨씬 간단하게 처리할 수 있기 때문에
 *	함수 프로그래밍 부분을 받아들인 것
 *
 *	메소드 시그니처따라서 람다로 표현하는 방식 다름(RamdaTest)
 *
 * 변수를 final로하거나 인터페이스를 static으로 해야한다.
	그래서 굳이 추상클래스가 아니라 인터페이스로 선언한다
	인터페이스는 원리 static final로 상수를 선언하니까
	람다식은 호출할때마다 새로운 스레드가 생기고, 그 스레드의 객체 참조값을
	복사해와서 변수에 저장하기 때문에
	변수의 값을 변경하는 경우에는 스레드의 원래 객체에 있던 변수의 값은
	변경되지 않기 때문이다.
			
	인터페이스를 계속 만들어야 함에도 람다식을 사용하는 이유는
	자바에서 제공해주는 인터페이스 자체가 람다식으로 구현하면 편하도록 만든 것이 있기
	때문이다
	예를들어서 compare같은 것.

	스레드를 구현할 때 runnable을 구현한다. runnable은 method가 run밖에
	없으므로 람다식 사용 가능 -> threadtest
	
*/
}
