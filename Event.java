import javax.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate date;
    private String location;
    private String description;

    // getters and setters
    @Column(columnDefinition = "TEXT") // Use TEXT for longer descriptions
    private String description;
    
    // Additional parameters
    private String organizer;
    private int maxParticipants;
    private boolean registrationOpen;

    // Constructors (if needed)
    
    // Getters and Setters for additional parameters
    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public boolean isRegistrationOpen() {
        return registrationOpen;
    }

    public void setRegistrationOpen(boolean registrationOpen) {
        this.registrationOpen = registrationOpen;
    }

    // Getters and Setters for existing parameters (name, date, location, description)

    // Other methods if needed
}
