package account;
import student.*;

import java.util.HashMap;
import java.util.Scanner;

public class Account {
	private String userName;
	private String passWord;
	public static HashMap<String, Student> usernameStudentsMap = new HashMap<String, Student>();
	//static HashMap<Student,HashMap<String,String>> studentAccountPasswordMap;
	
	public Account(Student student) {
		super();
		Scanner s=new Scanner(System.in);
		System.out.println("Please username");
		String userName=s.nextLine();
		this.userName = userName;
		System.out.println("Please enter your password");
		String passWord=s.nextLine();
		this.passWord = passWord;
		usernameStudentsMap.put(userName, student);
//		HashMap<String,String> accountPasswordPair=new HashMap<String,String>();
//		accountPasswordPair.put(userName, passWord);
		//studentAccountPasswordMap.put(student, accountPasswordPair);
		
		
	}
	public Account(Student student,String userName) {
		super();		
		this.userName = userName;		
		usernameStudentsMap.put(userName, student);
	}
	public String getUserName() {
		return userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public static HashMap<String, Student> getUsernameStudentsMap() {
		return usernameStudentsMap;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	
}