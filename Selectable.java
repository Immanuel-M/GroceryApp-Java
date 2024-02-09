//Immanuel Morris
//CIS - 18A Winter2024

//This file contains the selectable interface
//used in corresponding packages

//Package Definition
package groceryapp;

//Interface to be accessed by other classes
public interface Selectable 
{
	//Data types for this interface
    void displaySelection();
    int getUserChoice();
    void displayItemsBasedOnChoice(int choice);
}
