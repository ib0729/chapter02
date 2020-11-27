package com.javaex.ex05;

public class PointAPP {

	public static void main(String[] args) {

		//point() 생성자
		//getter setter 사용
		//draw() 점을 그린다.
		//showInfo() 확인
		Point p01 = new Point();
		p01.setX(1);
		p01.setY(5);
		p01.draw();
		
		//생성자 Point(int x, int y)
		//setter 사용하지 않음
		//showInfo() 확인
		Point p02 = new Point(10, 20);
		p02.draw();
		
		//생성자 Point(int x)
		//setY만 사용
		//showInfo() 확인
		Point p03 = new Point(100);
		p03.setY(200);
		p03.draw();
		
		
		
	}

}
