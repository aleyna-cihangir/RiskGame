
package com.mycompany.riskgame;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    ServerSocket socket;
    public int port;

    public Server(int port) {
        try {
            // bağlanmayacak, bağlanılacak!
            this.port = port;
            this.socket = new ServerSocket(port); //socket oluşturuldu
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } // bu soketi idnlemeye açmalıyız
    }

    public void ListenSocket() {
        try {
            
            Socket nClient = this.socket.accept(); // burada bekler socket = api+port
            // okumak için olan stream bu 
            ObjectInputStream cInput = new ObjectInputStream(nClient.getInputStream()); 
            // göndermek için olan stream
            ObjectOutputStream cOutput = new ObjectOutputStream(nClient.getOutputStream());
            Object msg = cInput.readObject();
            System.out.println(msg.toString());
             
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }










}



