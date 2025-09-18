public class Book {
    private String title, author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
    }
}
