public class UserCompanies {
    // Atributos da classe UserCompanies
    private int id; // Chave primária (PK)
    private int user_id; // Chave estrangeira (FK)
    private int company_id; // Chave estrangeira (FK)

    // Construtor da classe UserCompanies
    public UserCompanies(int id, int user_id, int company_id) {
        this.id = id;
        this.user_id = user_id;
        this.company_id = company_id;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public int getCompanyId() {
        return company_id;
    }

    public void setCompanyId(int company_id) {
        this.company_id = company_id;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto UserCompanies
        UserCompanies userCompany1 = new UserCompanies(1, 1001, 2001);
        
        // Exibindo informações do relacionamento usuário-empresa
        System.out.println("UserCompany ID: " + userCompany1.getId());
        System.out.println("User ID: " + userCompany1.getUserId());
        System.out.println("Company ID: " + userCompany1.getCompanyId());
    }
}
