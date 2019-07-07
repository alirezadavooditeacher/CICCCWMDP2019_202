package homeWork;

public class StudentService {
	String topic;
	String level;
	
	public StudentService(String topic, String level) {
		super();
		this.topic = topic;
		this.level = level;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	
	
}
