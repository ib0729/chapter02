package com.javaex.ex01;

public class Goods {

   
   
   //필드
   private String name;
   private int price;
   
   //생성자   
   
   
   //메소드-겟터/세터   
   
   
   //메소드-일반
   //setName() 이름 등록
   public void setName(String n) {
      name = n; //"니콘" "LG그램" "머그컵"
   }
   
   //getName() 이름 읽기
   public String getName() {
      return name;
   }
   
   //setPrice() 가격 등록 (입력)
   public void setPrice(int p) {
      price = p;
   }
   
   //getPrice()가격 읽기
   public int getPrice() {
   
      return price;
      }
   
   public void showInfo() {
      
      System.out.println("상품명: " + name + ", 가격: " + price);
   }
   
   /*
   //name 등록하는 기능
   public void setName(String n) {
      name = n; //"니콘" "LG그램" "머그컵"
     
   }
   */
   
   //name 읽어주는 기능
   //price 등록하는 기능
   //price 읽어주는 기능
   
   
}