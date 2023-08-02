package problems;
import java.util.Scanner;
public class NestedIf {
      public static void main(String[] args) {

		      Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your salary: ");
		        int salary = scanner.nextInt();
		        if (salary>100000) 
		        {
		        System.out.println("Person with 5 years experience getting salary");
		        }
		        else 
		        {
		        if (salary<=50000&& salary>=40000) 
		        	{
		        		System.out.println("Fresher of java developer salary ");
		        	}
		        else 
		        	{
		        		System.out.println("learn skills boss");
		        	}
		        }
      }

}

