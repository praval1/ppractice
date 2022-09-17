import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);		
		
	System.out.println("calculator");
	System.out.println("enter value 1");
	int a = sc.nextInt();
	System.out.println("enter value 2");
	int b = sc.nextInt();
	
	System.out.println("press 1 for addition");
		System.out.println("press 2 for substraction");
		System.out.println("press 3 for division");
		System.out.println("press 4 for multiplication");
		
		int Operationtype = sc.nextInt();
		
		if (Operationtype==1) {
		System.out.println(a+b);
	}else if (Operationtype == 2) {
		System.out.println(a-b);
	}else if (Operationtype==3) {
		System.out.println(a/b);
	}else if (Operationtype ==4) {
		System.out.println(a*b);
	}else 
		System.out.println("wrong input");
	}

}