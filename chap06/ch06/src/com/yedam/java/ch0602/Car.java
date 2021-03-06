package com.yedam.java.ch0602;

public class Car {

	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	// 기본 생성자
	Car() {
	}

	Car(String color) {
//		this.color = color; // this>>생성된 인스턴스의 필드
		this("그랜저", color, 350); // 생성자 this()
	}

//	Car(String model) {                       // 매개변수의 갯수나 타입이 같으면 오버로딩이 안됨.
//		this.model = model;
//	}

	Car(String model, String color) {
//		this.color = color;
//		this.model = model;
		this(model, color, 350);
	}

	Car(String model, String color, int maxSpeed) {
		this.color = color;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

}
