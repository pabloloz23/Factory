package aplication;

import aplication.factory.Dialog;
import aplication.factory.HtmlDialog;
import aplication.factory.WindowsDialog;
import aplication.factory.AppleDialog;
import aplication.factory.FlutterDialog;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            dialog = new WindowsDialog();
        } else if (System.getProperty("os.name").equals("MacOS")) {
            dialog = new AppleDialog();
        } else {
            dialog = new HtmlDialog();
        }


    }

    /**
     * All the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}