package chainOfResponsibility;

public class SoftwareSupportHandler implements TicketHandler{

    private TicketHandler next;
    public SoftwareSupportHandler() {
    }
    public SoftwareSupportHandler(TicketHandler next) {
        this.next = next;
    }

    @Override
    public void handleTicket(Ticket ticket) {
        if("Software support".equals(ticket.getType())){
            System.out.println("Software support is handling the issue.");
        }
        else if (next != null){
            next.handleTicket(ticket);
        }
    }
}
