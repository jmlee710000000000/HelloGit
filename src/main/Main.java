package main;

import calc.Calculator;

public class Main {

	public static void main(String[] args) {
		System.out.println("로컬 저장소 사용");
		System.out.println("원격저장소 사용가능");
		System.out.println("원격저장소 사용가능2");
		System.out.println("팀장 코드 시작입니다.");
		System.out.println("팀장 코드 마지막 입니다.");
		

		System.out.println("팀장 새코드시작");
		System.out.println("팀장 새코드끝");

		System.out.println("팀원 코드1 입니다.");
		System.out.println("팀원 코드2 입니다.");
		System.out.println("팀원 코드3 입니다.");
		
		Calculator cal =new Calculator();
		int addresult =cal.add(1, 2);
System.out.println(addresult);
	}

}
