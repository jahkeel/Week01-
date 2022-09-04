package firstcode;

public class Week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create a variable to hold the quantity of available tickets for the concert
				int availableTickets = 10;
				
				//create a variable to hold the cost of groceries at checkout
				double costOfGroceries = 49.99;
				
				//create a variable to hold a person's middle initial
				char middleInitial = 'G';
				
				//create a variable to hold true if it's hot outside and false if it's cold outside
				boolean isHotOutside = false;
				
				//create a variable to hold a customer's first name
				String customerFirstName = "Mike";
				
				//create a variable to hold a street address
				String streetAddress = "335 Pleasant st";
				
				//print all variables to the console
				System.out.println("Available tickets left for concert: " + availableTickets);
				System.out.println(costOfGroceries + " is the price for groceries.");
				System.out.println("The person's middle initial is " + middleInitial);
				System.out.println("It is hot outside - " + isHotOutside);
				System.out.println("The customer's first name is " + customerFirstName);
				System.out.println(streetAddress + " is where the person lives.");
				
				
				
				//a customer booked 2 plane seats, remove 2 seats from the available seats variable
				availableTickets = availableTickets - 3;
				availableTickets -= 3;
				System.out.println(availableTickets);
				
				//Walmart apple purchase, add 3.50 to the grocery total
				//costOfGroceries = costOfGroceries + 3.50;
				costOfGroceries += 3.50;
				System.out.println(costOfGroceries);
				
				//birth certificate was printed incorrectly, change the middle initial to something else
				middleInitial = 'F';
				System.out.println(middleInitial);
				
				//the season has changed, update the hot outside variable to be opposite of what it was
				isHotOutside = !isHotOutside;
				System.out.println(isHotOutside);
				
				//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
				String fullName = customerFirstName + " " + middleInitial + " Jones";
				System.out.println(fullName);
				
				//print a line to the console that introduces the customer and says they live at the address variable
				System.out.println("Hi, my name is " + fullName + " and I live at " + streetAddress + ".");

		
		
	}

}
