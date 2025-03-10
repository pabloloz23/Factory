package aplication.factory;

import aplication.buttons.Button;
import aplication.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}