package companyQuestions;

import java.util.Scanner;

public class Chkpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		str=sc.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
			rev=rev+str.charAt(i);
				if(str.equals(rev))
				{
					System.out.println(str+" is Palindrome");
				}
				else
				{
				System.out.println(str+" is not a palindrome ");
				}
	
			
		

	}

}
