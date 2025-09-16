//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Book myBookOne = new Book("Lord of the rings", "Tolkien", 957, "Fantasy");
        Book myBookTwo = new Book("Hitchhiker's Guide", "Adams", 600, "SciFi");
        Book myBookThree = new Book("Satis Politio", "Åkesson", 275, "Autobiography");

        myBookOne.info();
        myBookOne.isFantasy();

        myBookTwo.info();
        myBookTwo.isSciFi();

        myBookThree.info();
        myBookThree.isAutobiography();

        compareBooks(myBookOne, myBookTwo);
        compareBooks(myBookThree, myBookOne);
    }

    static void compareBooks(Book myBookOne, Book myBookTwo) {
            if (myBookOne.pages == myBookTwo.pages) {
                System.out.println("Books pages are equal");
            }
            else if (myBookOne.pages > myBookTwo.pages) {
                System.out.println("First book pages are greater than second book pages");
            }
            else if (myBookOne.pages < myBookTwo.pages) {
                System.out.println("Second book pages are greater than first book pages");
            }
    }

    static void example1() {
        Car myCar = new Car();
        myCar.brand = "Audi";
        myCar.model = "A4";
        myCar.year = 2000;
        System.out.println(myCar.brand);
        System.out.println(myCar.model);
        System.out.println(myCar.year);

        myCar.startEngine();
        myCar.info();
    }

    static void example2() {
        // Att föredra, samt fokus resten av kursen
        Car myCarTwo = new Car("Toyota", "Carina 2", 1991);
        myCarTwo.info();
//        System.out.println(myCarTwo.brand);
//        System.out.println(myCarTwo.model);
//        System.out.println(myCarTwo.year);
    }

    static void example3() {
        String brand = "Volvo";
        String model = "740";
        int year = 2002;
        Car myCar3 = new Car(brand, model, year);
        myCar3.info();
        System.out.println("----");
        System.out.println(myCar3.toString());
        myCar3.brand = "BMW";
        System.out.println("myCar3: " + myCar3.toString());
    }

    static void example4() {
        Book book1 = new Book("Lord of the rings", "Tolkien", 958, "SciFi");
        book1.info();
    }
}