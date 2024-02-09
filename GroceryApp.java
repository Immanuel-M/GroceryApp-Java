//Immanuel Morris
//CIS - 18A Winter2024

//Call package location
package groceryapp;

//Main program function
public class GroceryApp 
{
    public static void main(String args[]) 
	{
		//Create new Grocery list object
        GroceryList groceryList = new GroceryList();
		
        //Output protocol:
		//----------------//
		//Display the Grocery list selection
        groceryList.displaySelection();
		
		//assign choice to grocery list
        int choice = groceryList.getUserChoice();	
		
		//user choice is displayed
        groceryList.processUserChoice(choice);
		
		//Call for pickup time is displayed
        groceryList.selectPickupTime();

        // Display a recap of the user's choices and total cost
        System.out.println("\n--- Order Recap ---");
        System.out.println("You selected option: " + choice);
        System.out.println("Pickup Time Slot: " + groceryList.getSelectedTimeSlot());
        System.out.println("Total Cost: $" + String.format("%.2f", groceryList.getTotalCost()));
        System.out.println("\nThank you for your order,");
		System.out.println("we will notify you when its ready!");
    }
}

