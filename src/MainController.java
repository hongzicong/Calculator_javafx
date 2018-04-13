import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button Button1;

    @FXML
    private Button Button2;

    @FXML
    private Button Button3;

    @FXML
    private Button Button4;

    @FXML
    private Button Button5;

    @FXML
    private Button Button6;

    @FXML
    private Button Button7;

    @FXML
    private Button Button8;

    @FXML
    private Button Button9;

    @FXML
    private Button Button0;

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

    private boolean isATurn = true;

    @FXML
    public void Button1_onClick(ActionEvent event){
        TextField tempField = TextField_A;
        if (TextField_B.isPressed()){
            tempField = TextField_B;
        }
        tempField.setText(tempField.getText() + "1");
    }

    @FXML
    public void Button2_onClick(ActionEvent event){
        TextField tempField = TextField_A;
        if (!isATurn){
            tempField = TextField_B;
        }
        tempField.setText(tempField.getText() + "2");
    }

    @FXML
    public void Button3_onClick(ActionEvent event){
        TextField tempField = TextField_A;
        if (!isATurn){
            tempField = TextField_B;
        }
        tempField.setText(tempField.getText() + "3");
    }

    @FXML
    public void Button4_onClick(ActionEvent event){
        TextField tempField = TextField_A;
        if (!isATurn){
            tempField = TextField_B;
        }
        tempField.setText(tempField.getText() + "4");
    }

    @FXML
    public void Button5_onClick(ActionEvent event){
        TextField tempField = TextField_A;
        if (!isATurn){
            tempField = TextField_B;
        }
        tempField.setText(tempField.getText() + "5");
    }

    @FXML
    public void Button6_onClick(ActionEvent event){
        TextField tempField = TextField_A;
        if (!isATurn){
            tempField = TextField_B;
        }
        tempField.setText(tempField.getText() + "6");
    }

    @FXML
    public void Button7_onClick(ActionEvent event){
        TextField tempField = TextField_A;
        if (!isATurn){
            tempField = TextField_B;
        }
        tempField.setText(tempField.getText() + "7");
    }

    @FXML
    public void Button8_onClick(ActionEvent event){
        TextField tempField = TextField_A;
        if (!isATurn){
            tempField = TextField_B;
        }
        tempField.setText(tempField.getText() + "8");
    }

    @FXML
    public void Button9_onClick(ActionEvent event){
        TextField tempField = TextField_A;
        if (!isATurn){
            tempField = TextField_B;
        }
        tempField.setText(tempField.getText() + "9");
    }

    @FXML
    public void Button0_onClick(ActionEvent event){
        TextField tempField = TextField_A;
        if (!isATurn){
            tempField = TextField_B;
        }
        tempField.setText(tempField.getText() + "0");
    }

    @FXML
    public void TextFieldA_onClick(ActionEvent event){
        System.out.print(1);
        isATurn = true;
    }

    @FXML
    public void TextFieldB_onClick(ActionEvent event){
        System.out.print(1);
        isATurn = false;
    }

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
    }

    @FXML
    public void Button_divide_onClick(ActionEvent event){
        Label_operator.setText("÷");
    }

    @FXML
    public void Button_clear_onClick(ActionEvent event){
        TextField_A.setText("");
        TextField_B.setText("");
    }


}
