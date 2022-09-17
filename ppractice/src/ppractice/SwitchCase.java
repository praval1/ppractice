import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter value a");
int a = sc.nextInt();
System.out.println("enter value b");
int b = sc.nextInt();

System.out.println("select operator or function from 4 cases");
int operator = sc.nextInt();


switch(operator) {
case 1 : System.out.println(a+b);
break;

case 2 : System.out.println(a-b);
break;

case 3 : System.out.println(a*b);
break;

case 4 : System.out.println(a/b);
break;

default: System.out.println("You have entered invalid input");



}


	}

}
