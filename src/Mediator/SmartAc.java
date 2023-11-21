package Mediator;

public class SmartAc implements SmartDevice{
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void turnOn() {
        System.out.println("Smart Ac is turning on.");

        if(mediator != null){
            mediator.notify(this, "SmartAcOn");
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Ac is turning off.");

        if(mediator != null){
            mediator.notify(this, "SmartAcOff");
        }
    }
}
