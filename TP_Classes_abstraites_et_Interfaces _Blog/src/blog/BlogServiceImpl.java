package blog;

import java.util.ArrayList;
import java.util.List;

public class BlogServiceImpl implements BlogService {

	private String title;
	private List<Publishable> items;
	
	
	public BlogServiceImpl(String title) {
		super();
		this.title = title;
		this.items = new ArrayList<Publishable>();
	}


	public String getTitle() {
		
		return this.title;
	}

	
	public void post(Publishable billet) {
	
		if(billet!=null)
			this.items.add(billet);
	}

	
	public List<Publishable> getItems() {
		
		return this.items;
	}

	
	public int getPublishableItemsCount() {
		
		return this.items.size();
	}

	
	public int getTaggableItemsCount() {
		
		int nbt=0;
		for(Publishable p : this.items){
			if(p instanceof Taggable)
				nbt++;
		}
	
			return nbt ;
	}


	public List<Publishable> findItemsByAuthor(String author) {
		
		List<Publishable>  result = new ArrayList<Publishable>();
		for(Publishable p : this.items){
			if(p.getAuthor().compareToIgnoreCase(author)==0)
				result.add(p);
		}
		return result ;
	}

	
	public Publishable getLatestItem() {
		
		if(items.size()==0)
        return null;
		Publishable Latest = items.get(0);
		for( Publishable p : items){
			if(p.getPublicationDate()>Latest.getPublicationDate())
				Latest=p;
		}
		
		return Latest;
	}


	public List<Publishable> findItemsByTags(String[] tag) {
		
		List<Publishable>  result = new ArrayList<Publishable>();
		for (Publishable p : items){
			if(p instanceof Taggable){
				boolean containsall = true;
			
			for ( String s : tag){
				if(!((Taggable)p).getTags().contains(s)){
					containsall = false;
					break;
				}
			}
			if(containsall)
				result.add(p);	
			}
		}
	return result;
	}

	
	public List<Publishable> findItemsByContent(String[] tag) {
		
		List<Publishable>  result = new ArrayList<Publishable>();
		for (Publishable p : items){
			if(p instanceof Message){
				boolean containsall = true;
			
			for ( String s : tag){
				if(((Message)p).getContent().indexOf(s)==-1){
					containsall = false;
					break;
				}
			}
			if(containsall)
				result.add(p);	
			}
		}
	return result;
		
	}

	
	public List<Publishable> findItemsByTagsOrContent(String[] tag) {
		
		List<Publishable> result = findItemsByTags(tag);
		result.addAll(findItemsByContent(tag));
		return result;
	}

}
