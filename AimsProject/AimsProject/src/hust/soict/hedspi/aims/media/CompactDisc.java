package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	public CompactDisc(int id, String title, String category, float cost, String dicrector,String artist) {
		super(id, title, category, cost, dicrector);
		this.artist=artist;
	}
	
     private String artist;
     private List<Track> tracks = new ArrayList<Track>();
     
	public String getArtist() {
		return artist;
	}
	
    public void addTrack(Track track) {
    	if(tracks.contains(track)) {
    		System.out.println("Track already exists.");
    	}
    	else {
    		tracks.add(track);
    	}
    }
    
    public void removeTrack(Track track) {
    	if(tracks.contains(track)) {
    		tracks.remove(track);
    	}
    	else {
    		System.out.println("Track not found.");
    	}
    }
    
    public int getLength() {
    	int sum=0;
    	for(Track track : tracks) {
    		sum+=track.getLength();
    	}
    	return sum;
    }
    
    public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD Director: " + this.getDirector());
		System.out.println("Tracks:");
		for(Track track : tracks) {
			track.play();
		}
	}
    
    public String toString() {
		return "CD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + "$";
	}
}
