import java.util.Scanner; 

public class programmingExercise {

	public static void main(String[] args) {
		
		//Declaring Prices 
		int adultPrice = 25;
		int studentPrice = 15;
		int oapPrice = 10;
		int childPrice = 3;
		double totalCost = 0;
		int freeChildDivisor = 2;
		int halfPriceDivisor = 2;
		
		System.out.println("Welcome to the theme park!");
		System.out.println("");
		
		// Input of number of tickets
	    Scanner ticket = new Scanner(System.in);
	    System.out.println("Please enter the number of adult tickets you want:");
	    int adultTicketAmount = ticket.nextInt();
	    totalCost += adultTicketAmount * adultPrice;
	    System.out.println("Please enter the number of student tickets you want:");
	    int studentTicketAmount = ticket.nextInt();
	    totalCost += studentTicketAmount * studentPrice;
	    System.out.println("Please enter the number of OAP tickets you want:");
	    int oapTicketAmount = ticket.nextInt();
	    totalCost += oapTicketAmount * oapPrice;
	    System.out.println("Please enter the number of child tickets you want:");
	    int childTicketAmount = ticket.nextInt();
	    
	    // Calculation to check for 2 for 1 offer for child tickets
	    int freeChildTickets = adultTicketAmount / freeChildDivisor;
	    if (freeChildTickets >= 1)
	    {
	    	totalCost += (childTicketAmount - freeChildTickets) * childPrice;
	    }
	    else {
	    	totalCost += (childTicketAmount ) * childPrice;
	    }
	    
	    //If statement to check for 50% off
	    int adultAndChildTicketTotal = (adultTicketAmount + childTicketAmount);
	    boolean adultAndChildTotal = adultAndChildTicketTotal <= 0;
	    boolean oapAndStudentTotal = oapTicketAmount > studentTicketAmount;
	    if (adultAndChildTotal && oapAndStudentTotal)
	    {
	    	totalCost = totalCost / halfPriceDivisor; 
	    }
	    else {
	    	totalCost = totalCost *1;
	    }
	    
	    // Output of number of tickets 
	    System.out.println("Number of adult tickets bought: " + adultTicketAmount);
	    System.out.println("Number of student tickets bought: " + studentTicketAmount);
	    System.out.println("Number of OAP tickets bought: " + oapTicketAmount);
	    System.out.println("Number of child tickets bought: " + (childTicketAmount) );
	    System.out.println("The number of free child tickets is: " + (freeChildTickets  - freeChildTickets));
	    
	    
	    
	    // Final Output
	    System.out.println("Total cost of tickets is £" + totalCost);
	    ticket.close();
	  }
	}