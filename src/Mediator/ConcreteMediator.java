package Mediator;

public class ConcreteMediator implements Mediator{
    private SmartDevice smartAc;
    private SmartDevice smartCleaner;
    private SmartDevice smartLight;

    public ConcreteMediator(SmartDevice smartAc, SmartDevice smartCleaner, SmartDevice smartLight) {
        this.smartAc = smartAc;
        this.smartCleaner = smartCleaner;
        this.smartLight = smartLight;

        smartAc.setMediator(this);
        smartCleaner.setMediator(this);
        smartLight.setMediator(this);
    }

    @Override
    public void notify(SmartDevice sender, String event) {
        if(sender == smartLight){
            if("SmartLightOn".equals(event)){
                System.out.println("Smart Light is turned on. Turning on AC.");
                smartAc.turnOn();
            }else if ("SmartLightOff".equals(event)){
                System.out.println("Smart light is turned off.");
            }
        }
        if(sender == smartAc){
            if("SmartAcOn".equals(event)){
                System.out.println("Smart Ac is turned on.");
            } else if ("SmartAcOff".equals(event)){
                System.out.println("Smart Ac is turned off.");
            }
        }
        if(sender == smartCleaner){
            if("SmartCleanerOn".equals(event)){
                System.out.println("Smart cleaner is turned on. Turning off lights");
                smartLight.turnOff();
            }else if("SmartCleanerOff".equals(event)){
                System.out.println("Smart cleaner is turned off.");
            }
        }
    }
}
