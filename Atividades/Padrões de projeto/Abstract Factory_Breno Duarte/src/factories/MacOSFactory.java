package factories;
import buttons.Button;
import buttons.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

/**
 * Cada fábrica concreta estende a fábrica básica e é responsável por criar 
 * produtos de uma única variedade
 */

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}