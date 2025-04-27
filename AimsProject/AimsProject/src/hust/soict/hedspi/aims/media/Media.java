package hust.soict.hedspi.aims.media;

public abstract class Media {

	public Media() {
		// TODO Auto-generated constructor stub
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

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

    
}
