public class Addresses {
    // Atributos da classe Addresses
    private int id; // Chave primária (PK)
    private String zipcode;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private int number;
    private String complement;

    // Construtor da classe Addresses
    public Addresses(int id, String zipcode, String state, String city, String neighborhood, String street, int number, String complement) {
        this.id = id;
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.complement = complement;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    // Método para exibir informações do endereço
    public void displayAddressInfo() {
        System.out.println("ID: " + id);
        System.out.println("Zipcode: " + zipcode);
        System.out.println("State: " + state);
        System.out.println("City: " + city);
        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("Street: " + street);
        System.out.println("Number: " + number);
        System.out.println("Complement: " + complement);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Addresses
        Addresses address1 = new Addresses(1, "12345-678", "State X", "City Y", "Neighborhood Z", "Street A", 123, "Apt 101");
        
        // Exibindo informações do endereço
        address1.displayAddressInfo();
    }
}
