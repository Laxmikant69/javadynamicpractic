package practical;

import java.util.Scanner;

public class Swaplastlettersofname {
	public static void swapbyothermethod(String a) {
		char x=a.charAt(a.length()-1);
		char y=a.charAt(a.length()-2);
		System.out.println(a.substring(0,a.length()-2)+x+y);
	} 
	public static void swap(String a) {
		if (a.length()>2) {
		
		char c[]=a.toCharArray();
		char last=a.charAt(a.length()-1);
		char last2nd=a.charAt(a.length()-2);
		char z =last;
		last=last2nd;
		last2nd=z;
		c[a.length()-1]=last;
		c[a.length()-2]=last2nd;
		a =new String(c);
		}
		else {
			System.out.println("invalid");;
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name:");
		String input=sc.nextLine();
		//swap(input);
		swapbyothermethod(input);
	}

}
