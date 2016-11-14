import javax.swing.JFrame;

public class Window extends JFrame{
	
	Board board;
	
	public Window(){
		setTitle("aaaa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board= new Board();
		add(board);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
		//String mess;
		//mess=ClientReceiver.mess.getTekst();
	
	}
	public void showmessage(String string){
		board.showmessage(string);
	}
	public boolean isMessagetoSend(){
		return board.isMessagetoSend();
	}

	public String getMessagetoSend(){
		return board.getMessagetoSend();
	}
}
