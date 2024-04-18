package factories;
import buttons.Button;
import checkboxes.Checkbox;

/**
 * A Abstract Factory conhece todos os tipos de produtos (abstratos)
 */

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}