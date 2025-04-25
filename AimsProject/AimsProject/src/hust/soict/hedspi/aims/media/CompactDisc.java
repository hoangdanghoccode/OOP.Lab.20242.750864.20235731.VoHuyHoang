package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private final String artist;
    private final ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    public int getLength() {
        int total = 0;
        for (Track t : tracks) total += t.getLength();
        return total;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + getTitle());
        System.out.println("Artist: " + artist);
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CompactDisc that = (CompactDisc) o;
        return this.artist.equals(that.artist);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + artist.toLowerCase().hashCode();
    }
}
