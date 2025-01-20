package day02;

import java.util.Arrays;

public class MainClass2 {
	
	public static void main(String[] args) {
		
		//기본타입 - 정수 실수 불린 문자
		int a = 1;
		
		//참조타입 - 클래스, 배열, 인터페이스 타입
		Tv tv = new Tv(); //주소값을 저장
		System.out.println("기본타입:" + a);
		System.out.println("참조타입:" + tv);
		
		int[] arr = new int[3];
		int[] arr2 = arr;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
	}
	
	
	
	

}
