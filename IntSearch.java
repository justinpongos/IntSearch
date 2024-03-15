
public class IntSearch {
	private static int[] numlist = {-9, 2 , 3, 4, 7, 9, 10, 23, 45, 67};

	public static int findThis(int findNum) {	
		int notEqual = 0;
	for (int index = 0; index < numlist.length; index++) {
		if(numlist[index]==findNum) {
			return index;
		}//end if
		else {
			notEqual = -1;
			}//end else
		}//end for
			return notEqual;

	}//end static method
}//end class
