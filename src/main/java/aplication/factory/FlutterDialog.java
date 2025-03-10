package aplication.factory;

import aplication.buttons.Button;
import aplication.buttons.FlutterButton;

public class FlutterDialog extends Dialog {

    @Override
    public Button createButton() {
        return new FlutterButton();
    }
}
