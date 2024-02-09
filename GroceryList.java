//Immanuel Morris
//CIS - 18A Winter2024

//This Package is the meat of the code (no pun intended)
//has the most information and interface function for the user.

//Call the package for the grocery app
package groceryapp;

//Import the Scanner library for user input.
import java.util.Scanner;

public class GroceryList 
{
	//Private members that construct an array
	//for the listed items to offer.
	//Also calls for Scanner, which will be for user input.
    private Scanner scanner = new Scanner(System.in);
	
	//Array for the Veggie option
    private Item[] veggies = 
	{
        new Item("Broccoli", 1.25),
        new Item("Carrots", 0.75),
        new Item("Tomatoes", 0.30),
        new Item("Lettuce", 0.45),
        new Item("Spinach", 2.10)
    };
	
	//Array for the Meat option
    private Item[] meats = 
	{
        new Item("Chicken", 5.00),
        new Item("Beef", 7.50),
        new Item("Pork", 4.00),
        new Item("Fish", 6.00),
        new Item("Deli Slices", 3.50)
    };
    private double totalCost = 0;
    private String selectedTimeSlot = "";

    public GroceryList()
	{
		//null body
    }

	//Display Greeting for App (returns void)
    public void displayFoodOptions()
	{
        System.out.println("\nWelcome to the Grocery App!");
		System.out.println("Here is a selection of what we have to offer for pickup");
		System.out.println("--------------------");
        System.out.println("Veggie Package:");
        for (Item veggie : veggies) 
		{
            System.out.println(veggie.name + " - $" + veggie.price);
        }
        System.out.println("\nMeats Package:");
        for (Item meat : meats) 
		{
            System.out.println(meat.name + " - $" + meat.price);
        }
		//Visual line break
		System.out.println("--------------------");
        System.out.println();
    }
	
	//Method to display the package selection
    public void displaySelection() 
	{
        displayFoodOptions(); 
        System.out.println("Please make a selction of your food package choice!");
        System.out.println("1. Veggies");
        System.out.println("2. Meats");
        System.out.println("3. Veggie and Meat Combo");
        System.out.print("Enter your choice (1 - 3): ");
    }

	//method to input user choice
    public int getUserChoice()
	{
        int choice;
		//Do while loop to check condition of user input
        do {
			//input must be an integer (nothing else)
            while (!scanner.hasNextInt())
				{
                System.out.println("That's not a number. Please enter a number (1 - 3): ");
                scanner.next(); // re attempt user input
				}
			//Set condition for user input error
            choice = scanner.nextInt();
            if (choice < 1 || choice > 3) 
			{
                System.out.println("Incorrect range. Please try again (1 - 3): ");
            }
        } while (choice < 1 || choice > 3);
		
        return choice;
    }

    public void processUserChoice(int choice) {
        switch (choice) 
		{
			//Should user input 1 as a choice
            case 1:
                calculateTotal(veggies);
                break;
			//Should user input 2 as a choice
            case 2:
                calculateTotal(meats);
                break;
			//Should user input 3 as a choice
            case 3:
                calculateTotal(veggies);
                calculateTotal(meats);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

	//a void method that calculates the total cost of items
	//within the package
	//(Item class being called and referenced
    private void calculateTotal(Item[] items) {
        for (Item item : items) {
            totalCost += item.price;
        }
    }

	//This is the mehtod for displaying to user the pickup time
    public void selectPickupTime()
	{
        System.out.println("\nSelect a pickup time slot:");
        System.out.println("1. Morning (8-12)");
        System.out.println("2. Afternoon (12-4)");
        System.out.println("3. Evening (4-8)");
        System.out.print("Enter your choice (1-3): ");

		//Setup a condition for invalid user input
       boolean validSelection = false;
		while (!validSelection) 
		{
			int timeChoice = scanner.nextInt(); //User input for choice
			
			//Set up switch statement for different choices
			switch (timeChoice) 
			{
				//Should user input 1 as a choice
				case 1:
					selectedTimeSlot = "Morning (8-12)";
					validSelection = true;
					break;
				//Should user input 2 as a choice
				case 2:
					selectedTimeSlot = "Afternoon (12-4)";
					validSelection = true;
					break;
				//Should user input 3 as a choice
				case 3:
					selectedTimeSlot = "Evening (4-8)";
					validSelection = true;
					break;
				default:
					System.out.println("Invalid selection. Please select a valid time slot (1-3): ");
                
			}
		}
	}

	//Method for total cost calculation
    public double getTotalCost()
	{
        return totalCost;
    }

	//Method for to display the selected time slot
    public String getSelectedTimeSlot() 
	{
        return selectedTimeSlot;
    }
}





