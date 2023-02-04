package variant16computer;

public class TestComputer {
    public static void main(String[] args) {
        PowerSupply powerSupply = new PowerSupply();
        Processor processor = new Processor();
        RAM ram = new RAM();
        BIOS bios = new BIOS();
        HardDrive hardDrive = new HardDrive();
        UserAccount userAccount = new UserAccount(123);
        FileExplorer fileExplorer = new FileExplorer();
        OperatingSystem operatingSystem = new OperatingSystem(userAccount, fileExplorer);

        // Создание Фасада - объекта с упрощённым интерфейсом, скрывающим взаимодействие сложной иерархии классов.
        ComputerFacade facade = new ComputerFacade(powerSupply, processor, ram, bios, hardDrive, userAccount,
                fileExplorer, operatingSystem);

        facade.computerOn();
        facade.startProgram();
        facade.computerOff();
    }
}
