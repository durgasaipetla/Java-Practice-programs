import java.util.Scanner;

public class seniorcitizen {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the age of a person");
	int age= scan.nextInt();
	if (age>=60) {
		System.out.println("Eligible for Senior citizen discount");
	}
	else {
		System.out.println("Not eligible for senior citizen");
	}
}

}
