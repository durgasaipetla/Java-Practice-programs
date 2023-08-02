import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
    checkDiscount(n);

	}

	

	public static void checkDiscount(double n) {
		
		if (n>100) {
		System.out.println("Discount applicable");
		}
		else {
			System.out.println("discount is not applicable");
		}
	}

}
