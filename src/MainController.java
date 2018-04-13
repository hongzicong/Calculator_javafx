import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button Button_plus;

    @FXML
    private Button Button_minus;

    @FXML
    private Button Button_times;

    @FXML
    private Button Button_divide;

    @FXML
    private Button Button_get;

    @FXML
    private Button Button_clear;

    @FXML
    private Label Label_result;

    @FXML
    private Label Label_operator;

    @FXML
    private TextField TextField_A;

    @FXML
    private TextField TextField_B;

    @FXML
    public void Button_plus_onClick(ActionEvent event){
        Label_operator.setText("+");
    }

    @FXML
    public void Button_minus_onClick(ActionEvent event){
        Label_operator.setText("-");
    }

    @FXML
    public void Button_times_onClick(ActionEvent event){
        Label_operator.setText("×");
    }

    @FXML
    public void Button_get_onClick(ActionEvent event){
        double a = Double.parseDouble(TextField_A.getText());
        double b = Double.parseDouble(TextField_B.getText());
        double result = 0;
        switch (Label_operator.getText()){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "×":
                result = a * b;
                break;
            case "÷":
                result = a / b;
                break;
        }
        Label_result.setText(""+result);
    }

    @FXML
    public void Button_divide_onClick(ActionEvent event){
        Label_operator.setText("÷");
    }

    @FXML
    public void Button_clear_onClick(ActionEvent event){
        TextField_A.setText("");
        TextField_B.setText("");
        Label_result.setText("");
    }


}
