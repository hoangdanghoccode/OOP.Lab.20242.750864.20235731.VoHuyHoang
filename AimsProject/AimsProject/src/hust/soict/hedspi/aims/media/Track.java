package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private final String title;
    private final int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + title);
        System.out.println("Track length: " + length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return this.length == track.length &&
               this.title.equalsIgnoreCase(track.title);
    }

    @Override
    public int hashCode() {
        return title.toLowerCase().hashCode() + Integer.hashCode(length);
    }
}
