package components;

public class PhoneContact {
    private String nome;
    private String telefone;

    public PhoneContact(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ContatoTelefone{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
