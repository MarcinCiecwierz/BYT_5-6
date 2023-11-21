package chainOfResponsibility;

public class GeneralSupportHandler implements TicketHandler{

    private TicketHandler next;

    public GeneralSupportHandler() {
    }
    public GeneralSupportHandler(TicketHandler next) {
        this.next = next;
    }

    @Override
    public void handleTicket(Ticket ticket) {
        if("General support".equals(ticket.getType())){
            System.out.println("General support is handling the issue");
        }
        else if (next != null){
            next.handleTicket(ticket);
        }
    }
}
