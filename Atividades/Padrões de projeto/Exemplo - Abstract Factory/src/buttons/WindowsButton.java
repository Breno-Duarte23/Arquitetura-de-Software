package buttons;

/**
 * Todos as famílias de produtos tem as mesmas variedades (MacOS/Windows/Linux).
 *
 * Esta é uma variante de botão.
 */

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Você criou um botão do Windows.");
    }
}