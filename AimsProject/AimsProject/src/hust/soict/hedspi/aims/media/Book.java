package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors;

    // Constructor cho Book kế thừa từ Media
    public Book(String title, String category, float cost) {
        super(title, category, cost);  // Gọi constructor của Media
        this.authors = new ArrayList<>();
    }

    // Getter và Setter cho 'authors'
    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    // Phương thức thêm tác giả nếu tác giả chưa có trong danh sách
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {  // Kiểm tra xem tác giả đã có trong danh sách chưa
            authors.add(authorName);
            System.out.println(authorName + " đã được thêm vào danh sách tác giả.");
        } else {
            System.out.println(authorName + " đã là tác giả của cuốn sách.");
        }
    }

    // Phương thức xóa tác giả nếu tác giả có trong danh sách
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {  // Kiểm tra xem tác giả có trong danh sách không
            authors.remove(authorName);
            System.out.println(authorName + " đã được xóa khỏi danh sách tác giả.");
        } else {
            System.out.println(authorName + " không phải là tác giả của cuốn sách này.");
        }
    }

    // Phương thức toString để in thông tin của Book
    @Override
    public String toString() {
        return "Book - " + getTitle() + " - " + getCategory() + " - Authors: " + authors + " - " + getCost() + " $";
    }
}
