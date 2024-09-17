package practise;

import java.util.Scanner;

public class CubeNumber {
	public static int cubeNumber(int num) {
		return num*num*num;
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num= scan.nextInt();
		System.out.println(cubeNumber(num));
	}
}
