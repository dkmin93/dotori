package day03;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person("hong", 20, 123);
		Person p2 = new Person("kim", 10);
		Person p3 = new Person("park");
		YouJin youjin = new YouJin();
		
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.ssn);
		
		System.out.println("============================================");
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.ssn);
		
		System.out.println("============================================");
		
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.ssn);
		
		System.out.println("============================================");
		
		System.out.println(youjin.name);
		
	}

}
