package variant16computer;

public class OperatingSystem {

    UserAccount userAccount;
    FileExplorer fileExplorer;

    public OperatingSystem(UserAccount user, FileExplorer fileExplorer) {
        userAccount = user;
        this.fileExplorer = fileExplorer;
    }


    public void runLoader() {
        System.out.println("Class OperatingSystem: the OS runs the loader.");
    }

    public void startWorking() {
        System.out.println("Class OperatingSystem: OS is loaded and starts working.");
    }

    public void runServiceSoftware() {
        System.out.println("Class OperatingSyatem: OS runs the service software.");
    }

    public void stopServiceSoftware() {
        System.out.println("Class OperatingSyatem: OS stops the service software.");
    }

    public void setUserSettings() {
        userAccount.getUserSettings();
        System.out.println("Class OperatingSystem: OS sets user's settings.");
    }

    public void stopUnterminatedPrograms() {
        System.out.println("Class OperatingSystem: OS stops all the unterminated programs.");
    }

    public void stopWorking() {
        System.out.println("Class OperatingSystem: OS stops working.");
    }

    public void createProcess() {
        System.out.println("Class OperatingSystem: OS runs the function CreateProcess.");
    }

    public void createThread() {
        System.out.println("Class OperatingSystem: OS creates the main thread of the program.");
    }


}
