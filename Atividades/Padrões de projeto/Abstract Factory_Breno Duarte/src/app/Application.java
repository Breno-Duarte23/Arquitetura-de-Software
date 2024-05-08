package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 * Os usu�rios da f�brica n�o se importam com qual f�brica concreta eles usam,
 * pois trabalham com f�bricas e produtos por meio de interfaces abstratas.
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