package builders;
import components.FullContact;

public class FullContactBuilder implements Builder {
    private FullContact contato;

    @Override
    public void construirContato(String nome, String endereco, String telefone, String email) {
        contato = new FullContact(nome, endereco, telefone, email);
    }

    @Override
    public FullContact obterContato() {
        return contato;
    }
}