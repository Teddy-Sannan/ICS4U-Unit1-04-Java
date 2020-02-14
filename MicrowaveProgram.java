/****************************************************************************
 *
 * Created by: Teddy Sannan
 * Created on: Febuary 2019
 * Created for: ICS4U
 * This program tells the user how long it will take to microwave their item 
 * of choice, given its quantity.
 *
 ****************************************************************************/

import java.util.Scanner;

public class MicrowaveProgram {

	public static void main(String[] args) {
		
        double foodTime = 0;
        
        // property
        double subTime = 1;
        double pizzaTime = 0.75;
        double soupTime = 1.75;
		
        // get item from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to heat up a sub, pizza or soup?");
		String userFood = scanner.nextLine();
		
		// get quantity of item from user
		if (userFood.equals("sub") || userFood.equals("pizza") || userFood.equals("soup")) {
			System.out.println("How many " + userFood + " would you like to heat? You can choose 1, 2 or 3.");
			int quantity = scanner.nextInt();
			scanner.close();
			
			//calculate time required to heat up iteam based on quantity entered by user
			if(quantity == 1 && userFood.equals("sub")) {
				foodTime = subTime * 1;
			}
			else if (quantity == 1 && userFood.equals("pizza")) {
				foodTime = pizzaTime * 1;
			}
			else if (quantity == 1 && userFood.equals("soup")) {
				foodTime = soupTime * 1;
			}
			else if(quantity == 2 && userFood.equals("sub")) {
				foodTime = subTime * 1.5;
			}
			else if (quantity == 2 && userFood.equals("pizza")) {
				foodTime = pizzaTime * 1.5;
			}
			else if (quantity == 2 && userFood.equals("soup")) {
				foodTime = soupTime * 1.5;
			}
			else if(quantity == 3 && userFood.equals("sub")) {
				foodTime = subTime * 2;
			}
			else if (quantity == 3 && userFood.equals("pizza")) {
				foodTime = pizzaTime * 2;
			}
			else if (quantity == 3 && userFood.equals("soup")) {
				foodTime = soupTime * 2;
			}
			
			//Test for an invalid input (value user inputted is not 1, 2 or 3) 		
			if(quantity > 3) {
			    System.out.println("Please choose a valid input. ");
			}
			else {
				System.out.println("The total time is " + foodTime + " minutes");
			}
		}
		else {
			System.out.println("Please choose a valid input. ");
		}
		
	}

}
