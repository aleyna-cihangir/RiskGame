package com.mycompany.riskgame;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    ServerSocket socket;
    public ListenThread listenThread;
    public int port;
    public ArrayList<SClient> clients;

    public Server(int port) {

        try {
            // bağlanmayacak, bağlanılacak!
            this.port = port;
            this.socket = new ServerSocket(port); //socket oluşturuldu
            
            this.clients = new ArrayList<SClient>();

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } // bu soketi idnlemeye açmalıyız
    }

    public void ListenSocket() { // Bu kısmın içini kapattık. 
        this.listenThread = new ListenThread(this);
        this.listenThread.start(); // yeni bir iş yolu oluşturacak. 
        
    }
    

    public void SendBroadcastMessage(Object msg) {
        for (SClient client : clients) {
            try {
                client.cOutput.writeObject(msg);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    

}

class ListenThread extends Thread {

    private Server server;

    public ListenThread(Server socket) { //Yapıcı metot.
        this.server = server;
    }

    @Override
    public void run() {//Thread'den aldığımız run methodunu override ediyoruz.
        // Sürekli çalıştırma için döngü kurmalıyız : 
        while (!this.server.socket.isClosed()) {
            try {

                Socket nSocket = this.server.socket.accept();
                
                SClient nclient = new SClient(nSocket);
                nclient.Listen();
                this.server.clients.add(nclient);
                
//                ObjectInputStream cInput = new ObjectInputStream(nSocket.getInputStream());
//                ObjectOutputStream cOutput = new ObjectOutputStream(nSocket.getOutputStream());
//                Object msg = cInput.readObject();
//                System.out.println(msg.toString());
//
//                cOutput.writeObject("Merhaba, hoşgeldiniz. ");

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }

    }

}
