package buttons;

/**
 * Todos as fam�lias de produtos tem as mesmas variedades (MacOS/Windows/Linux).
 *
 * Esta � uma variante de bot�o.
 */

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Voc� criou um bot�o do Windows.");
    }
}