package default_package;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	private ArrayList<StudentProfile> stPList;
	private ArrayList<Account> acList;
	private ArrayList<Courses> cosList;
	Scanner input = new Scanner(System.in);
	String username = "";
	String password = "";
	int id;
	String registed;
	boolean isLogin = false;
	boolean isRegister = false;
	
	public Login(ArrayList<Account> accountList,ArrayList<StudentProfile> stPList,ArrayList<Courses> cosList) {
		this.acList = accountList;
		this.stPList = stPList;
		this.cosList = cosList;
		while(!isLogin && !isRegister) {
			drawLoginView();
			if(!isRegister) {
				isLogin = checkLoginUser();	
				if(isLogin) {			
					System.out.println("oh"); //ch
				}else {
					System.out.println("\n[Try again!]\n");		
				}
			}
		}
		System.out.println("menu");// show main menu
	}
	
	void drawLoginView() {
		System.out.println("**************************************");
		System.out.println("| Please enter your account to login |");
		System.out.println("| Not resistered yet? Type 'Register'|");
		System.out.println("**************************************");
		System.out.println("-If you won't register, Enter to skip: ");
		this.registed = input.nextLine();
		
		if(registed.equals("Register") ) {
			Registration registration = new Registration(stPList,acList,cosList);
			this.id = registration.getId();
			isRegister = true;
		}else {
			System.out.println("Username: ");
			this.username = input.nextLine();
			System.out.println("Password: ");
			password = input.nextLine();
			System.out.println("----------");
			
		}
	}
	
	boolean checkLoginUser(){
		for(int i = 0; i < acList.size(); i++) {
			String username = acList.get(i).getUsername();
			String password = acList.get(i).getPassword();
		    if(username.equals(this.username) && password.equals(this.password)) {
				System.out.println("yes");
				this.id = i;
				return true;
			}
		}
		System.out.println("********************************************************");
		System.out.println("| You might wrong Username or Password check carefully |");
		System.out.println("********************************************************");
		return false;
	}

}
