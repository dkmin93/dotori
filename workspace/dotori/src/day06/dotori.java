package day06;

public class dotori {

	public static void main(String[] args) {



	}

}

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long pay = 0;

        for(int i = 1; i <= count; i++) {
        	pay += price * i;
        }
        
        if(pay > money) {
        	answer = (long)(pay - money);
        } else {
        	answer = 0L;
        }
        return answer;
    }
}
