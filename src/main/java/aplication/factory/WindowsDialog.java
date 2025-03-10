package aplication.factory;

import aplication.buttons.Button;
import aplication.buttons.WindowsButton;
import aplication.checkboxes.Checkbox;
import aplication.checkboxes.WindowsCheckbox;

public class WindowsDialog extends Dialog {

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}