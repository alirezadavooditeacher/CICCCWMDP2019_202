package services;

public class PaintingService {
	
	private String description;
	private String startDate;
	private String expectedEndDate;
	private String painingColor;
	private int size;
	private String address;
	private int price;
	
	public PaintingService(String description, String startDate, String expectedEndDate, String painingColor,
			int size, String address) {
		super();
		this.description = description;
		this.startDate = startDate;
		this.expectedEndDate = expectedEndDate;
		this.painingColor = painingColor;
		this.size = size;
		this.address = address;
	}

	String getDescription() {
		return description;
	}
	String getStartDate() {
		return startDate;
	}
	String getExpectedEndDate() {
		return expectedEndDate;
	}
	String getPainingColor() {
		return painingColor;
	}
	int getSize() {
		return size;
	}
	String getAddress() {
		return address;
	}
	int getPrice() {
		return price;
	}
	
	
	
}