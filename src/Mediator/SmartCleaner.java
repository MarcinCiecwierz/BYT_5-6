package Mediator;

public class SmartCleaner implements SmartDevice{
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void turnOn() {
        System.out.println("Smart Cleaner is turning on.");

        if(mediator != null){
            mediator.notify(this, "SmartCleanerOn");
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Cleaner is turning off.");

        if(mediator != null){
            mediator.notify(this, "SmartCleanerOff");
        }
    }
}
