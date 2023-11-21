package chainOfResponsibility;

public class HelpDesk {

    public static void main(String[] args) {
        TicketHandler GSH = new GeneralSupportHandler();
        TicketHandler SSH = new SoftwareSupportHandler(GSH);
        TicketHandler TSH = new TechnicalSupportHandler(SSH);

        Ticket generalIssue = new Ticket("General support", "App does not want to run");
        Ticket softwareIssue = new Ticket("Software support", "App is laggy, takes too long to open");
        Ticket technicalIssue = new Ticket("Technical support", "App does not want to run on newest CPU");

        TSH.handleTicket(generalIssue);
        TSH.handleTicket(softwareIssue);
        TSH.handleTicket(technicalIssue);


    }
}
