package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller
{
    @FXML
    TextArea txtArea;
    @FXML
    TextField txtField;

    public void Submit(MouseEvent mouseEvent)
    {
        String txt;
        int index=0;
        txt = txtField.getText();
        index = txt.length();
        txtArea.setText("number of index: "+String.valueOf(index) + "\nfirst char is  "+txt.charAt(0));
    }
}
