//Immanuel Morris
//CIS - 18A Winter2024


//This is the item class (part of the groceryapp package)
//This class is largely implmented by the Grocery list package
package groceryapp;

public class Item 
{
	//Data type setup
    String name;
    double price;

	//Constructor for this class
    public Item(String name, double price) 
	{
        this.name = name;
        this.price = price;
    }

   //Another method to implement
   //This is the string output for choice
    public String toString() 
	{
		//returning the string name of chosen item and price in
		//2 decimal format (%.2f)
        return name + " - $" + String.format("%.2f", price);
    }
}
