package aplication.factory;


import aplication.buttons.Button;
import aplication.buttons.HtmlButton;
import aplication.checkboxes.Checkbox;
import aplication.checkboxes.HtmlCheckbox;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Checkbox createCheckbox() {
        return new HtmlCheckbox();
    }

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}