

public class ShoppingCart extends Superclass{
	
	public ShoppingCart() {
		System.out.println("Your order is:");
	}
	
	public void CalculatesumOfthePrice() {
		
		Drink d1 = new Drink();
		Drink2 d2 = new Drink2();
		Food f1 = new Food();
		Food2 f2 = new Food2();
		Cloth c1 = new Cloth();
		
		d1.AmountOfyourOption(d1.drinkname,d1.amount);
		d2.AmountOfyourOption(d2.drinkname,d2.amount);
		f1.AmountOfyourOption(f1.foodname,f1.amount);
		f2.AmountOfyourOption(f2.foodname,f2.amount);
		c1.AmountOfyourOption(c1.clothname,c1.amount);
		
		d1.addSumOfPrice(d1.amount*d1.drinkprice);
		d2.addSumOfPrice(d2.amount*d2.drinkprice);
		f1.addSumOfPrice(f1.amount*f1.foodprice);
		f2.addSumOfPrice(f2.amount*f2.foodprice);
		c1.addSumOfPrice(c1.amount*c1.clothprice);
		
	}

}
