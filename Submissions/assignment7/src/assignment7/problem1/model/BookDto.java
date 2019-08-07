package assignment7.problem1.model;

public class BookDto {
	private String name;
	
	private String category;
	
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public BookDto(String name, String category, float price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	
	
	

}
