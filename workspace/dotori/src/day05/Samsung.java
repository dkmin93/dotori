package day05;

public class Samsung implements Printed {

	@Override
	public void print(String doc) {
		System.out.println("Samsung:" +doc);
		
	}

	@Override
	public int copy(int i) {
		System.out.println("삼성 프린터로 복사했습니다");
		return i;
		
	}

}
