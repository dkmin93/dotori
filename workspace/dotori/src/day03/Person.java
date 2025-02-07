package day03;

public class Person {
	
	//this() - 생성자 연결
	public String name;
	public int age;
	public int ssn;
	
	
	public Person(String name, int age, int ssn) {
		super(); //생략
		this.name = name.toUpperCase();
		this.age = age + 1;
		this.ssn = ssn;
		
	}
	
	public Person(String name, int age) {
		this(name, age, 0); //위의 생성자를 기본으로 하기 위해 매개변수의 갯수를 위의 생성자와 동일하게 맞춤
	}
	
	public Person(String name) {
		this(name, 0, 0); //위의 생성자를 기본으로 하기 위해 매개변수의 갯수를 위의 생성자와 동일하게 맞춤
	}

}
