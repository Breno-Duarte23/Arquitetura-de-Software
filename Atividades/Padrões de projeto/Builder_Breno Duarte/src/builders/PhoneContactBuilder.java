package builders;
import components.PhoneContact;

public class PhoneContactBuilder implements Builder {
    private PhoneContact contato;

    @Override
    public void construirContato(String nome, String endereco, String telefone, String email) {
        contato = new PhoneContact(nome, telefone);
    }

    @Override
    public PhoneContact obterContato() {
        return contato;
    }
}
