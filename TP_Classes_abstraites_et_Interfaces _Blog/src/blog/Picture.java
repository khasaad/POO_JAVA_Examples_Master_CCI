package blog;

public class Picture extends AbstractItem {
	
	private String URL;

	public Picture(long datePublication, String author, String URL) {
		super(datePublication, author);
		this.URL=URL;
	}

	public String getURL() {
		return URL;
	}
	
	
	
	
	

}
