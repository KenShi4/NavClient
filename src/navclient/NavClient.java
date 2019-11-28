/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class NavClient {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
public static void main(String[] args) throws IOException {
        String ip;
        do {
            System.out.println("Inserisci l'indirizzo ip o il dominio del server");
            Scanner input = new Scanner(System.in);
            ip = input.nextLine();
 
            try (Socket socket = new Socket(ip, 4444)) {
                ClientGame cg = new ClientGame(socket);
                
            } catch (Exception e) {
                System.out.println("Ip errato!");
            } finally {
                System.out.println("Gioco finito!");
            }
        } while (true);
                }
    }