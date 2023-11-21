package chainOfResponsibility;

public class Ticket {

    private final String type;
    private final String description;

    public Ticket(String type, String description) {
        this.type = type;
        this.description = description;
    }
    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

}
