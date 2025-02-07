package day01;

import java.util.Arrays;

public class Example02 {
	
	public static void main(String[] args) {
		
		
		int[] arr; //배열의 선언, 배열도 참조변수다
		
		arr = new int[5];  //배열의 생성
		
		//heap 영역엔 실제 배열이 생성되고 stack 영역에 변수값과 배열의 주소값이 저장된다
		
		//배열의 초기화
		arr[0] = 1; //  배열의 한 칸은 4이므로 첫번째칸은 0~4까지 이므로 [0]으로 쓴다
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[arr.length-1] = 5;
		
		//배열의 주소
		System.out.println(arr);
		//배열의 모습을 문자열로
		System.out.println(Arrays.toString(arr));
		
		//배열의 선언과 생성을 동시에
		int[] arr2 = new int[5];
		
		//배열의 선언, 생성, 초기화
		int[] arr3 = {1,2,3,4,5,6,7};
		
		//배열은 값을 초기화 하지 않으면 기본값으로 초기화 됨
		System.out.println(Arrays.toString(arr2));
		
		//
		int i = 0; // 제어변수, 시작값, 배열은 인덱스가 0부터 시작하므로 제어변수를 0으로 둔다
		while(i < arr.length) { //조건은 0부터 배열의 길이 미만!!!
			System.out.println(arr[i]);
			i++;
		}
		
	}

}
