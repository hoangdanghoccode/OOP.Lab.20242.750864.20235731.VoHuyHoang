package hust.soict.hedspi.aims.media;

public abstract class Media {

	public Media(int id, String title, String category, float cost) {
		this.id=id;
		this.title=title;
		this.category=category;
		this.cost=cost;
	}
     
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Media media = (Media)o;
		return this.title.equals(media.title);
	}
    
}
