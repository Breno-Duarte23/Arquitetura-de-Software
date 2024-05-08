package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 * Os usuários da fábrica não se importam com qual fábrica concreta eles usam,
 * pois trabalham com fábricas e produtos por meio de interfaces abstratas.
 */

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}