package day04;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p.getAge()); //멤버변수 초기값 10 출력
		p.setAge(20);
		System.out.println(p.getAge()); //세터로 입력한 20 출력
		
		
		
		
	}

}
