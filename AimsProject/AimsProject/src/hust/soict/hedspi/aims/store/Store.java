package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Store {
  private static final int MAX_ITEMS = 100;
  private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_ITEMS];
  private int qty = 0;
  
  public void addDVD(DigitalVideoDisc disc) {
	  if (qty >= MAX_ITEMS) {
          System.out.println("The store is full. Cannot add more DVDs.");
      } else {
          itemsInStore[qty] = disc;
          qty++;
          System.out.println(disc.getTitle() + " has been added to the store.");
      }
}
  public void removeDVD(DigitalVideoDisc disc) {
      boolean found = false;
      for (int i = 0; i < qty; i++) {
          if (itemsInStore[i].equals(disc)) {
              found = true;
              for (int j = i; j < qty - 1; j++) {
                  itemsInStore[j] = itemsInStore[j + 1];
              }
              itemsInStore[qty - 1] = null;
              qty--;
              System.out.println(disc.getTitle() + " has been removed from the store.");
              break;
          }
      }
      if (!found) {
          System.out.println("DVD not found in the store.");
      }
  }
  
  public void displayStore() {
      System.out.println("DVDs available in the store:");
      for (int i = 0; i < qty; i++) {
          System.out.println((i + 1) + ". " + itemsInStore[i].toString());
      }
  }
  
}
