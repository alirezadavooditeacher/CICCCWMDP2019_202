package services;
import homeWork.*;
import java.util.ArrayList;

public class PaintingService extends Service {
	
			
	
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
}
