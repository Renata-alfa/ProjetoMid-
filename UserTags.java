public class UserTags {
    // Atributos da classe UserTags
    private int id; // Chave primária (PK)
    private int tag_id; // Chave estrangeira (FK)
    private int user_id; // Outra chave estrangeira (FK)

    // Construtor da classe UserTags
    public UserTags(int id, int tag_id, int user_id) {
        this.id = id;
        this.tag_id = tag_id;
        this.user_id = user_id;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTagId() {
        return tag_id;
    }

    public void setTagId(int tag_id) {
        this.tag_id = tag_id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto UserTags
        UserTags userTag1 = new UserTags(1, 101, 1001);
        
        // Exibindo informações da tag do usuário
        System.out.println("UserTag ID: " + userTag1.getId());
        System.out.println("Tag ID: " + userTag1.getTagId());
        System.out.println("User ID: " + userTag1.getUserId());
    }
}
