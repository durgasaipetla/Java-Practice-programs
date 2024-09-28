import java.util.Scanner;

public class floor {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number1 in double ");
		double number1 =sc.nextDouble();
		System.out.println("enter number2 in double ");
		double number2 =sc.nextDouble();
		    
		        double floorValue1 = Math.floor(number1);
		        double floorValue2 = Math.floor(number2);

		        System.out.println("Floor value of " + number1 + " is " + floorValue1);
		        System.out.println("Floor value of " + number2 + " is " + floorValue2);
		    }
		}

	
