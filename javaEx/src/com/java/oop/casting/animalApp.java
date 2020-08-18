package com.java.oop.casting;

public class animalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog("������");
		dog1.eat();
		dog1.walk();
		dog1.bark();
		
		Animal dog2 = new Dog("�α�");
		dog2.eat();
		dog2.walk();
		//dog2.bark(); ���� �Ұ�
		((Dog)dog2).bark();
		
		Dog pet= new Dog("����");
		pet.eat();
		pet.walk();
		//pet = new Cat("�����");  // pet �� ���������� ����̷� ��ü�� ���� �Ұ�

		Animal pet2= new Dog("����");
		pet2 = new Cat("�����");
		pet2.eat();
		pet2.walk();
		
		//((Dog)pet2).bark(); //runtime error �߻�   : ����̿��� ���� ����
		System.out.println(""+(pet2 instanceof Dog));
		if(pet2 instanceof Dog) { // instanceof �����ڷ� Ȯ���ؼ� ��� ���
			((Dog)pet2).bark(); 
		}
		else {
			((Cat)pet2).meow(); 
		}
		
		
	}

}
