
public class Reverse {

	public static void main(String[] args) {
		
	String a = "hi how are u";
String b = "";

int l = a.length();

for(int i=l-1 ; i>=0 ; i-- ) {
	b =b+a.charAt(i);
}
System.out.println(b);
  }
}	