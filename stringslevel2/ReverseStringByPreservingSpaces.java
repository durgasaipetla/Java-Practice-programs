package com.kodnest.stringslevel2;

import java.util.Scanner;

public class ReverseStringByPreservingSpaces {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter a string");
	String s1= scan.nextLine();
	ReverseStringPresSpaces reverse= new ReverseStringPresSpaces();
	String res=reverse.stringReverse(s1);
	System.out.println(res);
}
}
