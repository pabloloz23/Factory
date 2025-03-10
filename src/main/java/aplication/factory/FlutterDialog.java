package aplication.factory;

import aplication.buttons.Button;
import aplication.buttons.FlutterButton;
import aplication.checkboxes.Checkbox;

public class FlutterDialog extends Dialog {

    @Override
    public Checkbox createCheckbox() {
        return null;
    }

    @Override
    public Button createButton() {
        return new FlutterButton();
    }
}
