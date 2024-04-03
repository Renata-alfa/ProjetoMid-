public class Occupations {
    // Atributos da classe Occupations
    private int id; // Chave primária (PK)
    private String description;

    // Construtor da classe Occupations
    public Occupations(int id, String description) {
        this.id = id;
        this.description = description;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Occupations
        Occupations occupation1 = new Occupations(1, "Software Developer");
        
        // Exibindo informações da ocupação
        System.out.println("Occupation ID: " + occupation1.getId());
        System.out.println("Occupation Description: " + occupation1.getDescription());
    }
}
