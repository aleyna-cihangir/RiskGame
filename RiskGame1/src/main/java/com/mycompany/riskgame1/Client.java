
package com.mycompany.riskgame1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {
    public Socket socket;
    public ObjectInputStream cInput;
    public ObjectOutputStream cOutput;
    public String serverIp;
    public int serverPort;
    
    public void connect(String serverIp, int serverPort) {
        try {
            this.serverIp = serverIp;
            this.serverPort = serverPort;

            this.socket = new Socket(this.serverIp, this.serverPort);
            this.cOutput = new ObjectOutputStream(this.socket.getOutputStream());
            this.cInput = new ObjectInputStream(this.socket.getInputStream());
           
            this.cOutput.writeObject("merhaba");
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
