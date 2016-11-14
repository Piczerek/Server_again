import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread {
	
	String tekst;
	Scanner scaner;
	Message mess;
	ObjectOutputStream oos;
	Socket socket;
	Window window;
	
	

	public ClientSender (Socket socket, Window window){
		this.socket=socket;
		this.window=window;
		scaner = new Scanner(System.in);
		
		
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	/*public void send(){
		mess = new Message(window.getMessagetoSend());
		try {
			oos.writeObject(mess);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	public void run() {

		//System.out.println("gowno");
		while(true)
		{
			if(window.isMessagetoSend()==true){
				System.out.println("sahdjajhdjhds");
				mess = new Message(window.getMessagetoSend());
				try {
					oos.writeObject(mess);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		
			
			
					
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	

}
