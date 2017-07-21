/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketclient;

/**
 *
 * @author Jeffrey
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
public class SocketClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String serverAddress = JOptionPane.showInputDialog(
                "Enter the IP Address of the machine with the response you want", "127.0.0.1");
        Socket s = new Socket(serverAddress, 13000);
        String userMessage = JOptionPane.showInputDialog(
                "What do you want to say?" );
        PrintWriter out = 
                new PrintWriter(s.getOutputStream(), true);
        out.println(userMessage);
        BufferedReader input = 
                new BufferedReader(new InputStreamReader(s.getInputStream()));
        String answer = input.readLine();
        JOptionPane.showMessageDialog(null, answer);
        s.close();
        System.exit(0);
    }
    
}
