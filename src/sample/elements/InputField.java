package sample.elements;

import javafx.scene.control.TextField;

public class InputField {
    private TextField inputField = new TextField();

    public InputField(String x) {
        inputField.setText(x);
    }

    public InputField() {

    }

    public TextField getInputField() {
        return inputField;
    }

    public void setInputField(String x) {
        inputField.setText(x);
    }
}
