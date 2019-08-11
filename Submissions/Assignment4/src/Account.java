import java.util.Scanner;

public class Account {
    private static String userName;
    private static String passWord;

    public static String getPassWord() {
        return passWord;
    }

    public static String getUserName() {
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

    public static void creatAccount(){
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
}
