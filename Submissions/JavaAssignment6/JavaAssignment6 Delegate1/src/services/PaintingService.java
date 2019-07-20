package services;

import java.util.ArrayList;

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
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getExpectedEndDate() {
		return expectedEndDate;
	}
	public void setExpectedEndDate(String expectedEndDate) {
		this.expectedEndDate = expectedEndDate;
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
