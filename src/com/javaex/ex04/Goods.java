package com.javaex.ex04;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자 - 메모리에 올린다
		
	
	public Goods() {} // 자리차지해서 올리거나 코드 없으면{}붙혀서 
	

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Goods(String name) {
		this.name = name;
	}

	/*
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	
	}
	
	public Goods(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	} 
	*/
	
	//메소드 getter / setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price; //this.price로 해도 되지만 헷갈릴게 없어서 생략가능
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//메소드 - 일반메소드
	
	public void showInfo() {
		System.out.println("상품명: "+name + ", 가격: " + price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}