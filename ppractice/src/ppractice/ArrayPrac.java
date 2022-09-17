import java.util.Arrays;

public class ArrayPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,4,3,2,5,6,-1};
		Arrays.sort(A);
		for(int x:A) {
	 System.out.print(x+" ");
		}
		
		System.out.println(A.length-3);
		return;
		

	}

}
