package day01;

import java.util.Arrays;

public class Example04 {
	
	public static void main(String[] args) {
		
		//문자열 다루기
		//String str = "안녕하세요";
		String str = new String(new char[] {'안','녕','하','세','요'});
		System.out.println(str); //인덱스 번호가 있음
		
		char c = str.charAt(0);
		System.out.println("힌트" + c); //문자열 한글자 자르기
		
		//문자열 길이
		System.out.println("문자열의 길이:" + str.length());
		
		//문자열 찾기
		int r1 = str.indexOf("녕");
		System.out.println("'녕'이 발견된 위치:" + r1);
		int r2 = str.indexOf("찾을값이 없으면");
		System.out.println("찾을값이 없으면:" + r2);
		
		//문자열 바꾸기
		String a = "자바는 어렵다. 유경아 잠 좀 그만자고, 나 자바바라";
		
		String r3 = a.replace("자바", "java"); //타겟, 바꿀문자
		System.out.println(r3);
		//원본문자열은?
		System.out.println(a); //원본 문자열은 그대로
		
		//앞뒤공백제거
		String b = " 도토리반 힘내자!! ";
		System.out.println(b);
		System.out.println(b.trim()); // 앞뒤 공백을 제거해준다
		
		//대소문자변경
		String d = "Bye World";
		System.out.println(d);
		System.out.println(d.toUpperCase());
		System.out.println(d.toLowerCase());
		
		//문자열 자르기
		System.out.println(a);
		System.out.println(a.substring(5)); //숫자 미만의 인덱스 문자열 공백을 포함해 삭제
		System.out.println(a.substring(5,10)); // 5이상~10미만을 추출
		System.out.println(a.substring(5,a.length())); // 5이상~문자열끝까지
		
		//문자열자르기 split()
		String e = "010-1234-5678";
		String[] arr =e.split("-"); //문자 -를 기준으로 잘라서 -를 제외하고 String타입의 이름이 arr인 배열에 담겠다
		System.out.println(Arrays.toString(arr));
		
		//toCharArray() 스트링 타입의 문자열을 전부 한글자씩 잘라서 char 타입의 배열에 담겠다.
		char[] arr2 = e.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//
		String f = "   ";
		if(f.isBlank()) {
			System.out.println("공백문자열 입니다");
		} else {
			System.out.println("공백문자열이 아닙니다");
		}
	
	
		
		System.out.println(e.replace("-", "")); //전화번호에서 하이픈을 공백으로 변경(하이픈제거)
	
	
	}
	
	

}
