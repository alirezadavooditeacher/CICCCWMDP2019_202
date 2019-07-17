package service;

public class PaintingService extends Service {
	
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

	public String getDescription() {
		return description;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getExpectedEndDate() {
		return expectedEndDate;
	}
	public String getPainingColor() {
		return painingColor;
	}
	public int getSize() {
		return size;
	}
	public String getAddress() {
		return address;
	}
	public int getPrice() {
		return price;
	}
	
	
	
}