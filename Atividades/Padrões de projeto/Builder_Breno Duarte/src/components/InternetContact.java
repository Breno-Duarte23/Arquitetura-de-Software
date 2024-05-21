package components;

public class InternetContact {
    private String nome;
    private String email;

    public InternetContact(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContatoInternet{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
