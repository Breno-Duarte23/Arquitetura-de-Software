/* C�digo baseado no site https://refactoring.guru/pt-br/design-patterns/abstract-factory/java/example#example-0 */

import app.Application;
import factories.AndroidFactory;
import factories.GUIFactory;
import factories.LinuxFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/**
 * Classe de teste. Aqui h� a uni�o de tudo
 */

public class Teste {

    /**
     * O aplicativo escolhe o tipo de f�brica e cria em tempo de execu��o,
     * dependendo da configura��o ou das vari�veis ambiente.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        //String osName = System.getProperty("os.name").toLowerCase();
        String osName = "android";
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else if (osName.contains("windows")) {
            factory = new WindowsFactory();
            app = new Application(factory);
        }else if (osName.contains("linux")){
        	factory = new LinuxFactory();
            app = new Application(factory);
        } else {
        	factory = new AndroidFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
