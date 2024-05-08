package factories;
import buttons.Button;
import buttons.LinuxButton;
import checkboxes.Checkbox;
import checkboxes.LinuxCheckbox;

/**
 * Cada f�brica concreta estende a f�brica b�sica e � respons�vel por criar 
 * produtos de uma �nica variedade
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