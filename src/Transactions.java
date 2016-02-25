import java.util.Scanner;


public class Transactions extends cashRegister{

	public static void main(String[] args) {
		// creates a new cashRegister object
		cashRegister cashRegister1 = new cashRegister();
		
		// sets the total to 2.99
		cashRegister1.total = 2.99;
		
		addItem(0.98);

		//adds more transactions and prints their total
		scan("eggs",2);
		scan("magazine",3);
		
		System.out.println(cashRegister1.total);
		
		//takes out the last item
		voidLastTransaction(4.99);
		System.out.println(total);
		
		//creates two staffMembers with a
		staffMember Robert = new staffMember();
		Robert.name = "Robert Smith";
		Robert.discountPercent = 15;
		
		staffMember Maria = new staffMember();
		Maria.name = "Maria Paulson";
		Maria.discountPercent = 15;
		
		//calls the staff discount method
		applyStaffDiscount(Maria.discountPercent);
	}

}
