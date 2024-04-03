public class Company_Segment {
    // Atributos da classe Company_Segment
    private int id; // Chave primária (PK)
    private int segment_id; // Chave estrangeira (FK)
    private int company_id; // Outra chave estrangeira (FK)

    // Construtor da classe Company_Segment
    public Company_Segment(int id, int segment_id, int company_id) {
        this.id = id;
        this.segment_id = segment_id;
        this.company_id = company_id;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSegmentId() {
        return segment_id;
    }

    public void setSegmentId(int segment_id) {
        this.segment_id = segment_id;
    }

    public int getCompanyId() {
        return company_id;
    }

    public void setCompanyId(int company_id) {
        this.company_id = company_id;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Company_Segment
        Company_Segment companySegment1 = new Company_Segment(1, 101, 2001);
        
        // Exibindo informações do relacionamento segmento-empresa
        System.out.println("CompanySegment ID: " + companySegment1.getId());
        System.out.println("Segment ID: " + companySegment1.getSegmentId());
        System.out.println("Company ID: " + companySegment1.getCompanyId());
    }
}
