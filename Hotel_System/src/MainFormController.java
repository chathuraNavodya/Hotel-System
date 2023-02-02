import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;

public class MainFormController {
    public TextField UserName;
    public TextField Password;
    public PasswordField PasswordId;

    public void signUpButtonAnAction(ActionEvent actionEvent) throws IOException {

        if (UserName.getText().equals("R") && PasswordId.getText().equals("1234")) {

            Parent root = FXMLLoader.load(getClass().getResource("Reception2From.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (UserName.getText().equals("") && PasswordId.getText().equals("")) {

            Parent root = FXMLLoader.load(getClass().getResource("ScondForm.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }
}