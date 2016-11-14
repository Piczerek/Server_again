import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	
	
	public static void main(String[] args){
		
		try {
			Socket socket = new Socket("127.0.0.1", 47682);
			//Socket socket = new Socket("127.0.0.1", 6);
			Window window=new Window();
			
			ClientSender clientsender =new ClientSender(socket, window);
			clientsender.start();
			ClientReceiver clientreceiver = new ClientReceiver(socket, window);
			clientreceiver.start();
			
			
			
			
			
			
			
			
			
			
		
		} catch (UnknownHostException e) {
			System.out.println("system poszedl w pizdziec");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
