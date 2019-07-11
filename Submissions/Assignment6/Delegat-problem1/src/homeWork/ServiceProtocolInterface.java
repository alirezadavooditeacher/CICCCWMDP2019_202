package homeWork;

import services.*;
public interface ServiceProtocolInterface {

//	public String jobDescription();
//	public String address();
//	public String paintColor();
//	public int size();
//	public String startDate();
//	public String expectedEndDate();
	
	public Service orderService();
	public Service paintingService();
	public CarRepairService carRepairService();
	public CookingService cookService();
	public WashingService washingService();
	public BabyService babyService();
	public StudentService studentService();
	public CleaningService cleaningService();
	
}
