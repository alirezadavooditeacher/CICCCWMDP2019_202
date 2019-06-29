package app;

public class StudentAccount {
  String userName;
  String password;

  public StudentAccount(String username, String password) {
    this.userName = username;
    this.password = password;
  }

  public boolean isPasswordValid(String password) {
    if (this.password.equals(password)) {
      return true;
    }
    return false;
  }
}
