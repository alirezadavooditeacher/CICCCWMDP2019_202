package default_package;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static ArrayList<StudentProfile> stPList = new ArrayList<StudentProfile>();
	private static ArrayList<Account> acList = new ArrayList<Account>();
	private static ArrayList<Courses> cosList = new ArrayList<Courses>(); 
	static Scanner input = new Scanner(System.in);
	static int logintime = 0;
	
	public static void main(String[] args) {	
		//set default account
		if(logintime == 0) {
			//default account
			StudentProfile stP = new StudentProfile("Tatsuya", "Takarabe", "M", "Japan", 21, 2016, 7777777);
			Account ac = new Account("leaaxel","over20");
			Courses cs = new Courses(80,-1,-1,45,64,-1,70,-1);
			stPList.add(stP);
			acList.add(ac);
			cosList.add(cs);
			//default account2
			StudentProfile stP2 = new StudentProfile("Poko", "Tatarou", "F", "Mexico", 30, 2019, 7856493);
			Account ac2 = new Account("pokopoko","poko03");
			Courses cs2 = new Courses(-1,-1,64,-1,82,54,23,-1);
			stPList.add(stP2);
			acList.add(ac2);
			cosList.add(cs2);
		}
		//login
		Login login = new Login(acList,stPList,cosList);
		int id = login.id;
		logintime += 1;  // count login time
		// main menu
		MainMenu menu = new MainMenu(stPList,cosList,id);
				
	}
}
