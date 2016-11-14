import java.io.Serializable;

public class Message implements Serializable {
	
	
	private String tekst;
	private int liczba;
	
	public Message(String tekst){
		this.tekst=tekst;
		
	}

	public String getTekst() {
		return tekst;
	}

	public int getLiczba(){
		return liczba;
		
	}
}
