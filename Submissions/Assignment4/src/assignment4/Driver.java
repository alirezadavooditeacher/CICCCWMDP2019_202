package assignment4;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        StudentProfile profile1 = new StudentProfile("Same", "Stone", "M", "street", "canada",15, 4);
        Student student1 = new Student( 4 );
        Account account1 = new Account( "test1", "passWord1" );
        account1.checkAccount();
    }
}
