/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

/**
 *
 * @author Dell
 */


public class Client extends Application 
{ 
     TextField Username =new   TextField();
        PasswordField Passcode =new  PasswordField();
       static final int myPort = 55555;
      @Override
      public void start(Stage Client)  {
       
       GridPane pane = new GridPane();
       pane.setAlignment(Pos.CENTER);
       pane.setVgap(15);
       pane.setHgap(15);
       
       pane.setPadding(new Insets(15));
       
       Label SignUp = new Label("SignUp");
       pane.add(SignUp, 0, 0);
       Label User = new Label("UserName");
       pane.add(User, 1, 1);
       pane.add(Username, 2, 1);
       Label PASS = new Label("PassCode");
       pane.add(PASS, 1, 2);
       pane.add(Passcode, 2, 2);
       Button Sign =new Button("SignUp");
       pane.add(Sign,2,4);
               
       Sign.setOnAction(new Handeler());
       Scene scene = new Scene(pane,500,500);
       Client.setTitle("Welcom to prism Client");
       Client.setScene(scene);
       Client.show();
       
      }
    public static void main(String[] args){ launch(args);}  

    class Handeler implements EventHandler <ActionEvent>
    {
       
        @Override
        public void handle(ActionEvent event)
        { 
           RunnableClient runClient = new RunnableClient();
           new Thread(runClient);
           runClient.start();
            
        }

        
    }
    private class RunnableClient extends Thread
    {    Socket s=null;
       static final int myPort = 55555;
        int clientNo=0;
          @Override
        public void run()
        {
        try
        { 
            try (DataOutputStream dataOut = new DataOutputStream(s.getOutputStream())) {
                dataOut.writeUTF(Username.getText().toString());
                dataOut.writeUTF(Passcode.getText().toString());
                dataOut.flush();
            }
           s.close();
            
        }  catch (IOException ex) {
               Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
           }
       
    }}}

   