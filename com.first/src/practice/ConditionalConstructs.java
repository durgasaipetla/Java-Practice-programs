package practice;
import java.util.*;
public class ConditionalConstructs {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter two numbers");
    int a = scan.nextInt();
	int b = scan.nextInt();
	if (a>b) {
		System.out.println(b-a);
	}
	else 
	{
    System.out.println(a-b);
	}
	scan.close();	

	}
}
