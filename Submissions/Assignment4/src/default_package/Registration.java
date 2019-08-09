package default_package;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Registration {
	//profile value
	private int studentID = 0;
	private String firstname="";
	private String lastname="";
	private String gender="";
	private String countryoforigin="";
	private int yearofadmission=0;
	private int age=0;
	private String username="";
	private String password="";
	private int id;
	Scanner read = new Scanner(System.in);
	Random random = new Random();
	//courses value
	private int object_C = -1;   
	private int object_OP = -1;    
	private int problem_S = -1; 
	private int project_M = -1;    
	private int java_P = -1;    
	private int web_D = -1;         
	private int android_P = -1;     
	private int ios_A = -1;        
	private String csgrade;
	//constructor	
	public Registration(ArrayList<StudentProfile> studentProfileList, ArrayList<Account> accountList, ArrayList<Courses> cosList) {

		registerOfprofile();
		while(true) {
			boolean isLogin = checkUserInfo();
			if(isLogin) {
				RegisterOfCourseswhichHasTaken();
				addStatementsOfAccount(studentProfileList,accountList,cosList);
				System.out.println("ok");	//ch			
				break;
			}else {
				System.out.println("[Try again!]\n");
				registerOfprofile();		
			}
		}
	}
	// register own info
	public void registerOfprofile() {
		
		System.out.println("Enter your Firstname:");
		this.firstname = read.nextLine();
		System.out.println("Enter your Lastname:");
		lastname = read.nextLine();
		System.out.println("Enter your Gender[M/F/O]:");
		gender = read.nextLine();
		System.out.println("Enter your Country of origin:");
		countryoforigin = read.nextLine();
		System.out.println("Enter your Year of admission(with 4 digits):");
		yearofadmission = read.nextInt();
		System.out.println("Enter your Age:");
		age = read.nextInt();read.nextLine();//or add read.nextLine instead next(); as below 
		System.out.println("Enter new Username[At least 6 character]:");
		username = read.nextLine();// or u can use nextLine(); if you did above method
		System.out.println("Enter new Password[At least 6 character with 1 digit and upword]:");
		password = read.nextLine();
		// call class instance which make 8 digits randomly: studentID = random.nextInt();
	    studentID = random.nextInt((7999999-5000000) + 1) + 5000000; // create 5000000 to 7999999 
	}
	
	void RegisterOfCourseswhichHasTaken(){
		System.out.println("****************************************************************");
		System.out.println("| Enter the grade to each courses which you have taken before  |");
		System.out.println("| If you have not taken the course yet Enter to skip           |");
		System.out.println("****************************************************************");
		
		System.out.println(": Objective-C: (3 units):");
		csgrade = read.nextLine();
<<<<<<< HEAD
		object_C = (csgrade.equals(""))? -1 : Integer.parseInt(csgrade); //ternary operator
		System.out.println(object_C);
		
		System.out.println(": Objective-Oriented Programming: (2 units):");
		csgrade = read.nextLine();
		object_OP = (csgrade.equals(""))? -1 : Integer.parseInt(csgrade);
		
		System.out.println(": Problem Solving: (1 units):");
		csgrade = read.nextLine();
		problem_S = (csgrade.equals(""))? -1 : Integer.parseInt(csgrade);
		
		System.out.println(": Project Management: (3 units):");
		csgrade = read.nextLine();
		project_M = (csgrade.equals(""))? -1 : Integer.parseInt(csgrade);
		
		System.out.println(": Java Programming: (3 units):");
		csgrade = read.nextLine();
		java_P = (csgrade.equals(""))? -1 : Integer.parseInt(csgrade);
		
		System.out.println(": Web Development: (2 units):");
		csgrade = read.nextLine();
		web_D = (csgrade.equals(""))? -1 : Integer.parseInt(csgrade);
		
		System.out.println(": Andorid Programming: (2 units):");
		csgrade = read.nextLine();
		android_P = (csgrade.equals(""))? -1 : Integer.parseInt(csgrade);
		
		System.out.println(": iOS Applications: (3 units):");
		csgrade = read.nextLine();
		ios_A = (csgrade.equals(""))? -1 : Integer.parseInt(csgrade);
=======
		object_C = (csgrade == "")? Integer.parseInt(csgrade) : -1; //ternary operator
		
		System.out.println(": Objective-Oriented Programming: (2 units):");
		csgrade = read.nextLine();
		object_OP = (csgrade == "")? Integer.parseInt(csgrade) : -1;
		
		System.out.println(": Problem Solving: (1 units):");
		csgrade = read.nextLine();
		problem_S = (csgrade == "")? Integer.parseInt(csgrade) : -1;
		
		System.out.println(": Project Management: (3 units):");
		csgrade = read.nextLine();
		project_M = (csgrade == "")? Integer.parseInt(csgrade) : -1;
		
		System.out.println(": Java Programming: (3 units):");
		csgrade = read.nextLine();
		java_P = (csgrade == "")? Integer.parseInt(csgrade) : -1;
		
		System.out.println(": Web Development: (2 units):");
		csgrade = read.nextLine();
		web_D = (csgrade == "")? Integer.parseInt(csgrade) : -1;
		
		System.out.println(": Andorid Programming: (2 units):");
		csgrade = read.nextLine();
		android_P = (csgrade == "")? Integer.parseInt(csgrade) : -1;
		
		System.out.println(": iOS Applications: (3 units):");
		csgrade = read.nextLine();
		ios_A = (csgrade == "")? Integer.parseInt(csgrade) : -1;
>>>>>>> fa294cfb981e7258aa2b3e50376b6c861b95fdfe
	}
	
	boolean checkUserInfo(){
		char digit,num;
//		String str;
//		if(yearofadmission.length() <= 4 && age.length() <= 3) {
//			for(int i = 0; i < age.length(); i++ ) {
//				digit = yearofadmission.charAt(i);
//				digit2 = age.charAt(i);
//				str = String.valueOf(digit);
//				str2 = String.valueOf(digit2);
//				System.out.println("ah "+str);
//				for(int j= 0; j < 10; j++) {
//					count = String.valueOf(j);
//					System.out.println(count+"cot");
//					if(str.equals(count)) {
//						System.out.println("no");
//						return false;
//					}
//				}System.out.println("yeah");
//				for(int j= 0; j < 10; j++) {
//					count = String.valueOf(j);
//					System.out.println("no2");
//					if(!str2.equals(count)) {
//						return false;
//					}
//				}
//			}
//		}
		
		//checking if invalid or not
		if(yearofadmission > 2030 || yearofadmission < 1998) {
			System.out.println("**************************************************");
			System.out.println("|Choose your Year of addmission from 1999 to 2030|");
			System.out.println("**************************************************");
			return false;
		}
		if(age < 18 || age > 37 ) {
			System.out.println("***************************");
			System.out.println("|Choose your age properly |");
			System.out.println("***************************");
			return false;
		}
		// identifying the password and user name whether invalid or not
		if(username.length() >= 6 && password.length() >= 6) {
			System.out.println("start");//ch
			if(!gender.equals("M") && !gender.equals("F") && !gender.equals("O")) {
				System.out.println("**************************************************************");
				System.out.println("|Choose your gender from capital [M(male)/F(female)/O(other)]|");
				System.out.println("**************************************************************");
				return false;
			}
			
			for(int i = 0; i < username.length(); i++ ) {
				digit = username.charAt(i);
				for(int j= 0; j < 10; j++) {
					num = (char)(j+'0');
					if(digit == num) {
						System.out.println("fin");
						return false;
					}
				}	
			}
			
			for(int i = 0; i < password.length(); i++ ) {
				digit = password.charAt(i);
				for(int j= 0; j < 10; j++) {
					num = (char)(j+'0');
					if(digit == num) {
						System.out.println("good");//ch
						return true;
					}
				}
			}System.out.println("eh");//ch
			return false;	
		
		}else {System.out.println("why");//ch
			return false;
		}
	}
	public void addStatementsOfAccount(ArrayList<StudentProfile> studentProfileList, ArrayList<Account> accountList,ArrayList<Courses> cosList) {
		StudentProfile stP = new StudentProfile(firstname, lastname, gender, countryoforigin, age, yearofadmission, studentID);
		Account ac = new Account(username,password);
<<<<<<< HEAD
		System.out.println("corse gd"+object_C);
=======
>>>>>>> fa294cfb981e7258aa2b3e50376b6c861b95fdfe
		Courses cs = new Courses(object_C, object_OP, problem_S, project_M, java_P, web_D,
				android_P, ios_A);
		studentProfileList.add(stP);
		ac.setId(accountList.size()); // when delete default account this line should fix like this:(accountList.size() - 1);
		this.id = ac.getId();
		accountList.add(ac);
		cosList.add(cs);
//		System.out.println("id::"+this.id); //ch
//		for(int i = 0; i < studentProfileList.size(); i++) {
//			System.out.println(studentProfileList.get(i).getCountryofOrigin());
//		}
	}	
	public String getFirstname(String firstname) {
		return firstname;
	}	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountryoforigin() {
		return countryoforigin;
	}

	public void setCountryoforigin(String countryoforigin) {
		this.countryoforigin = countryoforigin;
	}

	public int getYearofadmission() {
		return yearofadmission;
	}

	public void setYearofadmission(int yearofadmission) {
		this.yearofadmission = yearofadmission;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return this.id;
	}
	
}
