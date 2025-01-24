package day05;

public class LG implements Printed {

	@Override
	public void print(String doc) {
		System.out.println("LG:" +doc);
		
	}

	@Override
	public int copy(int i) {
		System.out.println("LG 프린터로 " + i +"장 복사했습니다");
		return i;
	}

	
	
}
