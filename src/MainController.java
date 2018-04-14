import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label label_result;

    @FXML
    private Label label_operator;

    @FXML
    private TextField TextField_A;

    @FXML
    private TextField TextField_B;

    @FXML
    public void button_plus_onClick(ActionEvent event){
        label_operator.setText("+");
    }

    @FXML
    public void button_minus_onClick(ActionEvent event){
        label_operator.setText("-");
    }

    @FXML
    public void button_times_onClick(ActionEvent event){
        label_operator.setText("×");
    }

    @FXML
    public void button_get_onClick(ActionEvent event){
        try{
            double a = Double.parseDouble(TextField_A.getText());
            double b = Double.parseDouble(TextField_B.getText());
            double result = 0;
            switch (label_operator.getText()){
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
            label_result.setText(""+result);
        }catch (NumberFormatException numE){
            label_result.setText("Wrong Input");
        }
    }

    @FXML
    public void button_divide_onClick(ActionEvent event){
        label_operator.setText("÷");
    }

    @FXML
    public void button_clear_onClick(ActionEvent event){
        TextField_A.setText("");
        TextField_B.setText("");
        label_result.setText("");
    }


}
