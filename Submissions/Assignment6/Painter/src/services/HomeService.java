package services;

public class HomeService {

	public String category;
	public String description;
	public float budget;
	public int age;
	public int date;
	public String gender;
	
	public HomeService(String category, String description, float budget) {
		super();
		this.category = category;
		this.description = description;
		this.budget = budget;
	}
	
	public HomeService(String category, String description, int date) {
		super();
		this.category = category;
		this.description = description;
		this.date = date;
	}
	
	public HomeService(String category, String description, int age, String gender) {
		super();
		this.category = category;
		this.description = description;
		this.age = age;
		this.gender = gender;
	}

	int getAge() {
		return age;
	}

	int getDate() {
		return date;
	}

	String getGender() {
		return gender;
	}

	public String getCategory() {
		return category;
	}
	
	public String getDescription() {
		return description;
	}

	public float getBudget() {
		return budget;
	}
	
	
}
