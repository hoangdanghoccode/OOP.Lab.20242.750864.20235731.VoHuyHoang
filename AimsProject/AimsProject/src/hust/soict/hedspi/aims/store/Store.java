package hust.soict.hedspi.aims.store;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Store {
 
     private ArrayList<Media> itemsInStore = new ArrayList<Media>();
     
     public void addMedia(Media media) {
    	 if(!itemsInStore.contains(media)) {
    		 itemsInStore.add(media);
    	 }
    	 else {
    		 System.out.println("Media already exists.");
    	 }
     }

     public void removeMedia(Media media) {
     	if(itemsInStore.contains(media)) {
     		itemsInStore.remove(media);
     	}
     	else {
     		System.out.println("Media not found.");
     	}
     }
  
}
