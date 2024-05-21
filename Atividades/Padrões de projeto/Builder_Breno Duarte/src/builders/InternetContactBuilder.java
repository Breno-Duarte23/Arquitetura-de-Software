package builders;
import components.InternetContact;

public class InternetContactBuilder implements Builder {
    private InternetContact contato;

    @Override
    public void construirContato(String nome, String endereco, String telefone, String email) {
        contato = new InternetContact(nome, email);
    }

    @Override
    public InternetContact obterContato() {
        return contato;
    }
}
