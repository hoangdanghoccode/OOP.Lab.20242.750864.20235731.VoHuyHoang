package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private final ArrayList<String> authors = new ArrayList<>();

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return this.getTitle().equals(book.getTitle());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
