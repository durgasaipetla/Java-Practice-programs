package com.kodnest.Stringslevel3;
	import java.util.*;
	public class NonRepeatingCharacter{
//	public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Enter a string..");
//	String input = scanner.next();
//	int firstNonRepeatingChar = FindFirstNonRepeatingChar(input);
//	if (firstNonRepeatingChar !=53) {
//	System.out.println("The first non-repeating character is: " + input.charAt(firstNonRepeatingChar));
//	} else if(firstNonRepeatingChar ==53){
//	System.out.println("No non-repeating character found in the given string.");
//	}
//	}
//	public static int FindFirstNonRepeatingChar(String word){
//		boolean flag =true;
//	
//		for(char i :word.toCharArray())  
//        {  
//            if (word.indexOf(i) == word.lastIndexOf(i))  
//            {  
//                 
//                flag = false;  
//                return  i;  
//            }  
//        }  
//        if(flag== true){  
//           return 53;  
//}
//		return 53;  
//	
//	}
				
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String s2="";
			for(int i=input.length()-1;i>=0;i--)
			{
				s2=s2+input.charAt(i);
				}
				char arr1[]=input.toCharArray();
				char arr2[]=s2.toCharArray();
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				
				if(arr1==arr2){
				System.out.println("The input string is a palindrome."+arr1);
				}
				else{
				System.out.println("The input string is not a palindrome."+arr1+ " "+arr2);
				}
			}
	}	
		
	
