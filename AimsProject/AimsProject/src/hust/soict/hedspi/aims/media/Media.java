package hust.soict.hedspi.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    private static int nbMedia = 0;

    // Constructor cho lớp Media
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = generateId();  // Gọi phương thức tạo ID
    }

    // Phương thức tạo ID tự động (tính theo số lượng đối tượng)
    private static int generateId() {
        nbMedia++;
        return nbMedia;
    }

    // Getter và Setter cho các thuộc tính
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Phương thức toString để in thông tin chung
    @Override
    public String toString() {
        return "ID: " + id + " - " + title + " - " + category + " - " + cost + " $";
    }

    // Phương thức kiểm tra tiêu đề
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
}
