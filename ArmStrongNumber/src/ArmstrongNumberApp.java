import java.util.Scanner;

public class ArmstrongNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = scan.nextInt();
		ArmStrongNumber armStrongNumber= new ArmStrongNumber();
		int res=armStrongNumber.armStrongChecker(n);
		if (res==n) {
			System.out.println("The number "+n+" is armstrong number");
		}
		else  {
			System.out.println("The number "+n+" is  not armstrong number");
		}

	}

}
