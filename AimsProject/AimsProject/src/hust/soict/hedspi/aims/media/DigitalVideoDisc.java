package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " +
                getDirector() + " - " + getLength() + ": " + getCost() + " $";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DigitalVideoDisc that = (DigitalVideoDisc) o;
        return this.getLength() == that.getLength();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Integer.hashCode(getLength());
    }
}
