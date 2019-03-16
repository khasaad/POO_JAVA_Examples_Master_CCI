package blog;

import java.util.List;

public interface BlogService {
	
	public String getTitle();
	public void post(Publishable billet);
	public List<Publishable> getItems();
	public int getPublishableItemsCount();
	public int getTaggableItemsCount();
	public List<Publishable> findItemsByAuthor(String author);
	public Publishable getLatestItem();
	public List<Publishable> findItemsByTags(String tag[]);
	public List<Publishable> findItemsByContent(String tag[]);
	public List<Publishable> findItemsByTagsOrContent(String tag[]);

}
