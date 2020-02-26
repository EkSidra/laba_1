package sample;

        import java.net.URL;
        import java.util.ResourceBundle;

        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;
        import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField decimal;

    @FXML
    private Button button;

    @FXML
    private Text text;

    @FXML
    void initialize() {
        assert decimal != null : "fx:id=\"decimal\" was not injected: check your FXML file 'sample.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'sample.fxml'.";
        assert text != null : "fx:id=\"text\" was not injected: check your FXML file 'sample.fxml'.";
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String str=decimal.getText();
                try {
                    long numb = Long.parseLong(str);
                    String _number = Long.toBinaryString(numb);
                    text.setText(_number);
                }
                catch(NumberFormatException ex)
                {
                    text.setText("Ошибка ввода");
                }
            }
        });
    }

}


