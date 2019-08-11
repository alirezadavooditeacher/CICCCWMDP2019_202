import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        StudentProfile profile1 = new StudentProfile( "Peter", "Brown", "M", "850\n" +
                "West Vancouver, Vancouver", "CANADA", 31, 2016 );
        Student student1 = new Student( 4 );
        Account account1 = new Account( "accountTest1", "passWord1" );
        Manager manager1 = new Manager( "Ali", "Davoodi", "CICCC" );
        
        checkAccount();
    }

    public static void checkAccount(){
        Scanner read = new Scanner( System.in );
        System.out.println( "************************************************************\n" +
                "Please enter your account to login:\n" +
                "************************************************************\n" +
                "Username:\n" +
                "Password:\n" +
                "\n----------------\n" +
                "Not registered yet? Type “Register” and press enter to start the registration process!");
        String firstInput = read.nextLine();
        String secondInput = read.nextLine();

        if (firstInput.equals( "Register" ) ){
            StudentProfile p2 = new StudentProfile(  );
            p2.creatStudentProfile();
            Account.creatAccount();
            System.out.println( "\nThanks, your account and profile has been created successfully. Welcome Aboard " + p2.getFirstName() + " " + p2.getLastName() + ".");
        } else if (firstInput.equals( Account.getUserName() ) && secondInput.equals( Account.getPassWord() )){
            System.out.println( "************************************************************\n" +
                    "Welcome to Cornerstone International College of Canada.\n" +
                    "************************************************************\n" +
                    "\n************************************************************\n" +
                    "Select from the options:\n" +
                    "************************************************************\n" +
                    "—[1] Print my enrolment certificate\n" +
                    "—[2] Print my courses\n" +
                    "—[3] Print my transcript\n" +
                    "—[4] Print my GPA\n" +
                    "—[5] Print my ranking among all students in the college\n" +
                    "—[6] List all available courses\n" +
                    "—[7] List all students\n" +
                    "—[8] Show My Profile\n" +
                    "—[9] Logout\n" +
                    "—[10] Exit\n" +
                    "************************************************************\n");
            select();
        } else if (!firstInput.equals( Account.getUserName() ) || !secondInput.equals( Account.getPassWord() )){
            System.out.println( "************************************************************\n" +
                    "Your account does not exist. Please try again!\n" +
                    "************************************************************" );
        }
    }

    private static void select(){
        Scanner read = new Scanner( System.in );
        System.out.println( "Enter the number corresponding to each item to proceed:" );
        int selection = read.nextInt();

        while (selection > 10){
            System.out.println( "Please try again.\n" +
                    "************************************************************\n" +
                    "Select from the options:\n" +
                    "************************************************************\n" +
                    "—[1] Print my enrolment certificate\n" +
                    "—[2] Print my courses\n" +
                    "—[3] Print my transcript\n" +
                    "—[4] Print my GPA\n" +
                    "—[5] Print my ranking among all students in the college\n" +
                    "—[6] List all available courses\n" +
                    "—[7] List all students\n" +
                    "—[8] Show My Profile\n" +
                    "—[9] Logout\n" +
                    "—[10] Exit\n" +
                    "************************************************************\n" +
                    "Enter the number corresponding to each item to proceed:");
            selection = read.nextInt();
        }

        if(selection == 1){
            printSelectionOne();
        } else if(selection == 2){
            printSelectionTwo();
        } else if(selection == 3){

        } else if(selection == 4){

        } else if(selection == 5){

        } else if(selection == 6){

        } else if(selection == 7){

        } else if(selection == 8){

        } else if(selection == 9){
            System.out.println(  );
            checkAccount();
        } else if(selection == 10){
            System.exit(0);
        }
    }

    private static void printSelectionOne(){
        if (StudentProfile.getGender() == "M"){

            System.out.println( "Dear Sir/Madam,\n\n" +
                    "This is to certify that Mr. " + StudentProfile.getFirstName() + " " + StudentProfile.getLastName() + " with " +
                    "student id " + StudentProfile.getStudentID() + " is a student at semester 1 at " + Manager.getTitle() +".\n"
                    + "He was admitted to our college in " + StudentProfile.getYearOfAdmission() +" and has taken 1 " +
                    "course(s) so far. Currently he resides at "+ StudentProfile.getAddress() +".\n\n" +
                    "If you have any question, please don’t hesitate to contact us.\n" +
                    "Thanks,\n" + Manager.getFirstName() + " " + Manager.getLastName()  );
        } else if (StudentProfile.getGender() == "F"){
            System.out.println( "Dear Sir/Madam,\n\n" +
                    "This is to certify that Ms. " + StudentProfile.getFirstName() + " " + StudentProfile.getLastName() +" with " +
                    "student id " + StudentProfile.getStudentID() + " is a student at semester 1 at " + Manager.getTitle() +".\n"
                    + "She was admitted to our college in " + StudentProfile.getYearOfAdmission() +" and has taken 1 " +
                    "course(s) so far. Currently she resides at "+ StudentProfile.getAddress() +".\n\n" +
                    "If you have any question, please don’t hesitate to contact us.\n" +
                    "Thanks,\n" + Manager.getFirstName() + " " + Manager.getLastName()  );
        } else if (StudentProfile.getGender() == "O"){
            System.out.println( "Dear Sir/Madam,\n\n" +
                    "This is to certify that " + StudentProfile.getFirstName() + " " + StudentProfile.getLastName() +
                    " with student id " + StudentProfile.getStudentID() + " is a student at semester 1 at " + Manager.getTitle() +".\n"
                    + "He/She was admitted to our college in " + StudentProfile.getYearOfAdmission() +" and has taken" +
                    " 1 course(s) so far. Currently he/she resides at "+ StudentProfile.getAddress() +".\n\n" +
                    "If you have any question, please don’t hesitate to contact us.\n" +
                    "Thanks,\n" + Manager.getFirstName() + " " + Manager.getLastName()  );
        }
    }

    private static void printSelectionTwo(){

    }
}
