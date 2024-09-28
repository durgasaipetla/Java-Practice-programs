import java.util.Scanner;

public class voteeligibility {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age of voter");
		int age = scan.nextInt();
		if (age >=18) {
			System.out.println("vote eligible");
		}
	}

}
