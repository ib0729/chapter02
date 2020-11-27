package com.javaex.ex05;

public class Point {

   //필드
   private int x;
   private int y;
   
   

   //생성자
   
   
   public Point() {
   
   }



   public Point(int x, int y) {
      
      this.x = x;
      this.y = y;
   }



   public Point(int x) {
      this.x = x;
   }

   
   /* 사용할 수없다 : 자료형으로 구분하기 때문에 위에 x변수랑 중복되서 오류남
   public Point(int y) {
      this.y = y;
   }
   */

   //메소드 getter setter
   public int getX() {
      return x;
   }



   public void setX(int x) {
      this.x = x;
   }



   public int getY() {
      return y;
   }



   public void setY(int y) {
      this.y = y;
   }

   
   
   
   //메소드 일반 메소드 : (사용자 화면 점 복잡한 로직으로 이루어짐)
   public void draw() {
	   System.out.println("점[x="+ x + ", y="+y+"]을 그렸습니다.");
   }
   
   
}