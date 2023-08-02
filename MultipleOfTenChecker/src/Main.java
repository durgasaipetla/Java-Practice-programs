import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter first number");
	int n = sc.nextInt();
	System.out.println("enter second number");
	int m= sc.nextInt();
	checkMultipleOfTen(n,m);
}

public static void checkMultipleOfTen(int n,int m) {
if (n%m==0)	{
	System.out.println("the first number is multiple of second number");
}
else {
	System.out.println("the first number is not multiple of second number");
}
}
}
