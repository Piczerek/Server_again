import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerSender extends Thread{
	Socket socket;
	ObjectOutputStream oos;
	Message mess;
	String tekst;
	Scanner scaner;
	Window window;
	
	
	public ServerSender(Socket socket, Window window){

		this.socket = socket;
		this.window=window;
		scaner = new Scanner(System.in);
		
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void run(){
		System.out.println("gowno");
		while((tekst=scaner.nextLine())!=null)
		{
			mess=new Message(tekst);
			try {
				oos.writeObject(mess);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
