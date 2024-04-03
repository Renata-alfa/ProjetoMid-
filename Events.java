import java.util.Date;
import java.sql.Time;

public class Events {
    // Atributos da classe Events
    private int id; // Chave primária (PK)
    private String title;
    private String description;
    private Date start_date;
    private Date end_date;
    private Time start_time;
    private Time end_time;

    // Construtor da classe Events
    public Events(int id, String title, String description, Date start_date, Date end_date, Time start_time, Time end_time) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.start_date = start_date;
        this.end_date = end_date;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return start_date;
    }

    public void setStartDate(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEndDate() {
        return end_date;
    }

    public void setEndDate(Date end_date) {
        this.end_date = end_date;
    }

    public Time getStartTime() {
        return start_time;
    }

    public void setStartTime(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEndTime() {
        return end_time;
    }

    public void setEndTime(Time end_time) {
        this.end_time = end_time;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Events
        Events event1 = new Events(1, "Event Title", "Event Description", new Date(), new Date(), new Time(System.currentTimeMillis()), new Time(System.currentTimeMillis()));
        
        // Exibindo informações do evento
        System.out.println("Event ID: " + event1.getId());
        System.out.println("Event Title: " + event1.getTitle());
        System.out.println("Event Description: " + event1.getDescription());
        System.out.println("Start Date: " + event1.getStartDate());
        System.out.println("End Date: " + event1.getEndDate());
        System.out.println("Start Time: " + event1.getStartTime());
        System.out.println("End Time: " + event1.getEndTime());
    }
}
