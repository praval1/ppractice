
public class ForLoopPracticePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*for(int i=1; i<=6;i++) {
		 for(int j=i; j<=6;j++) {
			 System.out.print(" *");
		 }
	 System.out.println();*/
	 
		
	/*	for(int i= 1 ; i <=6 ; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		*/
		
		for (int i = 1; i <=3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print("  ");}
				for (int k = 1; k <=i; k++) {
					System.out.print("* ");

				}
				System.out.println(" ");

			}
		}

	}

