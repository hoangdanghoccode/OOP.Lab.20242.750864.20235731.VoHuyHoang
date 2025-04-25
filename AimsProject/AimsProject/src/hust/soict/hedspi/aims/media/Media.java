package hust.soict.hedspi.aims.media;

public abstract class Media {
    private static int nbMedia = 0;
    private final int id;
    private final String title;
    private final String category;
    private final float cost;

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbMedia;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return this.getTitle().equalsIgnoreCase(media.getTitle());
    }

    @Override
    public int hashCode() {
        return title.toLowerCase().hashCode();
    }
}
