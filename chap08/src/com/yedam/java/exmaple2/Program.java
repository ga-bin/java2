package com.yedam.java.exmaple2;

public interface Program {
	// 메뉴출력
	public void menuPrint();
	// 정보 입력
	public void inputInfo(Access access);
	
	// 입력된 전체정보를 출력
	public void printAllInfo(Access access);
	// 특정 조건의 정보를 출력
	public void printInfo(Access access);
	// 분석
	
	public void printRepot(Access access);
}
