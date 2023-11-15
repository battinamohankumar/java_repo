package First_Package;

import java.util.Scanner;

public class ifprogram {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number: ");
	
	int x = sc.nextInt();
	
	if(x<18) 
		System.out.println("Your age is "+x+ " you are a Small Guy.");
	else if (x<28) 
		System.out.println("Your age is "+x+ " you are a Young Guy.");
	else 
		System.out.println("Your age is "+x+ " you are a Old Guy.");
	sc.close();
		
}
}
