package default_package;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	private ArrayList<StudentProfile> stPList;
	private ArrayList<Courses> cosList;
	static Scanner input = new Scanner(System.in);
	static Manager manager = new Manager();
	String mfn = manager.getFirstname(); String mLn = manager.getLastname();
	String gender;
	String mrs;
	String sub;
	boolean isExit;
	int id, gd;
	double gpa;
	int count;
	
	
	public MainMenu(ArrayList<StudentProfile> stPList,ArrayList<Courses> cosList,int id) {
		this.stPList = stPList;
		this.cosList = cosList;
		this.id = id;
		CheckOwnGender();
		GeneralTranscript generalTranscript = new GeneralTranscript(cosList , id); //make instance
		generalTranscript.InformationOfGeneralTranscript(); //call method to set gpa and count
		this.gpa = generalTranscript.getGpa();
		this.count = generalTranscript.getCount();
		while(true) {
			drowingMainView();	
			if(isExit) {
				System.out.println("\nlogout\n");
				Main.main(null);
			}
		}
	}
	void drowingMainView() {
		System.out.println("\n****************************");
		System.out.println("| Select from thee options |");
		System.out.println("*******************************************");
		System.out.println("[1]Print your Enrollment Certificate      |");
		System.out.println("[2]Print my Courses                       |");
		System.out.println("[3]Print my Transcript                    |");
		System.out.println("[4]Print my GPA                           |");
		System.out.println("[5]Print my Ranking                       |");
		System.out.println("[6]List all available courses             |");
		System.out.println("[7]List all students                      |");
		System.out.println("[8]Show Profile                           |");
		System.out.println("[9]Logout                                 |");
		System.out.println("[10]Exit                                  |");
		System.out.println("*******************************************");
		System.out.println("Enter the number corresponding to each item to proceed:");
		String option = input.nextLine();
	
		
		if(option.equals("10")) {
			System.out.println("(Exit)");
			System.exit(0);
		}
		else if(option.equals("9")) {
			isExit = true;
		}
		else if(option.equals("8")) {
			System.out.println("\n[StudentProfile]");
			System.out.println("Student Name: "+stPList.get(id).getFirstname()+" "+stPList.get(id).getLastname());
			System.out.println("StudentID: "+stPList.get(id).getStudentID());
			System.out.println("Gender: "+gender);
			System.out.println("Country of origin: "+stPList.get(id).getCountryofOrigin());
			System.out.println("Age: "+stPList.get(id).getAge());
			System.out.println("Year of addmission: "+stPList.get(id).getYearofAdmission());
			System.out.println("\n-Enter to back menu");
			input.nextLine();
		}
		else if(option.equals("7")) {
			System.out.println("\n[List of students]");
			for(int i = 0; i < stPList.size(); i++) {
				System.out.println(stPList.get(i).getFirstname()+" "+stPList.get(i).getLastname()+" : "+stPList.get(i).getStudentID());
			}
			System.out.println("\n-Enter to back menu");
			input.nextLine();
		}
		else if(option.equals("6")) {
			String iftaken = " [Has taken]", ifnottaken = " [Not taken]";
			System.out.println("These following courses are offered in CICCC :");
			if(cosList.get(id).getObject_C() > 0) {
				System.out.println("MADP101 : Objective-C"+iftaken);
			}else {System.out.println("MADP101 : Objective-C"+ifnottaken);}
			if(cosList.get(id).getObject_OP() > 0) {
				System.out.println("MADP102 : Objecct-Oriented Proogramming"+iftaken);
			}else {System.out.println("MADP102 : Objecct-Oriented Proogramming"+ifnottaken);}
			if(cosList.get(id).getProblem_S() > 0) {
				System.out.println("MADP201 : Problem Solving"+iftaken);
			}else {System.out.println("MADP201 : Problem Solving"+ifnottaken);}
			if(cosList.get(id).getProject_M() > 0) {
				System.out.println("MADP202 : Project Management"+iftaken);
			}else {System.out.println("MADP202 : Project Management"+ifnottaken);}
			if(cosList.get(id).getJava_P() > 0) {
				System.out.println("MADP301 : Java Programming"+iftaken);
			}else {System.out.println("MADP301 : Java Programming"+ifnottaken);}
			if(cosList.get(id).getWeb_D() > 0) {
				System.out.println("MADP302 : Web Development"+iftaken);
			}else {System.out.println("MADP302 : Web Development"+ifnottaken);}
			if(cosList.get(id).getAndroid_P() > 0) {
				System.out.println("MADP401 : Android Programming"+iftaken);
			}else {System.out.println("MADP401 : Android Programming"+ifnottaken);}
			if(cosList.get(id).getIos_A() > 0) {
				System.out.println("MADP402 : iOS Applications"+iftaken);
			}else {System.out.println("MADP402 : iOS Applications"+ifnottaken);}
			
			System.out.println("\n-Enter to back menu");
			input.nextLine();
		}
		else if(option.equals("5")) {
			//ranking
			int rank = 1;
			for(int j = 0; j < stPList.size(); j++) {
				double score = (cosList.get(j).getObject_C()+cosList.get(j).getObject_OP()+cosList.get(j).getProblem_S()+cosList.get(j).getProject_M()+cosList.get(j).getJava_P()+cosList.get(j).getWeb_D()+cosList.get(j).getAndroid_P()+cosList.get(j).getIos_A())/ count;
				if(gpa < score) {
//					System.out.println(ave);
//					System.out.println(score);
					rank += 1;	
				}
			}
			System.out.println("Your score is ["+gpa+"] therefore your rank is ["+rank+"]");
			System.out.println("\n-Enter to back menu");
			input.nextLine();
		}
		else if(option.equals("4")) {
<<<<<<< HEAD
			System.out.println("Your overall GPA is : "+gpa);
=======
			System.out.println("'Your overall GPA is : "+gpa);
			System.out.println("'Your current semester's GPA is : ???");
>>>>>>> fa294cfb981e7258aa2b3e50376b6c861b95fdfe
			System.out.println("\n-Enter to back menu");
			input.nextLine();
		}
		else if(option.equals("3")) {
			
			System.out.println("Hi "+mrs+" "+stPList.get(id).getFirstname()+" "+stPList.get(id).getLastname());
			System.out.println("Here is your general transcript:");
	
			if(cosList.get(id).getObject_C() > 0) {
				gd = cosList.get(id).getObject_C();
				System.out.println("MADP101 : Objective-C:"+gd);
			}
			if(cosList.get(id).getObject_OP() > 0) {
				gd = cosList.get(id).getObject_OP();
				System.out.println("MADP102 : Objecct-Oriented Proogramming:"+gd);
			}
			if(cosList.get(id).getProblem_S() > 0) {
				gd = cosList.get(id).getProblem_S();
				System.out.println("MADP201 : Problem Solving:"+gd);
			}
			if(cosList.get(id).getProject_M() > 0) {
				gd = cosList.get(id).getProject_M();
				System.out.println("MADP202 : Project Management:"+gd);
			}
			if(cosList.get(id).getJava_P() > 0) {
				gd = cosList.get(id).getJava_P();
				System.out.println("MADP301 : Java Programming:"+gd);
			}
			if(cosList.get(id).getWeb_D() > 0) {
				gd = cosList.get(id).getWeb_D();
				System.out.println("MADP302 : Web Development:"+gd);
			}
			if(cosList.get(id).getAndroid_P() > 0) {
				gd = cosList.get(id).getAndroid_P();
				System.out.println("MADP401 : Android Programming:"+gd);
			}
			if(cosList.get(id).getIos_A() > 0) {
				gd = cosList.get(id).getIos_A();
				System.out.println("MADP402 : iOS Applications:"+gd);
			}
			System.out.println("\nYour GPA is: "+gpa);
			
			System.out.println("\n-Enter to back menu");
			input.nextLine();
		}
		else if(option.equals("2")) {
			System.out.println("Hi "+mrs+" "+stPList.get(id).getFirstname()+" "+stPList.get(id).getLastname());
			System.out.println("You have taken the following courses so far:");
	
			if(cosList.get(id).getObject_C() > 0) {
				System.out.println("MADP101 : Objective-C");
			}
			if(cosList.get(id).getObject_OP() > 0) {
				System.out.println("MADP102 : Objecct-Oriented Proogramming");
			}
			if(cosList.get(id).getProblem_S() > 0) {
				System.out.println("MADP201 : Problem Solving");
			}
			if(cosList.get(id).getProject_M() > 0) {
				System.out.println("MADP202 : Project Management");
			}
			if(cosList.get(id).getJava_P() > 0) {
				System.out.println("MADP301 : Java Programming");
			}
			if(cosList.get(id).getWeb_D() > 0) {
				System.out.println("MADP302 : Web Development");
			}
			if(cosList.get(id).getAndroid_P() > 0) {
				System.out.println("MADP401 : Android Programming");
			}
			if(cosList.get(id).getIos_A() > 0) {
				System.out.println("MADP402 : iOS Applications");
			}
			System.out.println("\n-Enter to back menu");
			input.nextLine();
		}
		else if(option.equals("1")) {
			System.out.println("*****************************************************************************************************");
			System.out.println("\n Dear Sir/Madam                                  ");
			System.out.println("\n This is certify that "+mrs+stPList.get(id).getFirstname()+" "+stPList.get(id).getLastname()+" with student id "+stPList.get(id).getStudentID()+" is a student semester 1 at CICCC.");
			System.out.println(" "+sub+" was admitted to our colledge in "+stPList.get(id).getYearofAdmission()+" and has taken "+count+" course(s) so far.\n");
			System.out.println("\n If you have any question, please don't hesitate to contact us");
			System.out.println(" Thanks,");
			System.out.println(" [Manager's name:"+mfn+" "+mLn+"]");
			System.out.println("******************************************************************************************************");
			System.out.println("\n-Enter to back menu");
			input.nextLine();
		}
	}
	void CheckOwnGender() {
		this.gender = stPList.get(id).getGender();
		if(!gender.equals("O")) {
			if(!gender.equals("M")) {
				gender = "Female";
				mrs = "Ms.";
				sub = "She";
			}else { gender = "Male"; mrs = "Mr."; sub = "He"; }
		}else { gender = "Other"; mrs = "Mr/Ms."; sub = "He/She"; }
	}

}
