package example;

public class Course {

	//Properties
	private String title;  //read-only
	private String description; //read-write
	private String subject; //read-only
	private int credit; //read-only
	
	
	String getDescription() {
		return description;
	}


	void setDescription(String description) {
		this.description = description;
	}


	String getTitle() {
		return title;
	}



	String getSubject() {
		return subject;
	}

	int getCredit() {
		return credit;
	}

	public Course(String title, String description, String subject, int credit) {
		super();
		this.title = title;
		this.description = description;
		this.subject = subject;
		this.credit = credit;
	}
	
	public void print() {
		
		System.out.printf(this.title+" "+this.subject+"  "+this.credit+"  ");
		//To-Do
	}
}
