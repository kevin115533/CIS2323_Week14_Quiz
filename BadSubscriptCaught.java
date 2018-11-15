import java.util.*;

public class BadSubscriptCaught{
	public static void main(String[] args){
		String[] nameArray = {"kevin", "bill", "john", "jon", "rob", "jill", "will",
		"steve", "mike", "michael"};
		int userOpt = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an array index number between 0 and 9: ");
		userOpt = input.nextInt();
		
			try{
			System.out.println(nameArray[userOpt]);
			}
			catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("That is not within the array index");
			}
		
	}
}
