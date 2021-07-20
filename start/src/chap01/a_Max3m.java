package chap01;

public class a_Max3m {
	
	static int max3(int a, int b, int c) {
		/**
		 * 여러 값에 대해서도 최댓값을 구하는 메서드
		 */
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,2,2) = " + max3(3,2,1));
		System.out.println("max3(3,1,2) = " + max3(3,2,1));
		System.out.println("max3(3,2,3) = " + max3(3,2,1));
		System.out.println("max3(3,3,2) = " + max3(3,2,1));
		System.out.println("max3(3,3,3) = " + max3(3,2,1));
		System.out.println("max3(2,2,3) = " + max3(3,2,1));
		System.out.println("max3(2,3,1) = " + max3(3,2,1));
		System.out.println("max3(2,3,2) = " + max3(3,2,1));
		System.out.println("max3(1,3,2) = " + max3(3,2,1));
		System.out.println("max3(2,3,3) = " + max3(3,2,1));
		System.out.println("max3(1,2,3) = " + max3(3,2,1));
	}
	
	/**
	 * practice
	 */
	
	// 네 값의 최댓값을 구하는 max4
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		return max;
	}
	
	// 세 값의 최솟값을 구하는 min3
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	// 네 값의 최솟값을 구하는 min4
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		return min;
		
	}
}
