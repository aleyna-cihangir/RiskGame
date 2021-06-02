package com.mycompany.riskgame;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SClient {
    public static int idCount;
    public int id;
    public static  Socket socket;
    ObjectInputStream cInput;
    ObjectOutputStream cOutput;
    public ClientListenThread listenThread;

    public SClient(Socket socket) {
        
        
        try {
            this.id=idCount;
            idCount++;
            this.socket = socket;
            this.cOutput = new ObjectOutputStream(this.socket.getOutputStream());
            this.cInput = new ObjectInputStream(this.socket.getInputStream());
            
            this.listenThread = new ClientListenThread(this);
            System.out.println("client connected");
        } catch (IOException ex) {
            Logger.getLogger(SClient.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    public void Sendmessage(Object msg){
        
        if (this.socket.isConnected()) {
            try {
                cOutput.writeObject(msg);
            } catch (IOException ex) {
                Logger.getLogger(SClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    public void Listen() {

        this.listenThread.start();
        System.out.println("client listening");


    }
    

}
class ClientListenThread extends Thread {

    private SClient client;

    public ClientListenThread(SClient client) {
        this.client = client;

    }

    @Override
    public void run() {
        while (!this.client.socket.isClosed()) {
            try {
                System.out.println("waiting message from client");
                Object msg = this.client.cInput.readObject(); // blocking method | waiting message
                System.out.println(msg.toString());
                FrmServer.clientMessagesModel.addElement(msg);

            } catch (IOException ex) {
                Logger.getLogger(ClientListenThread.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClientListenThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
