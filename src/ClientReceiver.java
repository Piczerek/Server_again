import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientReceiver extends Thread {
	
	Socket socket;
	ObjectInputStream ois;
	static Message mess;
	Window window;

	public ClientReceiver(Socket socket, Window window){
		this.socket=socket;
		this.window=window;
		try {
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void run(){
		
		try {
			while((mess=(Message)ois.readObject())!=null)
			{
				window.showmessage(mess.getTekst());
				
				
				
				
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
