package chap01;

import java.util.Scanner;

public class a_Max3 {
	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = std.nextInt();
		System.out.print("b의 값 : ");
		int b = std.nextInt();
		System.out.print("c의 값 : ");
		int c = std.nextInt();
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("최대값은 " + max + "입니다.");
	}
}