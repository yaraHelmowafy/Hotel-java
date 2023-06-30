/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */


public class Server extends Application 
{ ServerSocket SS ;
      TextField text =new   TextField();
       static final int myPort = 55555;
      @Override
      public void start(Stage server)  {
       Pane pane = new Pane();
       text.setPrefHeight(800);
       text.setPrefWidth(800);
       text.setDisable(true);
       pane.getChildren().add(text);
       Scene scene =new Scene (pane,500,500);
       server.setTitle("Welcom to prism server");
       server.setScene(scene);
       server.show();
        Thread SocketServerTH = new Thread (new SocketServer());
        SocketServerTH.start();
      }
    public static void main(String[] args){ launch(args);}  

    private class SocketServer extends Thread
    {
       static final int myPort = 55555;
        int clientNo=0;
          @Override
        public void run()
        {
        try
        {   Socket s=null;
            ServerSocket ss = new ServerSocket(myPort);
             text.setText("Wating Connection on port "+myPort);
            while (true)
            {
                ss.accept();
                clientNo++;
            
                Thread acceptTH= new Thread(new HandleClient(s,clientNo));
                acceptTH.start();
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }}

   private class HandleClient implements Runnable
    {
        Socket s=null;
        int clientNo;
        DataInputStream dataIn;
        DataOutputStream dataOut;
        HandleClient(Socket s, int clientNo)
        {
            this.s = s;
            this.clientNo = clientNo;
        }

        @Override
        public void run()
        {
            try
            {
               dataIn= new DataInputStream(s.getInputStream());
               text.setText("");
               text.setText(text.getText()+"\n Client num : "+clientNo+"\n UserName: "+dataIn.readUTF()+
                       "\n PassCode"+dataIn.readUTF());
               SS = new ServerSocket(myPort);
              
               
                 
            }
            
            catch (IOException e)
            {
                System.out.println(e);
            }

        }
   }}

