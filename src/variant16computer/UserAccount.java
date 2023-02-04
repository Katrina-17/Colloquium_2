package variant16computer;

public class UserAccount {

    final int password;

    public UserAccount(int password) {
        this.password = password;
    }

    public void checkPassword(int password) {
        if (this.password == password) {
            System.out.println("Class UserAccount: correct password.");
        } else {
            System.out.println("Class UserAccount: incorrect password.");
        }
    }

    public void logIn() {
        checkPassword(password);
        System.out.println("Class UserAccount: log in successful.");
    }

    public void getUserSettings() {
        System.out.println("Class UserAccount: user settings required.");
    }




}
