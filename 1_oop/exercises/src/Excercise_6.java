import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise_6 {

    public static void main(String[] args) {

        // Övningsuppgift 1:
        int[] uppgift1 = {5, 4, 8, 7, 5, 8};

        System.out.println("Summa: " + sum(uppgift1));
        System.out.println("Summa jämna: " + countEven(uppgift1));
        System.out.println("Minsta värdet: " + minValue(uppgift1));


        // Övningsuppgift 2:
        int[] uppgift2 = {4, 8, 2, 5, 1, 3, 5, 9, 7, 6};

        int[] sorterade = sort(uppgift2);
        System.out.println("Sorterat: ");
        for (int i = 0; i < uppgift2.length; i++) {
            System.out.println(sorterade[i]);
        }

        int tal = 5;
        int index = indexOf(uppgift2, tal);
        System.out.println("Index för " + tal + ": " + index);

        System.out.println("Antal gånger talet återkommer:" + numberOfElements(uppgift2, 5));


        // Övningsuppgift 3:
        List<Book> books = new ArrayList<>();
        books.add(new Book("Hitchhikers", "Douglas Adams", 400, "1996"));
        books.add(new Book("Emil i Lönneberga", "Astrid Lindgren", 400, "N/A"));
        books.add((new Book("Boken om Pippi Långstrump", "Astrid Lindgren", 400, "N/A")));

        System.out.println("Alla böcker:");
        showAllBooks(books);
        System.out.println("Alla böcker efter borttag:");
        showAllBooks(removeBook(books, "Hitchhikers"));

        System.out.println("Enbart Astrid Lindgren:");
        showAllBooks(filterBook(books, "Astrid Lindgren"));


        // Övningsuppgift 4:
        Course c = new Course("Java-programmering");
        c.addStudent(new Student("Daniel", "A", 20));
        c.addStudent(new Student("Rufus", "A", 19));
        c.addStudent(new Student("Sven", "B", 21));
        c.addStudent(new Student("Jack", "C", 22));
        c.addStudent(new Student("Orvar", "C", 23));
        c.addStudent(new Student("Charles", "C", 24));

        List<Student> studentsWithGrade = new ArrayList<>();
        studentsWithGrade = c.getStudentsWithGrades("C");

        System.out.println("Students with the grade C:");
        for (int j = 0; j < studentsWithGrade.size(); j++) {
            if (studentsWithGrade.get(j).getGrade() == "C") {
                System.out.println(studentsWithGrade.get(j).getName());
            }
        }


        // Övningsuppgift 5:
        Playlist p = new Playlist();
        p.addSong(new Song("Song A", "N/A", 220));
        p.addSong(new Song("Song B", "N/A", 150));
        p.addSong(new Song("Song C", "N/A", 200));

        System.out.println("Total length: " + p.getTotalSeconds());

        p.printPlaylist();

        Playlist sorted = p.sort();
        sorted.printPlaylist();
        System.out.println("----");
        Playlist filtered = p.filterPlaylistByTitle("Song C");
        filtered.printPlaylist();


        // Övningsuppgift 6:
        Library l = new Library();
        l.listAvaliableBooks();
        System.out.println("------");
        l.lendBook("Pippi Långstrump");
        l.listAvaliableBooks();

        System.out.println("Söker efter Douglas Adams:");
        List<Book> found = l.findBooksByAuthor("Douglas Adams");
        for (Book b : found) {
            System.out.println(b.getTitle());
        }
    }

    public static List<Book> removeBook(List<Book> book, String title) {
        for (int i= book.size()-1; i>=0; i--) {

            if (book.get(i).getTitle().equals(title)) {
                book.remove(book.get(i));
            }
        }

        return book;
    }

    public static List<Book> filterBook(List<Book> book, String author) {
        for (int i= book.size()-1; i>=0; i--) {
            if (!book.get(i).getAuthor().equals(author)) {
                book.remove(book.get(i));
            }
        }
        return book;
    }

    public static void showAllBooks(List<Book> bookTitle) {
        for (int i = 0; i < bookTitle.size(); i++) {
            System.out.println(bookTitle.get(i).getTitle());
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int countEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        return sum;
    }

    public static int minValue(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static int numberOfElements(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }
}
