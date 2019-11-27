/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navclient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class ClientGame {
    private final Socket socket;
       public ClientGame(Socket socket) throws IOException {
           Scanner in = new Scanner(socket.getInputStream());
           PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        this.socket = socket;}
}
