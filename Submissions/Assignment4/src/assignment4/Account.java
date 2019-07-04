package assignment4;

import java.util.Scanner;

public class Account {

    private String userName;
    private String passWord;

    public String getPassWord() {
        return passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Account(String userName, String passWord){
        super();
        this.userName = userName;
        this.passWord = passWord;
    }

    public void checkAccount(){
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
            creatAccount();
            System.out.println( "\nThanks, your account and profile has been created successfully. Welcome Aboard " + p2.getFirstName() + " " + p2.getLastName() + ".");
        } else if (firstInput.equals( userName ) && secondInput.equals( passWord )){
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
        } else if (!firstInput.equals( userName ) || !secondInput.equals( passWord )){
            System.out.println( "************************************************************\n" +
                    "Your account does not exist. Please try again!\n" +
                    "************************************************************" );
        }
    }

    public void creatAccount(){
        Scanner read = new Scanner( System.in );
        System.out.println( "\nPlease enter a username [At least 6 characters]:" );
        userName = read.nextLine();
        while (userName.length() < 5){
            System.out.println( "Username has to have At least 6 characters, please try again:" );
            userName = read.nextLine();
        }

        System.out.println( "Please enter a password [At least 6 characters with at least one digit]:" );
        passWord = read.nextLine();
        while (passWord.length() < 5) {
            System.out.println( "Password has to have At least 6 characters with at least one digit, please try again:" );
            passWord = read.nextLine();
        }
    }

    private void select(){
        Scanner read = new Scanner( System.in );
        System.out.println( "Enter the number corresponding to each item to proceed:" );
        int selection = read.nextInt();

        while (selection > 10){
            System.out.println( "Please try again\n" +
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
            System.out.println( "Dear Sir/Madam,\n" +
                    "This is to certify that Mr. Peter Brown with student id 7813007 is a student at semester 1 at CICCC.\n" +
                    "He was admitted to our college in 2011 and has taken 1 course(s) so far. Currently he resides at 850\n" +
                    "West Vancouver, Vancouver.\n" +
                    "If you have any question, please don’t hesitate to contact us.\n" +
                    "Thanks,\n"  );
        } else if(selection == 2){

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
}