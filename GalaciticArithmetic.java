package practice;
import java.util.*;
public class GalaciticArithmetic {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		long result = galaciticAddition(num1,num2);
		System.out.println(result);		
		sc.close();
	}
	public static long galaciticAddition(long num1, long num2) {
	
    return num1+num2;
}
}