package day01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int v = scan.nextInt();
		
		int count = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == v) {
				count += 1;
			}
		}
		
		System.out.println(count);
		
	}

}
