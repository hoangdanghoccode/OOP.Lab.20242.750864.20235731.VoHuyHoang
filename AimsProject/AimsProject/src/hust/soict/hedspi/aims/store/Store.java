package hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    // Thêm một Media (DVD, Book, CD, v.v.) vào Store
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println(media.getTitle() + " has been added to the store.");
        } else {
            System.out.println(media.getTitle() + " is already in the store.");
        }
    }

    // Xóa một Media khỏi Store
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(media.getTitle() + " is not in the store.");
        }
    }

    // In danh sách media trong store
    public void printStore() {
        System.out.println("********** STORE **********");
        for (int i = 0; i < itemsInStore.size(); i++) {
            Media m = itemsInStore.get(i);
            System.out.println((i + 1) + ". " + m.getTitle() + " - " + m.getCost() + " $");
        }
        System.out.println("****************************");
    }

    // Truy cập danh sách để dùng ở nơi khác (nếu cần)
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}
