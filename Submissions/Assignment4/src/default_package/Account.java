package default_package;

public class Account {
	
	private String username;
	private String password;
	private int id;
	
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	//user
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//pass
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}