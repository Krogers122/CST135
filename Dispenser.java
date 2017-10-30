/**
 * 
 * @author krogers122
 *  3.	Design a class using UML that models a dispenser of products. 
 *		Students should submit UML for their dispenser class. 
 */

public class Dispenser {
	private Inventory<Money> cashInventory = new Inventory<Money>(); 
	private Inventory<Item> itemInventory = new Inventory<Item>();   
	private long totalSales; private Item currentItem; 
	private long currentBalance; 
	}

}
