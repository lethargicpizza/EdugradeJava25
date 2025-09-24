import java.text.SimpleDateFormat;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double a = 5;
        double b = 10;

        SimpleCalculator simpleCalculator = new SimpleCalculator(a, b);

        System.out.println(simpleCalculator.add(a, b)  );
        System.out.println(simpleCalculator.sub(a, b));
        System.out.println(simpleCalculator.mul(a, b));
        System.out.println(simpleCalculator.div(a, b));

        Person person = new Person("Per", 45, "Västerhaninge");
        System.out.println("Namn: " + person.getName()  );
        System.out.println("Ålder: " + person.getAge());
        System.out.println("Stad: " + person.getCity());

        Car car1 = new Car();
        Car car2 = new Car("Volvo", "V70", "2013");

        car1.displayCarInfo();
        car2.displayCarInfo();

        Book book = new Book("Liftarens guide till galaxen", "Douglas Adams", 500, "1996");
        book.showDetails();

        book.setDiscount(10);
        book.showDetails();

        Student student = new Student("Per", "Ö", 45);
        student.showDetails();

        student.setGrade("A");
        student.showDetails();

        Team t = new Team(3);
        t.addMember(new Player("Per"));
        t.addMember(new Player("Nils"));
        t.addMember(new Player("Carl"));

        Player[] myTeam = t.getMembers();
        for (int i = 0; i < myTeam.length; i++) {
            System.out.println(myTeam[i].getName());
        }

        Zoo myZoo = new Zoo();
        myZoo.addAnimal(new Animal("Per"));
        myZoo.addAnimal(new Animal("Fredrik"));

        List<Animal> myAnimals = myZoo.getAnimals();
        for (int i = 0; i < myAnimals.size(); i++) {
            System.out.println(myAnimals.get(i).getSpieces());
        }


        School school = new School(2);

        school.addStudent(new Student("Alice", "A", 20));
        school.addStudent(new Student("Bob", "B", 30));

        System.out.println("Students:");
        school.listStudents();

        school.addTeacher(new Teacher("Mr. Smith"));
        school.addTeacher(new Teacher("Mrs. Johnson"));

        System.out.println("Teachers:");
        school.listTeachers();


    }
}