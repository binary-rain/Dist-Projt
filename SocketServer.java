/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketserver;

/**
 *
 * @author Jeffrey
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class SocketServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       ServerSocket listener = new ServerSocket(13000);
        try {
            while(true) {
                Socket socket = listener.accept();
                System.out.println("working");
                try {
                    System.out.println("working");
                    BufferedReader input =
                            new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String answer = input.readLine();
                    if(answer.equals("Hi there")) {
                        PrintWriter out = 
                            new PrintWriter(socket.getOutputStream(), true);
                        out.println("Back at ya");
                    }
                    else {
                        PrintWriter out =
                            new PrintWriter(socket.getOutputStream(), true);
                        out.println("I don't know you");
                    }
                }
                finally {
                    socket.close();
                }
            }
        }
        finally{
            listener.close();
        }
    }
}
