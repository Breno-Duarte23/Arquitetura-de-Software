package checkboxes;

/**
 * Todos as famílias de produtos tem as mesmas variedades (MacOS/Windows/Linux).
 *
 * Esta é uma variante de checkbox.
 */

public class LinuxCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Você criou um checkbox no Linux.");
    }
}