import java.util.Scanner;

public class capitalletter {

	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a character from a to z in capital");
    char n= scan.next().charAt(0);
    if (n>='A' && n<='Z') {
    	System.out.println("The entered number is capital");
    	
    }
	}

}
