public class Book {
    private String title, author, year;
    private int price;

    public Book(String title, String author, int price, String year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;

    }

    public void setDiscount(int discount) {
        this.price = price - discount;
    }

    public void showDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
