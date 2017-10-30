/**
 * 
 * @author krogers122
 * CLC Milestone1 Storyboard and Abstract Data Type using UML
 ___________________________________________________________________
- vendingMachine: String
- drinks: String[]
- numberOfDrinks: int
____________________________________________________________________
+ Vending(vendingMachine: String)
+ getVendingMachine(): String
+ addDrink(drink: String): void
+ dropDrink(drink: String): void
+ getDrinks(): String[]
+ getNumberOfDrinks: int
 */

public interface VendingMachine { 
	public long selectItemAndGetPrice(Item item); 
	public void insertMoney(Money money); 
	public Receipt<Money> refund(); 
	public Collection<Item, Receipt<Money>> collectItemAndChange(); 
	public void reset(); 
}

/*
*The CLC Milestone 1 storyboard and abstract data type using UML assignment must begin
* with a basic thought. The storyboard of a Vending Machine and its products. The story
*  starts with a thirsty user in a subway waiting for her train. She looks around and
*   finds an illuminated vending machine displaying a thirst quenching Surge. She 
*   ruffles through her purse and finds a fresh minted two-dollar bill. Exuberated! 
*   She approached the machine to enter her money and make her wise beverage selection.
*   She selected A1, not just a lovely steak sauce, but a Java enum predetermined to 
*   guarantee her taste buds embrace the only flavor capable of satisfaction. Without
*   her even knowing, a dispenser class was receiving a Boolean statement from a 
*   public class VendingMachineImplementer. She also didn’t know that the 
*   implementer was checking whether she imputed the correct money, if there were any
*   products left, and if she would need change back. Before she could finish 
*   licking her lips thinking about the delicious green citrus bubbly oasis awaiting
*   her, she heard the clink-clank of the internal gears grabbing her selection. 
*   The dispenser class had successfully compiled, and it knew there was only one 
*   item left. It registered one less product in its vending and one additional 
*   dollar in the cashInventory; which mean the user must receive 1 dollar with 
*   the beverage. The woman was delighted as she drank her perfect selection, but 
*   before returning to her seat and waiting for her train, she looked back to 
*   see the blinking lights reading, “Thank You for Your Purchase.”
*
*/