package variant16computer;

import java.io.File;

/**
 * Класс-Фасад - класс с упрощённым интерфейсом, скрывающим под собой взаимодействие сложной системы классов.
 */
public class ComputerFacade {

    PowerSupply powerSupply;
    Processor processor;
    RAM ram;
    BIOS bios;
    HardDrive hardDrive;
    UserAccount userAccount;
    FileExplorer fileExplorer;
    OperatingSystem operatingSystem;

    public ComputerFacade(PowerSupply powerSupply, Processor processor, RAM ram, BIOS bios, HardDrive hardDrive,
                          UserAccount userAccount, FileExplorer fileExplorer, OperatingSystem os) {
        this.powerSupply = powerSupply;
        this.processor = processor;
        this.ram = ram;
        this.bios = bios;
        this.hardDrive = hardDrive;
        this.userAccount = userAccount;
        this.fileExplorer = fileExplorer;
        this.operatingSystem = os;
    }

    public void computerOn() {
        System.out.println("COMPUTER ON START.\n");
        powerSupply.giveMoreEnergy();
        processor.startWork();
        ram.RAMOn();
        bios.BIOSStart();
        hardDrive.startWork();

        bios.runPOST();
        operatingSystem.runLoader();
        operatingSystem.startWorking();
        operatingSystem.runServiceSoftware();
        userAccount.logIn();
        operatingSystem.setUserSettings();
        System.out.println("COMPUTER ON END.\n");
    }

    public void computerOff() {
        System.out.println("COMPUTER OFF START.\n");
        operatingSystem.stopUnterminatedPrograms();
        operatingSystem.stopServiceSoftware();
        hardDrive.stopWork();
        ram.clear();
        ram.RAMOff();
        operatingSystem.stopWorking();
        processor.endWork();
        powerSupply.giveLessEnergy();
        System.out.println("COMPUTER OFF END.\n");
    }

    public void startProgram() {
        System.out.println("START PROGRAM START.\n");
        fileExplorer.getInfoAboutExe();
        operatingSystem.createProcess();
        ram.allocateMemory();
        hardDrive.getProgramText();
        operatingSystem.createThread();
        System.out.println("START PROGRAM END.\n");
    }


}
