package blog;

public class Video extends AbstractItem {
	
	private String URL;

	public Video(long datePublication, String author, String URL) {
		super(datePublication, author);
		this.URL=URL;
	}

	public String getURL() {
		return URL;
	}
	

}
