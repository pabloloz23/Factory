package aplication.factory;

import aplication.buttons.AppleButton;
import aplication.buttons.Button;

public class AppleDialog extends Dialog {

    @Override
    public Button createButton() {
        return new AppleButton();
    }
}
