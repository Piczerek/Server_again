import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Board extends JPanel {
	
	
	
	protected final static int BOARD_WIDTH_PIX=600;
	protected final static int BOARD_HEIGHT_PIX=800;
	JTextArea text;
	JTextArea typingfield;
	StringBuilder messages;
	JButton sendButton;
	volatile boolean isMessagetoSend = false;
	//Vector<String> messages;

	public Board(){
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		setPreferredSize(new Dimension(BOARD_WIDTH_PIX, BOARD_HEIGHT_PIX ));
		
		messages=new StringBuilder();
		
		text=new JTextArea("ajhjhsa");
		text.setEditable(false);
		text.setBounds(10, 10, 600, 600);
		text.setLineWrap(true);
		
		typingfield=new JTextArea();
		typingfield.setBounds(10, 10, 600, 200);
		typingfield.setLineWrap(true);
		
		sendButton=new JButton("SEND");
		sendButton.addActionListener(new ListenerForButton());
		
		
		add(text);
		add(typingfield);
		add(sendButton);
		
		
		
	}
	
	
	public void paint(Graphics g){
		super.paint(g);
	}
	
	
	
	public void showmessage(String string){
		messages.append(string+"\n");
		text.setText(messages.toString());
		repaint();
		
	}
	
	
	private class ListenerForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==sendButton)
			{
			isMessagetoSend=true;
			text.setText(getMessagetoSend());
			}
			
		}
		
	}
	public boolean isMessagetoSend(){
		if (isMessagetoSend==true)
		{
			isMessagetoSend=false;
			return true;
		}
		else
		{
			return false;
		}
	}
	public String getMessagetoSend(){
		return "kupeczka";
	}
	
}
