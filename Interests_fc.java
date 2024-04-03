import java.util.ArrayList;
import java.util.List;

public class Interests_fc {
    public static void main(String[] args) {
        // Exemplo de chamada da função Interests_fc com argumentos
        Interests_fc(201);
    }

    // Aqui é passado para a função a área de interesse para ser comparada na lista e fazer outra lista
    public static void Interests_fc(int tagDescriptionToFind) {
        // Simulando uma lista de usuários
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Renata", "Renata@example.com", "password123", 101));
        userList.add(new User(2, "Levy", "levy@example.com", "password456", 102));
        userList.add(new User(3, "Hugo", "Hugo@example.com", "password789", 101));
        userList.add(new User(4, "Lucas", "Lucas@example.com", "password333", 201));
        userList.add(new User(5, "Luiz", "Luiz@example.com", "password446", 202));
        userList.add(new User(6, "Bruno", "Bruno@example.com", "password799", 201));

        // Lista para armazenar os usuários que possuem o mesmo interesse (tag) com a descrição desejada
        List<User> usersWithDesiredInterest = new ArrayList<>();

        // Correr a lista de usuários e verificar se possuem o mesmo interesse desejado
        for (int i = 0; i < userList.size(); i++) {
            User currentUser = userList.get(i);
            int currentUserInterest = currentUser.getInterestId();

            if (currentUserInterest == tagDescriptionToFind) {
                // Verificar se o interesse do usuário atual é igual ao de outro usuário
                for (int j = i + 1; j < userList.size(); j++) {
                    User otherUser = userList.get(j);
                    int otherUserInterest = otherUser.getInterestId();

                    if (currentUserInterest == otherUserInterest) {
                        // Se o interesse for igual, imprimir o nome do usuário e a descrição do interesse
                        System.out.println("Nome: " + currentUser.getName() + ", Interesse: " + getInterestName(tagDescriptionToFind));
                        System.out.println("Nome: " + otherUser.getName() + ", Interesse: " + getInterestName(tagDescriptionToFind));
                        System.out.println();
                    }
                }
            }
        }
    }

    // Função auxiliar para obter o nome do interesse com base no ID
    public static String getInterestName(int tagId) {
        // Simulando a busca do interesse na lista de interesses (tags)
        if (tagId == 101) {
            return "Recursos Humanos";
        } else if (tagId == 102) {
            return "Financeiro";
        } else if (tagId == 201) {
            return "Tecnologia da Informação";
        } else {
            return "Interesse não encontrado";
        }
    }
}

class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private int interestId;

    public User(int id, String name, String email, String password, int interestId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.interestId = interestId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getInterestId() {
        return interestId;
    }
}
