package day01;

public class Example03 {

	public static void main(String[] args) {

		//향상된 for문은 배열, 리스트 타입에만 사용 가능하다.
		//소괄호 안에 (변수:배열의 이름)

		String[] arr = {"a","b","c","d","e"};

		for(String s : arr) { 
			System.out.println(s); // String 타입의 배열이고 이름이 arr인 배열에서 
		}						   // String 타입의 변수로 설정한 s를 전부 출력한다
		
		//이름, 나이, 성별, 주소, 전화번호
		
		Student s1 = new Student();
		s1.name = "손유경";
		
		Student s2 = new Student();
		s2.name = "강유진";
		
		Student[] student = {s1, s2}; //Student타입이고 이름이 student인 배열을 생성하고 s1,s2를 저장
		
		for(Student s : student) {
			System.out.println(s.name);
		}
		
		
	
	
		
		
		
		
}
	
}
