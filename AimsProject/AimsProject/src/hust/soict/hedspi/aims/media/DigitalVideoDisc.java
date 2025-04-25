package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    // Constructor cho DigitalVideoDisc kế thừa từ Media
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);  // Gọi constructor của Media
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost);  // Gọi constructor của Media
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);  // Gọi constructor của Media
        this.director = director;
        this.length = length;
    }

    // Getter và Setter cho director và length
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Phương thức toString sẽ in thông tin của DigitalVideoDisc, bao gồm director và length
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + director + " - " + length + " mins: " + getCost() + " $";
    }
}
