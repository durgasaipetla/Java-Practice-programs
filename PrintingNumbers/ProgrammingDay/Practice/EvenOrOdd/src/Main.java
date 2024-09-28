import java.util.Scanner;

public class Floor{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base and exponent values");
		int base= sc.nextInt();
		int exponent=sc.nextInt();
		double result = Math.pow(base, exponent);
		System.out.println("power of " + base + " to the "+exponent+ " exponent is " + result);
	}
	}