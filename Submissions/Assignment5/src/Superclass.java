
public class Superclass {
	
	private static int price = 0;
	
	public void addSumOfPrice(int price){
		this.price+=price;		
	}
	
	public void showSumOfPrice() {
		System.out.println("The sum of price is : $"+this.price);
	}
	
	public void AmountOfyourOption(String product ,int amount) {
		System.out.println("|"+product+":"+amount);
	}

}
