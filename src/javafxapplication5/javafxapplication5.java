//Created By (19100910 Yara Hesham Mohammed Elmowafy ),(19102301 Habiba Gehad Abd ELhakim),(19103591 Sarah Mohammed Mahfouz)

package javafxapplication5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 * 
 */

public class javafxapplication5 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }


    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)
   {
      DataBase.Visitor.Add("Yara", 4,"19100910", "011447945592", 1, 4, 2);
  
       launch(args);
  
  }
    
}
