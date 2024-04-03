public class Users {
    // Atributos da classe Users
    private int id; // Chave primária (PK)
    private String name;
    private String email;
    private String password;

    // Construtor da classe Users
    public Users(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Users
        Users user1 = new Users(1001, "João", "joao@example.com", "password123");
        
        // Exibindo informações do usuário
        System.out.println("User ID: " + user1.getId());
        System.out.println("Name: " + user1.getName());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Password: " + user1.getPassword());
    }
}
