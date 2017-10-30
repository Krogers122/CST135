/**
 * 
 * @author krogers122
 *   2.	Design a class using UML that models a product one might find in a 
 * 		snack machine
**/
public class Product {

		public static void main(String[] args) {
		 Vending vending1 = new Vending("Data Structures");
		 Vending vending2 = new Vending("Database Systems");
		
		 vending1.addDrink("Crystal Pepsi");
		 vending1.addDrink("Orbitz");
		 vending1.addDrink("Surge");
		 vending1.addDrink("LifeSavers");
		 vending1.addDrink("Frutopia");
		 vending1.addDrink("7UP Gold");
		 vending1.addDrink("Snapple TRU Root Beer");
		 vending1.addDrink("Jolt");
		 vending1.addDrink("Hi-C Ecto Cooler");
		 vending1.addDrink("Vault");
		 vending1.addDrink("Huba Bubba");
		 
		
		 vending2.addDrink("Diet Water");
		 vending2.addDrink("Organic Water");
		 vending2.addDrink("Hi-C Ecto Cooler");
		
		 System.out.println("Number of Drinks in vending1: "
		 + vending1.getNumberOfDrinks());
		 String[] drinks = vending1.getDrinks();
		 for (int i = 0; i < vending1.getNumberOfDrinks(); i++)
		 System.out.print(drinks[i] + ", ");
		
		 System.out.println();
		 System.out.print("Number of students in vending2: "
		 + vending2.getNumberOfDrinks());
	 }
 }

