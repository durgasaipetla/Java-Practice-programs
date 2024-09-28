import java.util.Scanner;

public class positiveornegative {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a number to check postive or negative");
	int number = scan.nextInt();
	if (number>0) {
		System.out.println("The number is positive");
	}
	else {
		System.out.println("The number is negative");
	}
}
}
