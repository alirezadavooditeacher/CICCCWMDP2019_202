package services;

public class PaintingService extends Service{
	private String painingColor;
	private int size;
	private String address;
	private int price;
	
	public PaintingService(String description, String startDate, String expectedEndDate, String painingColor,
			int size, String address) {
		super(description, startDate, expectedEndDate);
		this.painingColor = painingColor;
		this.size = size;
		this.address = address;
	}

	public String getPainingColor() {
		return painingColor;
	}
	public void setPainingColor(String painingColor) {
		this.painingColor = painingColor;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
