public class Companies {
    // Atributos da classe Companies
    private int id; // Chave primária (PK)
    private String code; // Restrição UNIQUE
    private String company_name;
    private String fantasy_name;

    // Construtor da classe Companies
    public Companies(int id, String code, String company_name, String fantasy_name) {
        this.id = id;
        this.code = code;
        this.company_name = company_name;
        this.fantasy_name = fantasy_name;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    public String getFantasyName() {
        return fantasy_name;
    }

    public void setFantasyName(String fantasy_name) {
        this.fantasy_name = fantasy_name;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Companies
        Companies company1 = new Companies(1, "ABC123", "Company ABC", "Fantasy ABC");
        
        // Exibindo informações da empresa
        System.out.println("Company ID: " + company1.getId());
        System.out.println("Company Code: " + company1.getCode());
        System.out.println("Company Name: " + company1.getCompanyName());
        System.out.println("Fantasy Name: " + company1.getFantasyName());
    }
}
