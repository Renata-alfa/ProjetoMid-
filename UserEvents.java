public class UserEvents {
    // Atributos da classe UserEvents
    private int customer_id; // Parte da chave primária (PK)
    private int user_id; // Parte da chave primária (PK)
    private int event_id; // Parte da chave primária (PK)

    // Construtor da classe UserEvents
    public UserEvents(int customer_id, int user_id, int event_id) {
        this.customer_id = customer_id;
        this.user_id = user_id;
        this.event_id = event_id;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public int getEventId() {
        return event_id;
    }

    public void setEventId(int event_id) {
        this.event_id = event_id;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto UserEvents
        UserEvents userEvent1 = new UserEvents(1, 1001, 2001);
        
        // Exibindo informações do evento do usuário
        System.out.println("Customer ID: " + userEvent1.getCustomerId());
        System.out.println("User ID: " + userEvent1.getUserId());
        System.out.println("Event ID: " + userEvent1.getEventId());
    }
}
