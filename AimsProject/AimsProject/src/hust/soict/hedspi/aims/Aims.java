package hust.soict.hedspi.aims;


import java.util.ArrayList;


import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Aims {
public static void main(String[] args) {
	ArrayList<Media> mediaList = new ArrayList<>();

	Book book = new Book(0, null, null, 0);
	DigitalVideoDisc dvd = new DigitalVideoDisc(0, null, null, 0, null);
	CompactDisc cd = new CompactDisc(0, null, null, 0, null, null);
	mediaList.add(book);
	mediaList.add(cd);
	mediaList.add(dvd);
	for (Media media : mediaList) {
	    System.out.println(media.toString());
	}

}
}