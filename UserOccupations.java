public class UserOccupations {
    // Atributos da classe UserOccupations
    private int id; // Chave primária (PK)
    private int occupation_id; // Chave estrangeira (FK)
    private int user_id; // Outra chave estrangeira (FK)

    // Construtor da classe UserOccupations
    public UserOccupations(int id, int occupation_id, int user_id) {
        this.id = id;
        this.occupation_id = occupation_id;
        this.user_id = user_id;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOccupationId() {
        return occupation_id;
    }

    public void setOccupationId(int occupation_id) {
        this.occupation_id = occupation_id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto UserOccupations
        UserOccupations userOccupation1 = new UserOccupations(1, 1, 1001);
        
        // Exibindo informações do usuário e sua ocupação
        System.out.println("UserOccupation ID: " + userOccupation1.getId());
        System.out.println("Occupation ID: " + userOccupation1.getOccupationId());
        System.out.println("User ID: " + userOccupation1.getUserId());
    }
}
