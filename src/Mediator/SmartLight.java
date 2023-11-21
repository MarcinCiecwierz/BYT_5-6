package Mediator;

public class SmartLight implements SmartDevice{
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void turnOn() {
        System.out.println("Smart Light is turning on.");

        if(mediator != null){
            mediator.notify(this, "SmartLightOn");
        }

    }

    @Override
    public void turnOff() {
        System.out.println("Smart Light is turning off.");

        if(mediator != null){
            mediator.notify(this, "SmartLightOff");
        }
    }
}
