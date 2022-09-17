
public class MaximumNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int[]number = {28,6,31,76,59,33,5};
		
		//int max = 0 ;
		
		//for(int i = 0; i<number.length;i++) {
		//	int CurrentNumber = number[i];
		//	if(max < CurrentNumber) {
		//		max = CurrentNumber;
		//	}
		//}
		//System.out.println(max);
		
		
	int[] num = {3,1,25};
	int max = 0;
	
	for(int i=0; i<num.length; i++) {
	int CurrentNumber = num[i];
	if(max < CurrentNumber) {
		max = CurrentNumber;
	   }
	}
	System.out.println(max);
			
		
		
		
		
		
	}

}
