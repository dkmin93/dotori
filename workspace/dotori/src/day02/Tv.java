package day02;

public class Tv {

	String company;
	int channel;
	boolean power;
	
	//객체로 생성할 class들은 main이 없다.
	//객체는 멤버변수 메서드 생성자로 구성되어 있다.
	//멤버변수 = 전역변수 = 필드
	//멤버변수는 초기값 지정을 안해도 자동으로 값이 지정되지만
	//지역변수는 초기값을 지정해줘야 메서드가 작동한다
	//생성자는 생략가능하지만 보통은 만들어줘야 한다.
	//생성자는 메서드랑 형태가 비슷하지만 반환타입이 없다.

	//생성자의 오버로딩 - 여러개를 만들 수 있다.
	//단 매개변수의 갯수, 종류, 순서를 다르게 해야한다.

	Tv() {

	}

	Tv(int channel) {
		this.channel = channel;
	}
	
	Tv(String company, int channel, boolean power) {
		
		this.company = company;
		this.channel = channel;
		this.power = power;
	}


	

	//메서드
	void changeChannel(int channel) {

		int a = 1;

		this.channel = channel;
		System.out.println(this.channel + "번으로 채널을 변경합니다");
	}

	void power() {
		power = !power;
		if(power) {
			System.out.println("전원을 켭니다");
		} else {
			System.out.println("전원을 끕니다");
		}
	}

	void info() {
		System.out.println(this.company);
	}

}
