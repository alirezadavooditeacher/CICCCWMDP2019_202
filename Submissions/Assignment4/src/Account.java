import java.util.ArrayList;
import java.util.List;

public class Account {
	private long userName;
	private String password;
	private StudentProfile studentProfile;
	public static final List<Account> accounts = new ArrayList<Account>();
	
	public Account() {
	}

	public Account(long userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public long getUserName() {
		return userName;
	}

	public void setUserName(long userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean checkLogin() {
		for (int i = 0; i < accounts.size(); i++) {
			Account account = accounts.get(i);
			if (this.userName == account.getUserName() && this.password.equals(account.getPassword())) {
				setStudentProfile(account.getStudentProfile());
				return true;
			}
		}
		return false;
	}

	public StudentProfile getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}
}
