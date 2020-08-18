package com.java.oop.casting;

public class animalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog("스누피");
		dog1.eat();
		dog1.walk();
		dog1.bark();
		
		Animal dog2 = new Dog("두기");
		dog2.eat();
		dog2.walk();
		//dog2.bark(); 참조 불가
		((Dog)dog2).bark();
		
		Dog pet= new Dog("아지");
		pet.eat();
		pet.walk();
		//pet = new Cat("아즈라엘");  // pet 을 강아지에서 고양이로 교체시 참조 불가

		Animal pet2= new Dog("아지");
		pet2 = new Cat("아즈라엘");
		pet2.eat();
		pet2.walk();
		
		//((Dog)pet2).bark(); //runtime error 발생   : 고양이에서 펫기능 참조
		System.out.println(""+(pet2 instanceof Dog));
		if(pet2 instanceof Dog) { // instanceof 연산자로 확인해서 기능 사용
			((Dog)pet2).bark(); 
		}
		else {
			((Cat)pet2).meow(); 
		}
		
		
	}

}
