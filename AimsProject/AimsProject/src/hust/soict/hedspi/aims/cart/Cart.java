package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered=0;
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    	if(qtyOrdered<MAX_NUMBERS_ORDERED) {
    		itemsOrdered[qtyOrdered]=disc;
    		qtyOrdered+=1;
    		System.out.println( disc.getTitle() + " has been added");
    		
    	}
    	else {
    	System.out.println("The cart is almost full");
    	}
    	
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc... discs) {
        for (DigitalVideoDisc disc : discs) {
            this.addDigitalVideoDisc(disc);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	this.addDigitalVideoDisc(dvd1);
    	this.addDigitalVideoDisc(dvd2);
    }
  
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    	boolean found = false;
    	for(int i=0;i<qtyOrdered;i++) {
    		if(itemsOrdered[i].equals(disc)) {
    			found = true;
    			for(int j=i;j<qtyOrdered-1;j++) {
    				itemsOrdered[j]=itemsOrdered[j+1];
    			}
    			itemsOrdered[qtyOrdered-1]=null;
    			qtyOrdered--;
    			System.out.println(disc.getTitle() + " has been removed");
    			break;
    		}
    	}
    	if(!found) {
    		System.out.println("The disc was not found in the cart");
    	}
    }
    
    public float calculateCost() {
    	float sum=0;
    	for(int i=0;i<qtyOrdered;i++) {
    		sum+=itemsOrdered[i].getCost();
    	}
    	return sum;
    }
    
    public void display() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for(int i=0;i<qtyOrdered;i++) {
    		  System.out.println((i+1) + ". " +itemsOrdered[i].toString());
        }
    	System.out.printf("Total cost: %.2f \n", calculateCost());
    	System.out.println("***************************************************");
    	}
    
    public DigitalVideoDisc searchById(int id) {
    	for(DigitalVideoDisc dvd : itemsOrdered) {
    		if(dvd.getId()==id) {
    			System.out.println("Found: " + dvd.toString());
    			return dvd;
    		}
    	}
    	System.out.println("No DVD found with ID: " + id);
    	return null;
    }
    
    public DigitalVideoDisc searchByTitle(String title) {
		for(DigitalVideoDisc dvd: itemsOrdered) {
			if(dvd.isMatch(title)) {
				System.out.println("Found: " + dvd.toString());
    			return dvd;
			}
		}
		System.out.println("No DVD found with title: " + title);
    	return null;
	}
    }