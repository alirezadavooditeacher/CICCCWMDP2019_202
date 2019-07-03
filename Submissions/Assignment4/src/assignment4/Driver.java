package assignment4;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        StudentProfile profile1 = new StudentProfile( "Peter", "Brown", "M", "850\n" +
                "West Vancouver, Vancouver", "CANADA", 31, 2016 );
        Student student1 = new Student( 4 );
        Account account1 = new Account( "accountTest1", "passWord1" );
        Manager manager1 = new Manager( "Ali", "Davoodi", "CICCC" );
        account1.checkAccount();
    }
}
