package factories;

import buttons.AndroidButton;
import buttons.Button;
import checkboxes.AndroidCheckbox;
import checkboxes.Checkbox;

public class AndroidFactory implements GUIFactory{
	 @Override
	    public Button createButton() {
	        return new AndroidButton();
	    }

	    @Override
	    public Checkbox createCheckbox() {
	        return new AndroidCheckbox();
	    }
}
