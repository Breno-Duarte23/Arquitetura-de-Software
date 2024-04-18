package factories;
import buttons.Button;
import buttons.LinuxButton;
import checkboxes.Checkbox;
import checkboxes.LinuxCheckbox;

/**
 * Cada fábrica concreta estende a fábrica básica e é responsável por criar 
 * produtos de uma única variedade
 */

public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}