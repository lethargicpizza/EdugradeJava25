public class Book {
    String title;
    String author;
    int pages;
    String genre;

    public Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    void info() {
        System.out.println("Book title: " + title + ", author: " + author);

        double summary = pages * 7.5;
        System.out.println("Estimated time to read: " + summary + " days");
        System.out.println("Fantasy? " + isFantasy());

        System.out.println("-----------");
    }

    boolean isHorror() {
        return genre == "Horror";
    }

    boolean isSciFi() {
        return genre == "Sci-Fi";
    }
    boolean isChildren() {
        return genre == "Children";
    }

    boolean isFantasy() {
        return genre == "Fantasy";
    }

    boolean isAutobiography() {
        return genre == "Autobiography";
    }
}
