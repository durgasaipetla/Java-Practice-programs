import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the how many person are   ");
		int n= sc.nextInt();
		boolean arr[] = new boolean [n];
		 for (int i=0; i<=arr.length-1;i++) {
			 System.out.println("Enter the person"+ i+ "is married or not ");
			 arr[i]=sc.nextBoolean();
		 }
		
		 for (int i=0; i<=arr.length-1;i++) {
			 
			System.out.println(arr[i]);
		 }
		 
	}

}
