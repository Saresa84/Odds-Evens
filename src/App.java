import java.util.Scanner;

public class App {
	//variables for counters
	static int evenCounter= 0;
	static int oddCounter = 0;
	public static void main(String[] args) {
		//title
		System.out.println("Welcome to Odds and Evens!");
		
		//open scanner
		Scanner input = new Scanner (System.in);
		
		
		
		//check for keep going
		String keepGoing = "y";
		while (keepGoing.equalsIgnoreCase("y")){
			//prompt user for number
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			countNumbers(number);
			
			System.out.println("Continue y/n?: ");
			keepGoing = input.next();
		}
		if (keepGoing.equalsIgnoreCase("n")){
		System.out.println("You entered " + evenCounter + " numbers.");
		System.out.println("You entered " + oddCounter + " numbers.");
		}
		input.close();
	}
	public static void countNumbers(int number) {
		if (number%2 == 0){
			evenCounter++;
		}else{
			oddCounter++;
		}
	}

}
