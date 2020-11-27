package com.javaex.ex01;

public class GoodsApp {

   public static void main(String[] args) {
      // 
      
      //카메라
      Goods camera = new Goods();
      
      /*
      //캡술화 때문에 사용 불가
      camera.name = "니콘";
      camera.price = 400000;
      
      System.out.println(camera.name);
      System.out.println(camera.price);
      */
      
      camera.setName("니콘");
      String cameraName = camera.getName();
      //System.out.println(name);
      

      camera.setPrice(400000);
      int cameraPrice = camera.getPrice();
      //System.out.println(price);
      
      camera.showInfo();
      
      //System.out.println("상품이름: " + cameraName +  ", 가격: " + cameraPrice);
      
      
      //노트북
      
      
      Goods computer = new Goods();
      
      computer.setName("LG그램");
      String computerName = computer.getName();
      //System.out.println(computerName);
      
      
      computer.setPrice(1000000);
      int computerPrice = computer.getPrice();
      //System.out.println(computerPrice);
     
      computer.showInfo();
      //System.out.println("상품이름: " + computerName + ", 가격: " + computerPrice);
      
      
      /*
      Goods cup = new Goods();
      cup.setName = "머그컵";
      cup.cupPrice = 2000;
      
      System.out.println(cupName);
      System.out.println(cupPrice);
      
      camera.price = 450000;
      System.out.println(camera.name);
      System.out.println(camera.price);
      */
   }

}