package hust.soict.hedspi.aims.media;

public class Disc extends Media {
      private int length;
      private String director;
      public Disc(int id, String title, String category, float cost, String dicrector) {
    	  super(id,title,category,cost);
		  this.director=director;
	  }
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	
}
