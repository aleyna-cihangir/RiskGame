package com.mycompany.riskgame;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test_riskgame {

    public static void main(String[] args) {
        Server myServer = new Server(5000);
        myServer.ListenSocket();
        // artık elimizde iki adet yan yana çalışan thread var. 
        while (true) {
            System.out.println("buradayım.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Test_riskgame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
