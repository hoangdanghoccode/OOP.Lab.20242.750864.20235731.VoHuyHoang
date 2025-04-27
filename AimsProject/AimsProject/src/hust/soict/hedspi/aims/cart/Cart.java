package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Cart {
    
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    
    public void addMedia(Media media) {
    	if(!itemsOrdered.contains(media)) {
    		itemsOrdered.add(media);
    	}
    	else {
    		System.out.println("Media already exists.");
    	}
    }
    
    public void removeMedia(Media media) {
    	if(itemsOrdered.contains(media)) {
    		itemsOrdered.remove(media);
    	}
    	else {
    		System.out.println("Media not found.");
    	}
    }
    
    public float calculateCost() {
    	float sum=0;
    	for(Media media : itemsOrdered) {
    		sum+=media.getCost();
    	}
    	return sum;
    }
    
    
    }