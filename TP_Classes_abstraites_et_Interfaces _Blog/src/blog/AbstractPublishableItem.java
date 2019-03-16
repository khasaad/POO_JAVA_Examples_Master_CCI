package blog;

public abstract class AbstractPublishableItem implements Publishable {
        
	private long datePublication;
	private String author;
	
	
	
	public AbstractPublishableItem(long datePublication, String author) {
		super();
		this.datePublication = datePublication;
		this.author = author;
	}


	public long getPublicationDate() {
		
		return datePublication;
	}

	
	public String getAuthor() {
		
		return author;
	}

}
