public class Segments {
    // Atributos da classe Segments
    private int id; // Chave primária (PK)
    private String description;

    // Construtor da classe Segments
    public Segments(int id, String description) {
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
        // Criando um objeto Segments
        Segments segment1 = new Segments(1, "Segment A");
        
        // Exibindo informações do segmento
        System.out.println("Segment ID: " + segment1.getId());
        System.out.println("Segment Description: " + segment1.getDescription());
    }
}
