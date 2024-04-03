public class Tags {
    // Atributos da classe Tags
    private int id; // Chave primária (PK)
    private int father_id; // Chave estrangeira (FK)
    private String description; 

    // Construtor da classe Tags
    public Tags(int id, int father_id, String description) {
        this.id = id;
        this.father_id = father_id;
        this.description = description;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFatherId() {
        return father_id;
    }

    public void setFatherId(int father_id) {
        this.father_id = father_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Tags
        Tags tag1 = new Tags(1, 101, "Financeiro");
        
        // Exibindo informações da tag
        System.out.println("Tag ID: " + tag1.getId());
        System.out.println("Father ID: " + tag1.getFatherId());
        System.out.println("Description:" + tag1.getDescription());
    }
}
