package director;
import builders.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construirContato(String nome, String endereco, String telefone, String email) {
        builder.construirContato(nome, endereco, telefone, email);
    }

    public Object obterContato() {
        return builder.obterContato();
    }
}
