# GroceryApp-Java

## Installation 
make sure that Java JDK 11 or higher is installed.
See documentation for explicit installation information.

## The Reason Why
the purpose of this program is to create a simple order for delivery
upon the program launch, you'll be greeted with menu options for both
veggie and meats.

## User Input
This is crucial, there are contengencies put in place for errors,
so please make sure that your inputting the right range for selection

## To Run the code
It's best to see the code execution from running the command line cmd,
but your also welcome to use and IDE of your choice.
To view the code on github, the source code is located in the second branch. (not the main branch)

## Code snippet
heres an example of whats behind the scenes:
```java 
GroceryList groceryList = new GroceryList();
groceryList.displaySelection();
int choice = groceryList.getUserChoice();
groceryList.processUserChoice(choice);
groceryList.selectPickupTime();
// Display order recap using getTotalCost and getSelectedTimeSlot methods.
```

# To the user
thank you for the support, and thank you for testing out this code!
