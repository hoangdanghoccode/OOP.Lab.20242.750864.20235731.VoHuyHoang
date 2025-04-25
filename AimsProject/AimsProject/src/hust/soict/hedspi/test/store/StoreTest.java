package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store myStore = new Store();

        // Tạo một vài DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        // Thêm DVD vào cửa hàng
        myStore.addDVD(dvd1);
        myStore.addDVD(dvd2);
        myStore.addDVD(dvd3);

        // Hiển thị danh sách DVD trong cửa hàng
        myStore.displayStore();

        // Xóa 1 DVD
        myStore.removeDVD(dvd2);

        // Hiển thị lại sau khi xóa
        myStore.displayStore();
    }
}