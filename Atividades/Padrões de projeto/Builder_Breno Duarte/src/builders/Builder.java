package builders;

public interface Builder {
    void construirContato(String nome, String endereco, String telefone, String email);
    Object obterContato();
}
