/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jack
 */
public class GuiManagerController implements Initializable {

    @FXML
    private Button btnSignup;
    @FXML
    private Button btnEmpView;
    @FXML
    private Button btnFinanceView;
    @FXML
    private Button btnAddView;
    @FXML
    private Button btnUserView;
    @FXML
    private Button btnStart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openSignUpScreen(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/carrental/fxml/SignUp.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show(); 
        }

    @FXML
    private void openEmployeeScreen(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/carrental/fxml/EmpView.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show(); 
    }

    @FXML
    private void openFinanceScreen(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/carrental/fxml/FinanceView.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show(); 
    }

    @FXML
    private void openAddScreen(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/carrental/fxml/AddView.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show(); 
    }

    @FXML
    private void openUserScreen(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/carrental/fxml/UserView.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show(); 
    }

    @FXML
    private void openStartScreen(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/carrental/fxml/StartScreen.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show(); 
    }
    
}
