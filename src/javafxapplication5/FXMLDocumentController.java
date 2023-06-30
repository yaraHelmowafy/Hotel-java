//Created By (19100910 Yara Hesham Mohammed Elmowafy ),(19102301 Habiba Gehad Abd ELhakim),(19103591 Sarah Mohammed Mahfouz)
package javafxapplication5;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    TextField usernameLB,VisitorName,Residence,NationalID,NumberOfRooms,Phone,Deposite,TotalAmount;

   @FXML
    PasswordField passwordLB;
    
    @FXML
   CheckBox rm;
    
   @FXML
    Button loginBTN, GOOGLE,FACEBOOK,Add,Done,AddNewCustomer,SignOut;
      
    @FXML
    Label label;
    
  

    
   @FXML
  public void handLoginAction(ActionEvent event) throws IOException
    {
        System.out.println("You Loged in !");
        Parent formview = FXMLLoader.load(getClass().getResource("FXMLDocument_1.fxml"));
        Scene formviewScene = new Scene(formview);
        Stage form = (Stage)((Node) event.getSource()).getScene().getWindow();
        form.setScene(formviewScene);
        form.show();
    }
    @FXML
   public void LoginWithGoogle(ActionEvent event) throws IOException
    {
          System.out.println("You successfully loged in with google!");
          Parent formview = FXMLLoader.load(getClass().getResource("FXMLDocument_1.fxml"));
          Scene formviewScene = new Scene(formview);
          Stage form = (Stage)((Node) event.getSource()).getScene().getWindow();
          form.setScene(formviewScene);
          form.show();
    }
    @FXML
     public void LoginWithFaceBook(ActionEvent event) throws IOException
    {
          System.out.println("You successfully loged in with FaceBook!");
          Parent formview = FXMLLoader.load(getClass().getResource("FXMLDocument_1.fxml"));
          Scene formviewScene = new Scene(formview);
          Stage form = (Stage)((Node) event.getSource()).getScene().getWindow();
          form.setScene(formviewScene);
          form.show();
    }
     @FXML
       public void Data(ActionEvent event) 
    {
           String Name =VisitorName.getText();
           String VisitorResidence =Residence.getText();
           String VisitorPhone=Phone.getText();
           String RoomsNumber =NumberOfRooms.getText();
           String VisitorDeposite =Deposite.getText();
           String Total =TotalAmount.getText();
           //DataBase.Visitor.Add(Name, VisitorResidence, VisitorPhone, RoomsNumber, VisitorDeposite, Total, Total);
      
    }
       @FXML
       public void ADDING(ActionEvent event)
    {
        System.out.println("You Just Added New Customer !");
         String Name =VisitorName.getText();
           String VisitorResidence =Residence.getText();
           String VisitorPhone=Phone.getText();
           String RoomsNumber =NumberOfRooms.getText();
           String VisitorDeposite =Deposite.getText();
           String Total =TotalAmount.getText();
           System.out.println(Name + VisitorResidence);
           //DataBase.Visitor.Add(Name, VisitorResidence, VisitorPhone, RoomsNumber, VisitorDeposite, Total, Total);

        
    }
      
       @FXML
       public void CHECK(ActionEvent event) throws IOException
   {  
           System.out.println(" Done !");
           Parent Check = FXMLLoader.load(getClass().getResource("FXMLDocument_2.fxml"));
           Scene CheckScene = new Scene(Check);
           Stage CheckScreen = (Stage)((Node) event.getSource()).getScene().getWindow();
           CheckScreen.setScene(CheckScene);
           CheckScreen.show();
   }
           @FXML
       public void AddNewCustomer(ActionEvent event) throws IOException{
          Parent formview = FXMLLoader.load(getClass().getResource("FXMLDocument_1.fxml"));
          Scene formviewScene = new Scene(formview);
          Stage form = (Stage)((Node) event.getSource()).getScene().getWindow();
          form.setScene(formviewScene);
          form.show();
    }
           @FXML
        public void SignOut(ActionEvent event) throws IOException{
          Parent LoginPage = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
          Scene LogIn = new Scene(LoginPage);
          Stage log= (Stage)((Node) event.getSource()).getScene().getWindow();
          log.setScene(LogIn);
          log.show();
    }
   
       @Override
       public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    }
