package services;
import homeWork.*;
public interface ServiceProtocolInterface {

//	public String jobDescription();
//	public String address();
//	public String paintColor();
//	public int size();
//	public String startDate();
//	public String expectedEndDate();
	
	public PaintingService paintingService();
	public CarRepairService carRepairService();
	public CookingService cookService();
	public WashingService washingService();
	public BabyService babyService();
}
