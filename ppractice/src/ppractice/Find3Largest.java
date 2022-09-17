
import java.util.Arrays;


public class Find3Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = {50,100,90,70};
		
		int n = number.length;
		Arrays.sort(number);
		
		System.out.println(number[n-3]);
		
		
	}

}
