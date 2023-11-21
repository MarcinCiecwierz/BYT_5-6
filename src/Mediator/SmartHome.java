package Mediator;

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice smartAc = new SmartAc();
        SmartDevice smartCleaner = new SmartCleaner();
        SmartDevice smartLight = new SmartLight();

        Mediator mediator = new ConcreteMediator(smartAc, smartCleaner, smartLight);

        smartAc.turnOff();
        System.out.println();
        smartCleaner.turnOff();
        System.out.println();
        smartLight.turnOff();
    }
}
