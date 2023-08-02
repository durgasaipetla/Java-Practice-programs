import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		// char j='@';
//	while (j!='!') {
		while (true) {
			System.out.println("Hello user Welcome to kodnest Calculator");
			System.out.println("+  ---------> Addition");
			System.out.println("-  --------> Subtraction");
			System.out.println("*  --------> Multiplication");
			System.out.println("/  ---------> Division");
			System.out.println("%  ---------> Modulus");
			System.out.println("^  ---------> Power");

			char ch = scan.next().charAt(0);

			if (ch == '+') {
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println(CalculatorApp.addition(a, b));
			} else if (ch == '-') {
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println(CalculatorApp.subtraction(a, b));
			} else if (ch == '*') {
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println(CalculatorApp.multiplication(a, b));
			} else if (ch == '%') {
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println(CalculatorApp.modulus(a, b));
			} else if (ch == '/') {
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println(CalculatorApp.division(a, b));
			} else if (ch == '!') {
				return;
			}
		}

	}
	// j=1;
	// System.out.println("Enter any key to continue ");
	// System.out.println("Enter ! to exit ");
	// j = scan.next().charAt(0);

}
