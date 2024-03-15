
public class IntSearchDriver {
	public static void main(String[]args) {
		
		int findNum = 12;
		int number;
		number = (IntSearch.findThis(findNum));
		if (number == -1) {
			System.out.println(number + "\n" + "not found");
		}//end if
		
		else {
			System.out.println("The location in the array is " + number);
		}//end else
	}//end main
}//end class
