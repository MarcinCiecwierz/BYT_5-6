package chainOfResponsibility;

public class TechnicalSupportHandler implements TicketHandler{

    private TicketHandler next;

    public TechnicalSupportHandler() {
    }

    public TechnicalSupportHandler(TicketHandler next) {
        this.next = next;
    }

    @Override
    public void handleTicket(Ticket ticket) {
        if("Technical support".equals(ticket.getType())){
            System.out.println("Technical support is handling the issue.");
        }
        else if (next != null) {
            next.handleTicket(ticket);
        }
    }
}
