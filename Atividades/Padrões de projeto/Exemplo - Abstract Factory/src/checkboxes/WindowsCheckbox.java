package checkboxes;

/**
 * Todos as fam�lias de produtos tem as mesmas variedades (MacOS/Windows/Linux).
 *
 * Esta � uma variante de checkbox.
 */

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Voc� criou um checkbox no Windows.");
    }
}