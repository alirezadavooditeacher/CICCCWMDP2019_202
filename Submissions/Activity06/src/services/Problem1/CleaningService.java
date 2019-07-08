package services.Problem1;

public class CleaningService extends Service {

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CleaningService(String description) {
		super();
		this.description = description;
	}
	
}
