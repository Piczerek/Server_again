import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketImplFactory;

public class Server {

	public static void main(String[] args) {
		Socket socket;
		ObjectInputStream ois;
		ObjectOutputStream oos;
		Message mess;

		try {
			ServerSocket serverSocket= new ServerSocket(47682);
			socket = serverSocket.accept();
			Window window=new Window();
			ServerReceiver SR =new ServerReceiver(socket, window);
			SR.start();
			ServerSender SS= new ServerSender(socket, window);
			SS.start();
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			
		}
		

	}

}
