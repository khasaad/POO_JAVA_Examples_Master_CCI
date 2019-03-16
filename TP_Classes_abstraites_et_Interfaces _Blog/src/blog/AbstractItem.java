package blog;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractItem extends AbstractPublishableItem implements Taggable {

	private List<String> tags;
	//private long datePublication;
	//private String author;
	
	public AbstractItem(long datePublication, String author) {
		super(datePublication, author);
		//this.datePublication=datePublication;
		//this.author=author;
		 tags = new ArrayList<String>();
	}


	public void addTag(String tag) {
		
		if(tag!=null && !tags.contains(tag))
			tags.add(tag);
	}

	
	public void removeTag(String tag) {
		tags.remove(tag);

	}

	
	public int tagCount() {
		
		return tags.size();
	}

	
	public List<String> getTags() {
		
		return tags;
	}

}
