
public class cashRegister {
	static double total = 0;
	
	// this method adds the price of an item and prints out the total of cash
	public static void addItem(double item){
			total += item;
		double lastTransaction = item;
			System.out.println(total);
	}
	// this method takes an item and its quantity and adds it to the total
	public static void scan(String itemName, int quantity){
		switch(itemName){
		
		case  "eggs" : total += 0.98 * quantity;
		break;
		
		case "milk" : total += 1.23 * quantity;
		break;
		
		case "magazine" : total += 4.99 * quantity;
		break;
		
		case "chocolate" : total += 0.45 * quantity;
		break;
		
		default : System.out.println("That item is not for sale.");
	}
}
	
	public static void voidLastTransaction(double lastTransaction){
		total -= lastTransaction;
	}
	
	public static  void applyStaffDiscount(int discountPercent){
		total  -= total * discountPercent/100;
		System.out.println(total);
	}
}
