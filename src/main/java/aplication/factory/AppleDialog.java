package aplication.factory;

import aplication.buttons.AppleButton;
import aplication.buttons.Button;
import aplication.checkboxes.Checkbox;

public class AppleDialog extends Dialog {

    @Override
    public Checkbox createCheckbox() {
        return null;
    }

    @Override
    public Button createButton() {
        return new AppleButton();
    }
}
