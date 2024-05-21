import director.Director;
import builders.FullContactBuilder;
import builders.InternetContactBuilder;
import builders.PhoneContactBuilder;

import components.FullContact;
import components.InternetContact;
import components.PhoneContact;

public class Teste {
    public static void main(String[] args) {
        Director director = new Director(new InternetContactBuilder());
        director.construirContato("Adriano", "", "", "Adriano@email.com");
        InternetContact contatoInternet = (InternetContact) director.obterContato();
        System.out.println(contatoInternet);

        director = new Director(new PhoneContactBuilder());
        director.construirContato("Breno", "", "794864988", "");
        PhoneContact contatoTelefone = (PhoneContact) director.obterContato();
        System.out.println(contatoTelefone);

        director = new Director(new FullContactBuilder());
        director.construirContato("Andre", "Rua L", "548618861", "Andre@email.com");
        FullContact contatoCompleto = (FullContact) director.obterContato();
        System.out.println(contatoCompleto);
    }
}
