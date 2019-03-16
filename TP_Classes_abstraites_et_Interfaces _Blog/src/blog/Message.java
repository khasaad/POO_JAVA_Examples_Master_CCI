package blog;

public class Message extends AbstractPublishableItem {
	
	private String message;

	public Message(long datePublication, String author, String message) {
		super(datePublication, author);
		this.message=message;
		
	}
	
	public String getContent(){
		return this.message;
	}

}
