package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    public static void showMenu() {
    	System.out.println("AIMS: ");
    	System.out.println("--------------------------------");
    	System.out.println("1. View store");
    	System.out.println("2. Update store");
    	System.out.println("3. See current cart");
    	System.out.println("0. Exit");
    	System.out.println("--------------------------------");
    	System.out.println("Please choose a number: 0-1-2-3");
    	}
    public static void showMenu1() {
    	System.out.println("AIMS: ");
    	System.out.println("--------------------------------");
    	System.out.println("1. View store");
    	System.out.println("2. Update store");
    	System.out.println("3. See current cart");
    	System.out.println("0. Exit");
    	System.out.println("--------------------------------");
    	System.out.println("Please choose a number: 0-1-2-3");
    	}
    public static void mediaDetailsMenu() {
    	System.out.println("Options: ");
    	System.out.println("--------------------------------");
    	System.out.println("1. Add to cart");
    	System.out.println("2. Play");
    	System.out.println("0. Back");
    	System.out.println("--------------------------------");
    	System.out.println("Please choose a number: 0-1-2");
    	}
    public static void cartMenu() {
    	System.out.println("Options: ");
    	System.out.println("--------------------------------");
    	System.out.println("1. Filter media in cart");
    	System.out.println("2. Sort media in cart");
    	System.out.println("3. Remove media from cart");
    	System.out.println("4. Play a media");
    	System.out.println("5. Place order");
    	System.out.println("0. Back");
    	System.out.println("--------------------------------");
    	System.out.println("Please choose a number: 0-1-2-3-4-5");}
    
    // Add Media
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println(media.getTitle() + " has been added to the store.");
        } else {
            System.out.println(media.getTitle() + " is already in the store.");
        }
    }

    // Remove Media
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(media.getTitle() + " was not found in the store.");
        }
    }

    // Display Store
    public void displayStore() {
        System.out.println("**********************STORE**********************");
        for (Media media : itemsInStore) {
            System.out.println(media);
        }
        System.out.println("**************************************************");
    }
}