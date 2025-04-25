package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    // Thêm một Media (DVD, CD, hoặc Book)
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added to the cart.");
        } else {
            System.out.println(media.getTitle() + " is already in the cart.");
        }
    }

    // Xóa một Media khỏi giỏ hàng
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println(media.getTitle() + " has been removed from the cart.");
        } else {
            System.out.println(media.getTitle() + " is not in the cart.");
        }
    }

    // Tính tổng chi phí của tất cả media
    public float totalCost() {
        float total = 0;
        for (Media m : itemsOrdered) {
            total += m.getCost();
        }
        return total;
    }

    // In ra danh sách media trong giỏ hàng
    public void printCart() {
        System.out.println("********** CART **********");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media m = itemsOrdered.get(i);
            System.out.println((i + 1) + ". " + m.getTitle() + " - " + m.getCost() + " $");
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************");
    }
}
